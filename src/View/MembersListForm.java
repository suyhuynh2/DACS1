package View;

import Model.Func_Class;
import Model.Member;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author ADMIN
 */
public class MembersListForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    Model.Member member = new Model.Member();
    Model.Func_Class func = new Model.Func_Class();

    public MembersListForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
        jPanel1.setBorder(panelHeaderBorder);
        func.customTable(jTable_Members_);
        func.displayIcon(60, 45, "/My_Images/member.png", jLabel_FormTittle);
        func.customTableHeader(jTable_Members_, new Color(36, 37, 42), 16);
        
        Border JlabelIamgeHeaderBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelIamgeHeaderBorder);
        func.displayIcon(jLabel_Image.getWidth(), jLabel_Image.getHeight(),"/My_Images/avatar.png" , jLabel_Image);
        
        jLabel_Empty_ID.setVisible(false);
        populateJTableWithMembers("");
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
        jLabel2 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jLabel_FormTittle = new javax.swing.JLabel();
        jLabel_CloseForm = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jLabel_Empty_ID = new javax.swing.JLabel();
        jButton_Search_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Members_ = new javax.swing.JTable();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("VALUE TO SEARCH");

        jTextField_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jLabel_FormTittle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_FormTittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTittle.setText("Member List");
        jLabel_FormTittle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(1, 152, 117));
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

        jLabel_ImagePath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_ImagePath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ImagePathMouseClicked(evt);
            }
        });

        jLabel_Empty_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Empty_ID.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_Empty_ID.setText("* you must enter the member ID");
        jLabel_Empty_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_IDMouseClicked(evt);
            }
        });

        jButton_Search_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Search_.setText("SEARCH");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jTable_Members_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Members_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Members_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Members_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Members_);

        jLabel_Image.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Image.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_FullName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_FullName.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_FullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FullName.setText("Full Name");

        jLabel_Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Phone.setText("Phone");

        jLabel_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Email.setText("Email");

        jLabel_Gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Gender.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Gender.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel_Empty_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FullName)
                    .addComponent(jLabel_Phone)
                    .addComponent(jLabel_Email)
                    .addComponent(jLabel_Gender)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FormTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Empty_ID)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel_ImagePath))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateJTableWithMembers(String query) {
        ArrayList<Model.Member> membersList = member.membersList(query);

        String[] colNames = {"ID", "F-Name", "L-Name", "Phone", "Email", "Gender"};

        Object[][] rows = new Object[membersList.size()][colNames.length];

        for (int i = 0; i < membersList.size(); i++) {
            rows[i][0] = membersList.get(i).getId();
            rows[i][1] = membersList.get(i).getFistName();
            rows[i][2] = membersList.get(i).getLastName();
            rows[i][3] = membersList.get(i).getPhone();
            rows[i][4] = membersList.get(i).getEmail();
            rows[i][5] = membersList.get(i).getGender();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Members_.setModel(model);
        
        int[] widths = {50, 130, 130, 90, 200, 70};
        for (int i = 0; i < widths.length; i++) {
            TableColumn column = jTable_Members_.getColumnModel().getColumn(i);
            column.setPreferredWidth(widths[i]);
        }
    }

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed

    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jLabel_ImagePathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ImagePathMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ImagePathMouseClicked

    private void jLabel_Empty_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_IDMouseClicked
        jLabel_Empty_ID.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_IDMouseClicked

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        String value = jTextField_Search.getText();
        if (value.equals("")) {
            jLabel_Empty_ID.setVisible(true);
        } else {
            String query = "SELECT * FROM `members` WHERE `firstname` LIKE'%" + value + "%' or `lastname` LIKE '%" + value + "%'";
            populateJTableWithMembers(query);
        }
    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTable_Members_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Members_MouseClicked
        Member SelectedMember;
        try {
            Integer rowIndex = jTable_Members_.getSelectedRow();
            Integer id = Integer.parseInt(jTable_Members_.getModel().getValueAt(rowIndex, 0).toString());

            SelectedMember = member.getMemberById(id);

            if (SelectedMember != null) {
                jLabel_FullName.setText(SelectedMember.getFistName() + " " + SelectedMember.getLastName());
                jLabel_Email.setText(SelectedMember.getEmail());
                jLabel_Phone.setText(SelectedMember.getPhone());
                jLabel_Gender.setText(SelectedMember.getGender());

                byte[] image = SelectedMember.getImagePath();
                System.out.println(image);
                func.displayImage("", jLabel_Image, image);
            } else {
                JOptionPane.showMessageDialog(null, "No Member With This Id Is Found", "Invalid Id", 3);

            }
        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a Valid Member", "Invalid Id", 3);

        }
    }//GEN-LAST:event_jTable_Members_MouseClicked

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
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Empty_ID;
    private javax.swing.JLabel jLabel_FormTittle;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Members_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
