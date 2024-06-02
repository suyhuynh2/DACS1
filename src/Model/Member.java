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
public class Member {

    Model.Func_Class func = new Func_Class();

    private int id;
    private String fistName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private byte[] imagePath;

    public Member() {
    }

    ;

    public Member(int id, String fistName, String lastName, String phone, String email, String gender, byte[] imagePath) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.imagePath = imagePath;
    }

    public Func_Class getFunc() {
        return func;
    }

    public void setFunc(Func_Class func) {
        this.func = func;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getImagePath() {
        return imagePath;
    }

    public void setImagePath(byte[] imagePath) {
        this.imagePath = imagePath;
    }

    public void addMember(String fname, String lname, String phone, String email, String gender, byte[] imagePath) {
        String insertQuery = "INSERT INTO `members` (`firstName`, `lastName`, `phone`, `email`, `gender`, `image`) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, imagePath);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Added", "add member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add member", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editMember(Integer id, String fname, String lname, String phone, String email, String gender, byte[] imagePath) {
        String editQuery = "UPDATE `members` SET `firstname` = ?, `lastname` = ?, `phone` = ?, `email` = ?, `gender` = ?, `image` = ? WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, imagePath);
            ps.setInt(7, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeMember(int id) {
        String removeQuery = "DELETE FROM `members` WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Delete", "remove member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove member", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Member getMemberById(Integer id) throws SQLException {
        String query = "SELECT * FROM `members` WHERE `id` = " + id;
        ResultSet rs = func.getData(query);

        if (rs.next()) {
            return new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBytes(7));
        } else {
            return null;
        }
    }

    public ArrayList<Member> membersList(String query) {
        ArrayList<Member> mList = new ArrayList<>();
        try {

            if (query.equals("")) {
                query = "SELECT * FROM `members`";
            }

            ResultSet rs = func.getData(query);
            Member member;
            while (rs.next()) {
                member = new Member(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("phone"), rs.getString("email"), rs.getString("gender"), rs.getBytes("image"));
                mList.add(member);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mList;
    }

    public int getIdMemberByPhone(String phone) {
        int id = 0;
        String query = "SELECT `id` FROM `members` WHERE `phone` = '" + phone + "'";
        ResultSet rs = func.getData(query);
        try {
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID ERROR: " + e.getMessage(), "ID Error", JOptionPane.ERROR_MESSAGE);
        }
        return id;
    }
}
