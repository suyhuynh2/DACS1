package View;

import Model.Func_Class;
import Model.Member;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class EditBookForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    Model.Author author = new Model.Author();
    Model.Book book = new Model.Book();
    Model.Member member = new Model.Member();
    Model.Func_Class func = new Model.Func_Class();
    Model.Genre genre = new Model.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();
    String imagePath = "";

    public EditBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
        jPanel1.setBorder(panelHeaderBorder);
        //func.customTable(jTable_Members_);
        func.displayIcon(100, 50, "/My_Images/book.png", jLabel_FormTittle);
        //func.customTableHeader(jTable_Members_, new Color(36, 37, 42), 16);
        fillJcomboboxWithGenres();
        Border JlabelIamgeHeaderBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelIamgeHeaderBorder);
        func.displayIcon(jLabel_Image.getWidth(), jLabel_Image.getHeight(), "/My_Images/avatar.png", jLabel_Image);

//        jLabel_Empty_ID.setVisible(false);
        Font font = new Font("Tahoma", Font.PLAIN, 18);
        jDateChooser_DateReceived.setFont(font);
        jLabel_Author_Id.setText("");
        jLabel_Genre_Id.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTittle = new javax.swing.JLabel();
        jLabel_CloseForm = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Author = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Publisher = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jButton_ChooseImage_ = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton_EditBook_ = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jComboBox_Genre_ = new javax.swing.JComboBox<>();
        jDateChooser_DateReceived = new com.toedter.calendar.JDateChooser();
        jSpinner_Quantity = new javax.swing.JSpinner();
        jButton_SelectAuthor_ = new javax.swing.JButton();
        jLabel_Author_Id = new javax.swing.JLabel();
        jLabel_Genre_Id = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTittle.setBackground(new java.awt.Color(211, 81, 0));
        jLabel_FormTittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTittle.setText("Edit A New Book");
        jLabel_FormTittle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(211, 81, 0));
        jLabel_CloseForm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_CloseForm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm.setText("x");
        jLabel_CloseForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm.setOpaque(true);
        jLabel_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ISBN");

        jTextField_ISBN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Name");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Author");

        jTextField_Author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Author.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Genre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Quantity");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Publisher");

        jTextField_Publisher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Price");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Date Received");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Book Description");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jButton_ChooseImage_.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_ChooseImage_.setText("Choose Image");
        jButton_ChooseImage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChooseImage_ActionPerformed(evt);
            }
        });

        jLabel_Image.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Image.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_ImagePath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_ImagePath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ImagePathMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Image of Book");

        jButton_EditBook_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_EditBook_.setText("Edit Book");
        jButton_EditBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditBook_ActionPerformed(evt);
            }
        });

        jButton_Cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jComboBox_Genre_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_Genre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Genre_ActionPerformed(evt);
            }
        });

        jSpinner_Quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_SelectAuthor_.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_SelectAuthor_.setText("Select Author");
        jButton_SelectAuthor_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectAuthor_ActionPerformed(evt);
            }
        });

        jLabel_Author_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Author_Id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Author_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Author_Id.setText("ID");

        jLabel_Genre_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Genre_Id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Genre_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Genre_Id.setText("ID");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ID");

        jTextField_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_Search_.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_Search_.setText("Search By ID or ISBN");
        jButton_Search_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jTextField_ISBN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Search_))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel_Genre_Id))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_DateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 127, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Author)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Author_Id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_SelectAuthor_)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_ChooseImage_, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jButton_EditBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Author_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_SelectAuthor_)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Genre_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel_ImagePath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ChooseImage_)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_DateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_EditBook_)
                            .addComponent(jButton_Cancel))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jButton_ChooseImage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChooseImage_ActionPerformed
        String path = func.selectImage();
        jLabel_ImagePath.setText(path);
        jLabel_Image.setText("");
        func.displayImage(path, jLabel_Image, null);
        imagePath = path;
    }//GEN-LAST:event_jButton_ChooseImage_ActionPerformed

    private void jLabel_ImagePathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ImagePathMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ImagePathMouseClicked

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_EditBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditBook_ActionPerformed

        String isbn = jTextField_ISBN.getText();
        if (!verif()) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty", "Empty Data", 2);
        } //        else if (book.isISBNexists(isbn)) {
        //            JOptionPane.showMessageDialog(null, "This ISBN Exists", "Wrong ISBN", 2);
        //
        //        } 
        else {
            try {
                int id = Integer.parseInt(jTextField_ID.getText());
                String name = jTextField_Name.getText();
                String publisher = jTextField_Publisher.getText();
                String description = jTextArea_Description.getText();

                Integer author_id = Integer.parseInt(jLabel_Author_Id.getText());
                Integer genre_id = Integer.parseInt(jLabel_Genre_Id.getText());
                Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());
                Double price = Double.parseDouble(jTextField_Price.getText());
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");

                String date_receive = dateForm.format(jDateChooser_DateReceived.getDate());
                Path path = Paths.get(imagePath);

                try {
                    byte[] img = Files.readAllBytes(path);
                    book.editBook(id, name, author_id, genre_id, quantity, publisher, price, date_receive, description, img);

                } catch (IOException ex) {
                    book.editBook(id, name, author_id, genre_id, quantity, publisher, price, date_receive, description, null);

                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You Entered Wrong Data In a Number Field", "Wrong Data", 2);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "You Need To Select a Date", "Select Data", 2);
            }
            clear();
        }

    }//GEN-LAST:event_jButton_EditBook_ActionPerformed

    private void jButton_SelectAuthor_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectAuthor_ActionPerformed
        AuthorsListForm authorsListForm = new AuthorsListForm();
        authorsListForm.formType = "edit";
        authorsListForm.setVisible(true);
    }//GEN-LAST:event_jButton_SelectAuthor_ActionPerformed

    private void jComboBox_Genre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Genre_ActionPerformed
        try {
            int genreId = genresMap.get(jComboBox_Genre_.getSelectedItem().toString());
            jLabel_Genre_Id.setText(String.valueOf(genreId));
        } catch (Exception e) {
            System.out.println("Error From jComboBox_Genre_ActionPerformed - " + e.getMessage());
        }
    }//GEN-LAST:event_jComboBox_Genre_ActionPerformed

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        clear();
        if (jTextField_ID.getText().equals("") && jTextField_ISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You Need To Enter The ID or ISBN Complete The Search ", "Empty ID or ISBN", 2);
        } else {
            try {
                int id = 0;
                String isbn = jTextField_ISBN.getText();
                Model.Book selectedBook = null;
                try {
                    id = Integer.parseInt(jTextField_ID.getText());
                    selectedBook = book.searchBookById_ISBN(id, isbn);
                } catch (NumberFormatException ex) {
                    selectedBook = book.searchBookById_ISBN(id, isbn);
                }

                jTextField_ID.setText(String.valueOf(selectedBook.getId()));
                jTextField_Name.setText(selectedBook.getName());
                jTextField_Publisher.setText(selectedBook.getPublisher());
                jTextField_ISBN.setText(selectedBook.getIsbn());
                double price = selectedBook.getPrice();
                if (price == Math.floor(price)) {
                    jTextField_Price.setText(String.valueOf((int) price));
                } else {
                    jTextField_Price.setText(Double.toString(price));
                }
                jTextArea_Description.setText(selectedBook.getDescription());
                jSpinner_Quantity.setValue(selectedBook.getQuantity());
                jLabel_Author_Id.setText(String.valueOf(selectedBook.getAuthor_id()));
                jLabel_Genre_Id.setText(String.valueOf(selectedBook.getGenre_id()));

                String authorName = (author.getAuthorById(selectedBook.getAuthor_id())).getFistName() + " " + (author.getAuthorById(selectedBook.getAuthor_id())).getLastName();
                jTextField_Author.setText(authorName);

                for (Map.Entry<String, Integer> entry : genresMap.entrySet()) {
                    if (Objects.equals(selectedBook.getGenre_id(), entry.getValue())) {
                        jComboBox_Genre_.setSelectedItem(entry.getKey());
                        System.out.println(entry.getKey());
                    }
                }

                try {
                    Date date_receive = new SimpleDateFormat("yyyy-MM-dd").parse(selectedBook.getDate_receive());
                    jDateChooser_DateReceived.setDate(date_receive);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                byte[] image = selectedBook.getImage();
                func.displayImage("", jLabel_Image, image);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "This Book Does Not Exists" + e.getMessage(), "Book Not Found", 2);

            }
        }

    }//GEN-LAST:event_jButton_Search_ActionPerformed

    public static void displayAuthorData(int id, String fullName) {
        jTextField_Author.setText(fullName);
        jLabel_Author_Id.setText(String.valueOf(id));
    }

    public boolean verif() {
        if (jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("")
                || jTextField_Price.getText().equals("") || jTextField_Name.getText().equals("")
                || jLabel_Genre_Id.getText().equals("")) {
            return false;
        }
        return true;
    }

    public void fillJcomboboxWithGenres() {
        jComboBox_Genre_.addItem("");
        for (String genreName : genresMap.keySet()) {
            jComboBox_Genre_.addItem(genreName);
        }
    }

    public void clear() {
        jTextArea_Description.setText("");
        jTextField_Author.setText("");
        jTextField_ISBN.setText("");
        jTextField_Name.setText("");
        jTextField_Price.setText("");
        jTextField_Publisher.setText("");
        jLabel_Author_Id.setText("");
        jLabel_Genre_Id.setText("");
        jSpinner_Quantity.setValue(0);
        jComboBox_Genre_.setSelectedIndex(0);
        jDateChooser_DateReceived.setDate(null);
        jLabel_ImagePath.setText("");
        jLabel_Image.setIcon(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_ChooseImage_;
    private javax.swing.JButton jButton_EditBook_;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JButton jButton_SelectAuthor_;
    private javax.swing.JComboBox<String> jComboBox_Genre_;
    private com.toedter.calendar.JDateChooser jDateChooser_DateReceived;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_Author_Id;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_FormTittle;
    private javax.swing.JLabel jLabel_Genre_Id;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Author;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables
}
