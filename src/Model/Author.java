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
public class Author {

    Model.Func_Class func = new Func_Class();

    private int id;
    private String fistName;
    private String lastName;
    private String expertise;
    private String about;

    public Author() {
    }

    ;

    public Author(int id, String fistName, String lastName, String field_Of_Expertise, String about) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.expertise = field_Of_Expertise;
        this.about = about;
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

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String field_Of_Expertise) {
        this.expertise = field_Of_Expertise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void addAuthor(String fname, String lname, String expertise, String about) {
        String insertQuery = "INSERT INTO `author` (`firstName`, `lastName`, `expertise`, `about`) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Added", "add author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Added", "add author", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editAuthor(int id, String fname, String lname, String expertise, String about) {
        String editQuery = "UPDATE `author` SET `firstname` = ?, `lastname` = ?, `expertise` = ?, `about` = ? WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            ps.setInt(5, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Edited", "edit authour", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Edited", "edit author", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeAuthor(int id) {
        String removeQuery = "DELETE FROM `author` WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Delete", "remove author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Deleted", "remove author", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Author> authorsList() {
        ArrayList<Author> aList = new ArrayList<>();
        try {
            ResultSet rs = func.getData("SELECT * FROM `author`");
            Author author;
            while (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("expertise"), rs.getString("about"));
                aList.add(author);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aList;
    }

    public Author getAuthorById(Integer id) {
        ResultSet rs = func.getData("SELECT * FROM `author` where id = " + id);
        Author author = null;
        try {
            if (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("expertise"), rs.getString("about"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return author;
    }

}
