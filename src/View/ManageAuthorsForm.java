package View;

import Model.Func_Class;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ADMIN
 */
public class ManageAuthorsForm extends javax.swing.JFrame {

    Model.Func_Class func = new Func_Class();
    Model.Author author = new Model.Author();

    public ManageAuthorsForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 67));
        jPanel1.setBorder(panelHeaderBorder);

        func.displayIcon(75, 60, "/My_Images/notepad.png", jLabel_FormTittle);

        func.customTable(jTable_Authors);

        func.customTableHeader(jTable_Authors, new Color(34, 167, 240), 16);

        jLabel_Empty_FName.setForeground(Color.WHITE);
        jLabel_Empty_LName.setForeground(Color.WHITE);

        populateJTableWithAuthors();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jLabel_Empty_FName = new javax.swing.JLabel();
        jScrollPane_Table = new javax.swing.JScrollPane();
        jTable_Authors = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jLabel_Empty_LName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Expertise = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_About = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTittle.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_FormTittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTittle.setText("Manage Authors");
        jLabel_FormTittle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(1, 50, 67));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FIRST NAME");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNameActionPerformed(evt);
            }
        });

        jButton_Add_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Add_.setText("ADD");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Edit_.setText("EDIT");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Delete_.setText("DELETE");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jLabel_Empty_FName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Empty_FName.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_Empty_FName.setText("* enter the first name");
        jLabel_Empty_FName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FNameMouseClicked(evt);
            }
        });

        jTable_Authors.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorsMouseClicked(evt);
            }
        });
        jScrollPane_Table.setViewportView(jTable_Authors);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("LAST NAME");

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNameActionPerformed(evt);
            }
        });

        jLabel_Empty_LName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Empty_LName.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_Empty_LName.setText("* enter the last name");
        jLabel_Empty_LName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LNameMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("EXPERTISE");

        jTextField_Expertise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ExpertiseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ABOUT :");

        jTextArea_About.setColumns(20);
        jTextArea_About.setRows(5);
        jScrollPane1.setViewportView(jTextArea_About);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Empty_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Empty_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jTextField_Id)
                            .addComponent(jTextField_FName)
                            .addComponent(jTextField_Expertise))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Empty_FName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Empty_LName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Delete_)))
                    .addComponent(jScrollPane_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTextField_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNameActionPerformed

    }//GEN-LAST:event_jTextField_FNameActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();

        if (lname.isEmpty() && fname.isEmpty()) {
            jLabel_Empty_FName.setForeground(Color.RED);
            jLabel_Empty_LName.setForeground(Color.RED);
        } else if (lname.isEmpty()) {
            jLabel_Empty_LName.setForeground(Color.RED);
        } else if (fname.isEmpty()) {
            jLabel_Empty_FName.setForeground(Color.RED);
        } else {
            try {
                int id = Integer.parseInt(jTextField_Id.getText());
                author.editAuthor(id, fname, lname, expertise, about);
                cleanForm();
                populateJTableWithAuthors();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "error", 0);
            }

        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();

        if (lname.isEmpty() && fname.isEmpty()) {
            jLabel_Empty_FName.setForeground(Color.RED);
            jLabel_Empty_LName.setForeground(Color.RED);
        } else if (lname.isEmpty()) {
            jLabel_Empty_LName.setForeground(Color.RED);
        } else if (fname.isEmpty()) {
            jLabel_Empty_FName.setForeground(Color.RED);
        } else {

            author.addAuthor(fname, lname, expertise, about);
            cleanForm();
        }
        populateJTableWithAuthors();
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        try {
            int id = Integer.parseInt(jTextField_Id.getText());
            author.removeAuthor(id);
            populateJTableWithAuthors();
            cleanForm();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "error", 0);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jLabel_Empty_FNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FNameMouseClicked
        jLabel_Empty_FName.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Empty_FNameMouseClicked

    private void jTextField_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNameActionPerformed

    private void jLabel_Empty_LNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_LNameMouseClicked
        jLabel_Empty_LName.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Empty_LNameMouseClicked

    private void jTextField_ExpertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ExpertiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ExpertiseActionPerformed

    private void jTable_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorsMouseClicked
        int index = jTable_Authors.getSelectedRow();
        String id = jTable_Authors.getValueAt(index, 0).toString();
        String firstName = jTable_Authors.getValueAt(index, 1).toString();
        String lastName = jTable_Authors.getValueAt(index, 2).toString();
        String expertise = jTable_Authors.getValueAt(index, 3).toString();
        String about = jTable_Authors.getValueAt(index, 4).toString();

        jTextField_Id.setText(id);
        jTextField_FName.setText(firstName);
        jTextField_LName.setText(lastName);
        jTextField_Expertise.setText(expertise);
        jTextArea_About.setText(about);

    }//GEN-LAST:event_jTable_AuthorsMouseClicked
    public void populateJTableWithAuthors() {
        ArrayList<Model.Author> authorsList = author.authorsList();

        String[] colNames = {"ID", "F-Name", "L-Name", "Expertise", "About"};

        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getFistName();
            rows[i][2] = authorsList.get(i).getLastName();
            rows[i][3] = authorsList.get(i).getExpertise();
            rows[i][4] = authorsList.get(i).getAbout();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Authors.setModel(model);
        
        int[] widths = {50, 150, 150, 150, 150};
        for (int i = 0; i < widths.length; i++) {
            TableColumn column = jTable_Authors.getColumnModel().getColumn(i);
            column.setPreferredWidth(widths[i]);
        }
    }

    public void cleanForm() {
        jTextField_Id.setText("");
        jTextField_FName.setText("");
        jTextField_LName.setText("");
        jTextField_Expertise.setText("");
        jTextArea_About.setText("");
        jLabel_Empty_FName.setForeground(Color.WHITE);
        jLabel_Empty_LName.setForeground(Color.WHITE);
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
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAuthorsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_Empty_FName;
    private javax.swing.JLabel jLabel_Empty_LName;
    private javax.swing.JLabel jLabel_FormTittle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_Table;
    private javax.swing.JTable jTable_Authors;
    private javax.swing.JTextArea jTextArea_About;
    private javax.swing.JTextField jTextField_Expertise;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LName;
    // End of variables declaration//GEN-END:variables
}
