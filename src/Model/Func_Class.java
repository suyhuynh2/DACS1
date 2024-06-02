package Model;

import DAO.DB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class Func_Class {

    public void displayIcon(int width, int height, String imagePath, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
    }

    public void displayImage(String path, JLabel jLabel, byte[] imagebyte) {
        ImageIcon icon;
        if (imagebyte != null) {
            icon = new ImageIcon(imagebyte);
        } else {
            icon = new ImageIcon(path);
        }

        int labelWidth = jLabel.getWidth();
        int labelHeight = jLabel.getHeight();

        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jLabel.setIcon(scaledIcon);
    }

    public String selectImage() {
        String path = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\ADMIN\\Pictures\\anh"));
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", "jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int fileState = fileChooser.showSaveDialog(null);

        if (fileState == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
    }

    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getJDBCConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void customTable(JTable table) {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);
    }

    public void customTableHeader(JTable table, Color b_color, Integer fontSize) {
        table.getTableHeader().setBackground(b_color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));
        table.getTableHeader().setOpaque(false);
    }

    public int countData(String tableName) {
        int total = 0;
        ResultSet rs;
        Statement st;

        try {
            st = DB.getJDBCConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) as total FROM `" + tableName + "`");
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public String enCode (String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }
    
    public String deCode (String str) {
        return new String(Base64.getDecoder().decode(str));
    }
}
