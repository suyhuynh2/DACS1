package Model;

import DAO.DB;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Book {

    private Integer id;
    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_receive;
    private String description;
    private byte[] image;

    Model.Func_Class func = new Func_Class();

    public Book() {
    }

    ;

    public Book(Integer id, String isbn, String name, Integer author_id,
            Integer genre_id, Integer quantity, String publisher, double price,
            String date_receive, String description, byte[] image) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
        this.date_receive = date_receive;
        this.description = description;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_receive() {
        return date_receive;
    }

    public void setDate_receive(String date_receive) {
        this.date_receive = date_receive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void addBook(String isbn, String name, Integer author_id,
            Integer genre_id, Integer quantity, String publisher, double price,
            String date_receive, String description, byte[] image) {
        String insertQuery = "INSERT INTO `books` (`isbn`, `name`, `author_id`, `genre_id`, `quantity`, `publisher`, `price`, `date_received`, `description`, `image`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(insertQuery);
            ps.setString(1, isbn);
            ps.setString(2, name);
            ps.setInt(3, author_id);
            ps.setInt(4, genre_id);
            ps.setInt(5, quantity);
            ps.setString(6, publisher);
            ps.setDouble(7, price);
            ps.setString(8, date_receive);
            ps.setString(9, description);
            ps.setBytes(10, image);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Added", "add book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added", "add book", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editBook(int id, String name, Integer author_id, Integer genre_id,
            Integer quantity, String publisher, double price, String date_receive, String description, byte[] image) {

        String updateQuery;
        PreparedStatement ps;

        try {
            if (image != null) {
                updateQuery = "UPDATE `books` SET `name` = ?, `author_id` = ?, `genre_id` = ?, `quantity` = ?, `publisher` = ?, `price` = ?, `date_received` = ?, `description` = ?, `image` = ? WHERE `id` = ?";

                ps = DB.getJDBCConnection().prepareStatement(updateQuery);
                //ps.setString(1, isbn);
                ps.setString(1, name);
                ps.setInt(2, author_id);
                ps.setInt(3, genre_id);
                ps.setInt(4, quantity);
                ps.setString(5, publisher);
                ps.setDouble(6, price);
                ps.setString(7, date_receive);
                ps.setString(8, description);
                ps.setBytes(9, image);
                ps.setInt(10, id);

            } else {
                updateQuery = "UPDATE `books` SET `name` = ?, `author_id` = ?, `genre_id` = ?, `quantity` = ?, `publisher` = ?, `price` = ?, `date_received` = ?, `description` = ? WHERE `id` = ?";

                ps = DB.getJDBCConnection().prepareStatement(updateQuery);
                //ps.setString(1, isbn);
                ps.setString(1, name);
                ps.setInt(2, author_id);
                ps.setInt(3, genre_id);
                ps.setInt(4, quantity);
                ps.setString(5, publisher);
                ps.setDouble(6, price);
                ps.setString(7, date_receive);
                ps.setString(8, description);
                ps.setInt(9, id);

            }

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Edit", "edit book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Edit", "edit book", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeBook(int id) {
        String removeQuery = "DELETE FROM `books` WHERE `id` = ?";

        try {
            PreparedStatement ps = DB.getJDBCConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Books Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Deleted", "remove ", 2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isISBNexists(String isbn) {
        String query = "SELECT * FROM `books` WHERE `isbn` = '" + isbn + "'";
        ResultSet rs = func.getData(query);
        try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;

    }

    public Book searchBookById_ISBN(int id, String isbn) {
        String query = "SELECT * FROM `books` WHERE `id` = '" + id + "' or `isbn` = '" + isbn + "'";
        ResultSet rs = func.getData(query);
        Book book = null;
        try {
            if (rs.next()) {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getString(10), rs.getBytes(11));
            } else {
                return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    public ArrayList<Book> booksList(String query) {
        ArrayList<Book> bList = new ArrayList<>();
        try {
            if (query.equals("")) {
                query = "SELECT * FROM `books`";
            }
            ResultSet rs = func.getData(query);
            Book book;
            while (rs.next()) {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getString(10), rs.getBytes(11));
                bList.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bList;
    }

    public Book getBookById(Integer id) throws SQLException {
        String query = "SELECT * FROM `books` WHERE `id` = " + id;
        ResultSet rs = func.getData(query);

        if (rs.next()) {
            return new Book(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                    rs.getString(9), rs.getString(10), rs.getBytes(11));
        } else {
            return null;
        }
    }

    public void displayBooksCover(JLabel[] labels_tab) {
        ResultSet rs;
        Statement st;

        try {
            st = DB.getJDBCConnection().createStatement();
            rs = st.executeQuery("SELECT `image` FROM `books` order by id desc LIMIT 5");

            // Tạo một danh sách để lưu trữ các ảnh từ kết quả truy vấn
            List<byte[]> imagesList = new ArrayList<>();

            // Lặp qua kết quả truy vấn và thêm các ảnh vào danh sách
            while (rs.next()) {
                byte[] image = rs.getBytes("image");
                imagesList.add(image);
            }
            // Hiển thị từng ảnh trên các nhãn tương ứng
            for (int i = 0; i < labels_tab.length && i < imagesList.size(); i++) {
                byte[] image = imagesList.get(i);
                func.displayImage(null, labels_tab[i], image);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setQuantity_Minus_One(int book_id, int quantity) {
        String updateQuantityQuery;
        PreparedStatement ps;

        try {
            
                updateQuantityQuery = "UPDATE `books` SET `quantity` = ? WHERE `id` = ?";

                ps = DB.getJDBCConnection().prepareStatement(updateQuantityQuery);

                ps.setInt(1, quantity);
                ps.setInt(2, book_id);

                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "The Quantity - 1", "Edit Book Quantity", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Book Quantity Not Edit", "Edit Book Quantity", 2);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
