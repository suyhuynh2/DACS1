package Model;

import DAO.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Issue_Book {

    private int book_id;
    private int member_id;
    private String status;
    private String issue_date;
    private String return_date;
    private String note;

    Book book = new Book();
    Func_Class func = new Func_Class();

    public Issue_Book() {
    }

    public Issue_Book(int book_id, int member_id, String status, String issue_date, String return_date, String note) {
        this.book_id = book_id;
        this.member_id = member_id;
        this.status = status;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.note = note;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void addIssue(int book_id, int member_id, String status, String issue_date, String return_date, String note) {
        String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(insertQuery);
            ps.setInt(1, book_id);
            ps.setInt(2, member_id);
            ps.setString(3, status);
            ps.setString(4, issue_date);
            ps.setString(5, return_date);
            ps.setString(6, note);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Issue Added", "add issue", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Issue Not Added", "add issue", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateIssue(int book_id, int member_id, String status, String issue_date, String return_date, String note) {
        String updateQuery = "UPDATE `issue_book` SET `status` = ?, `return_date` = ?, `note` = ? WHERE `book_id` = ? AND `member_id` = ? AND `issue_date` = ?";
        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(updateQuery);

            ps.setString(1, status);
            ps.setString(2, return_date);
            ps.setString(3, note);
            ps.setInt(4, book_id);
            ps.setInt(5, member_id);
            ps.setString(6, issue_date);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Status Update", "Book Issue", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Status Not Update", "Book Issue", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkBookAvailability(int book_id) {
        boolean availability = false;
        try {
            Book selectedBook = book.getBookById(book_id);
            int quantity = selectedBook.getQuantity();

            int issued_book_count = countData(book_id);

            if (quantity > issued_book_count) {
                availability = true;
            } else {
                availability = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return availability;
    }

    public int countData(int book_id) {
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;

        try {
            ps = DB.getJDBCConnection().prepareStatement("SELECT COUNT(*) as total FROM `issue_book` WHERE book_id = ? and `status` = 'issued'");

            ps.setInt(1, book_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public ArrayList<Issue_Book> issuedBooksList(String status) {

        ArrayList<Issue_Book> issueBookList = new ArrayList<>();
        String query;

        if (status.equals("")) {
            query = "SELECT * FROM `issue_book`";
        } else {
            query = "SELECT * FROM `issue_book` WHERE `status` = '" + status + "'";

        }

        try {
            ResultSet rs = func.getData(query);

            Issue_Book issueBook;
            while (rs.next()) {
                issueBook = new Issue_Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
                issueBookList.add(issueBook);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return issueBookList;
    }

    public void removeFromIssue(int book_id, int member_id, String issued_date) {
        String removeQuery = "DELETE FROM `issue_book` WHERE `book_id` = ? AND `member_id` = ? AND `issue_date` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(removeQuery);

            ps.setInt(1, book_id);
            ps.setInt(2, member_id);
            ps.setString(3, issued_date);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Not Deleted", "remove ", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Issue_Book> issuedBooksOfMemberID(int id) {
        ArrayList<Issue_Book> issuedBookOfMemberIDList = new ArrayList<>();
        try {
            ResultSet rs = func.getData("SELECT * FROM `issue_book` WHERE `member_id` = " + id);

            Issue_Book issueBookOfMemberID;
            while (rs.next()) {
                issueBookOfMemberID = new Issue_Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
                issuedBookOfMemberIDList.add(issueBookOfMemberID);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return issuedBookOfMemberIDList;
    }
}
