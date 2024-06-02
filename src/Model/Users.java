package Model;

import DAO.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Users {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String numberPhone;
    private String userName;
    private String password;
    private String userType;

    Func_Class func = new Func_Class();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Func_Class getFunc() {
        return func;
    }

    public void setFunc(Func_Class func) {
        this.func = func;
    }

    public Users() {
    }

    public Users(int id, String firstName, String lastName, String email, String numberPhone, String userName, String password, String userType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.numberPhone = numberPhone;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", numberPhone=" + numberPhone + ", userName=" + userName + ", password=" + password + ", userType=" + userType + ", func=" + func + '}';
    }

    public void addUser(String fname, String lname, String email, String numberPhone, String username, String password, String user_type) {
        String enCodeUser = func.enCode(username);
        String enCodePass = func.enCode(password);

        String insertQuery = "INSERT INTO `users_table` (`firstname`, `lastName`, `email`, `phone`, `username`, `password`, `user_type`) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);  // Check email value
            ps.setString(4, numberPhone);  // Check phone value
            ps.setString(5, enCodeUser);
            ps.setString(6, enCodePass);
            ps.setString(7, user_type);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "User Added", "add user", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Added", "add user", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Users> usersList() {
        ArrayList<Users> uList = new ArrayList<>();
        try {
            ResultSet rs = func.getData("SELECT * FROM `users_table` where `user_type` <> 'Owner'");
            Users users;
            while (rs.next()) {
                users = new Users(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"), rs.getString("phone"), rs.getString("username"), rs.getString("password"), rs.getString("user_type"));
                uList.add(users);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uList;
    }

    public boolean checkUserNameExists(String username) {
        ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `username` = '" + username + "'");
        boolean exists = false;
        try {
            if (rs.next()) {
                exists = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exists;
    }

    public void removeUser(int id) {
        String removeQuery = "DELETE FROM `users_table` WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "User Delete", "remove user", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Deleted", "remove user", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editUser(int id, boolean checkUserName, boolean checkPassword, String fname, String lname, String email, String phone, String username, String password, String userType) {
        String editQuery = "UPDATE `users_table` SET `firstname` = ?, `lastname` = ?, `email` = ?, `phone` = ?,`username` = ?, `password` = ?, `user_type` = ? WHERE `id` = ?";

        String encodedUsername = checkUserName ? func.enCode(username) : username;
        String encodedPassword = checkPassword ? func.enCode(password) : password;

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, encodedUsername);
            ps.setString(6, encodedPassword);
            ps.setString(7, userType);
            ps.setInt(8, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "User Edited", "Edit User", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Edited", "Edit User", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Editing User: " + ex.getMessage(), "Edit User Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getUserNameSQL(int id) {
        String userName = "";
        ResultSet rs = func.getData("SELECT `username` FROM `users_table` WHERE `id` = " + id);
        try {
            while (rs.next()) {
                userName = rs.getString("username");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Fetching Username: " + e.getMessage(), "Fetch Username Error", JOptionPane.ERROR_MESSAGE);
        }
        return userName;
    }

    public String getPassWordSQL(int id) {
        String passWord = "";
        ResultSet rs = func.getData("SELECT `password` FROM `users_table` WHERE `id` = " + id);
        try {
            while (rs.next()) {
                passWord = rs.getString("password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Fetching Password: " + e.getMessage(), "Fetch Password Error", JOptionPane.ERROR_MESSAGE);
        }
        return passWord;
    }

    public Users tryLogin(String username, String password) {
        String userName = func.enCode(username);
        String passWord = func.enCode(password);
        ResultSet rs = func.getData("SELECT * FROM `users_table` where username = '" + userName + "' and password = '" + passWord + "'");
        Users users = null;
        try {
            if (rs.next()) {
                users = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("lastName"), rs.getString("email"), rs.getString("phone"), rs.getString("password"), rs.getString("user_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }
    public String getPhone (int id) {
        String phone = "";
        ResultSet rs = func.getData("SELECT `phone` FROM `users_table` WHERE `id` = " + id);
        try {
            while (rs.next()) {
                phone = rs.getString("phone");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Phone ERORR: " + e.getMessage(), "Phone Error", JOptionPane.ERROR_MESSAGE);
        }
        return phone;
    }
}
