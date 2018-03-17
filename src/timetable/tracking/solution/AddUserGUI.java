/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timetable.tracking.solution;

import dbUtil.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import javax.swing.JOptionPane;

//@author Boris, Owen, Richard, Yami

public class AddUserGUI extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    Connection connection=null;
    
    
    //if States is true, we are looking at creating a student form
    //if States is false, we are looking at creating a user form
    boolean state;
    
    public AddUserGUI() {
        initComponents();
        connection=dbConnection.dbConnector();
        
       
        mothersNameTF.setVisible(false);
        mothersNameLB.setVisible(false);
        fathersNameTF.setVisible(false);
        fathersNameLB.setVisible(false);
        submitStudentBT.setVisible(false);
        subProfileBT.setVisible(true);
        
               
        state = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        firstNameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addNoteTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        browsePicBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        typeUserCB = new javax.swing.JComboBox<>();
        closeBT = new javax.swing.JButton();
        subProfileBT = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        picLB = new javax.swing.JLabel();
        selectClassCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentForm = new javax.swing.JButton();
        userForm = new javax.swing.JButton();
        mothersNameLB = new javax.swing.JLabel();
        fathersNameLB = new javax.swing.JLabel();
        mothersNameTF = new javax.swing.JTextField();
        fathersNameTF = new javax.swing.JTextField();
        submitStudentBT = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Phone:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DOB:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Address:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Add note:");

        addNoteTA.setColumns(20);
        addNoteTA.setRows(5);
        jScrollPane1.setViewportView(addNoteTA);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Type of user:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        browsePicBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        browsePicBT.setText("Browse");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Surname:");

        typeUserCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Teacher", "Principal", "Admin", "Staff" }));

        closeBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        subProfileBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        subProfileBT.setText("Submit profile");
        subProfileBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProfileBTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select class:");

        picLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selectClassCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Create New Profile");

        studentForm.setText("Student");
        studentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFormActionPerformed(evt);
            }
        });

        userForm.setText("User");
        userForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFormActionPerformed(evt);
            }
        });

        mothersNameLB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mothersNameLB.setText("Mothers Name:");

        fathersNameLB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fathersNameLB.setText("Fathers Name:");

        submitStudentBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitStudentBT.setText("Submit Student");
        submitStudentBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitStudentBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitStudentBT)
                .addGap(18, 18, 18)
                .addComponent(subProfileBT)
                .addGap(18, 18, 18)
                .addComponent(closeBT)
                .addGap(373, 373, 373))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(mothersNameLB)
                                    .addComponent(fathersNameLB)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(firstNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(lastNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(phoneTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(emailTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(dobTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(addressTF, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(mothersNameTF)
                                        .addComponent(fathersNameTF)))
                                .addGap(0, 97, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(typeUserCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectClassCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userForm)
                            .addComponent(studentForm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(picLB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(browsePicBT)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(picLB, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browsePicBT))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(typeUserCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(selectClassCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentForm))
                        .addGap(18, 18, 18)
                        .addComponent(userForm)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mothersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mothersNameLB))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(fathersNameLB)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fathersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBT)
                    .addComponent(subProfileBT)
                    .addComponent(submitStudentBT))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Timetable Tracking Solution | Exit", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeBTActionPerformed

    public void clearFields(){                                        
        idTF.setText("");
        firstNameTF.setText("");
        lastNameTF.setText("");
        mothersNameTF.setText("");
        fathersNameTF.setText("");
        phoneTF.setText("");
        emailTF.setText("");
        dobTF.setText("");
        addressTF.setText("");
        addNoteTA.setText("");
        //typeUserCB.setName("test");
    }   
    
    
    private void subProfileBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProfileBTActionPerformed
            
        try {
            String query = "insert into staff (ID, firstName, lastName, phone, email, DOB, address) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst=connection.prepareStatement(query);
            
            pst.setString(1, idTF.getText() );
            pst.setString(2, firstNameTF.getText() );
            pst.setString(3, lastNameTF.getText() );
            pst.setString(4, phoneTF.getText() );
            pst.setString(5, emailTF.getText() );
            pst.setString(6, dobTF.getText() );
            pst.setString(7, addressTF.getText() );
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data saved");
            
            clearFields();
            
            pst.close();
                   
        }catch (Exception e){
            e.printStackTrace();
        }  
        
       
    }//GEN-LAST:event_subProfileBTActionPerformed

    private void userFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFormActionPerformed
        // TODO add your handling code here:
        
        state = false;
        mothersNameTF.setVisible(false);
        mothersNameLB.setVisible(false);
        fathersNameTF.setVisible(false);
        fathersNameLB.setVisible(false);
        submitStudentBT.setVisible(false);
        subProfileBT.setVisible(true);
       
        
    }//GEN-LAST:event_userFormActionPerformed

    private void studentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFormActionPerformed
        // TODO add your handling code here:
        
        state = true;
        mothersNameTF.setVisible(true);
        mothersNameLB.setVisible(true);
        fathersNameTF.setVisible(true);
        fathersNameLB.setVisible(true);
        submitStudentBT.setVisible(true);
        subProfileBT.setVisible(false);
        
    }//GEN-LAST:event_studentFormActionPerformed

    private void submitStudentBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitStudentBTActionPerformed
        // TODO add your handling code here:
        
         try {
            String sql = "insert into student (ID, firstName, lastName, mothersName, fathersName, phone, email, dob, address ) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst=connection.prepareStatement(sql);
            
            pst.setString(1, idTF.getText() );
            pst.setString(2, firstNameTF.getText() );
            pst.setString(3, lastNameTF.getText() );
            pst.setString(4, mothersNameTF.getText() );
            pst.setString(5, fathersNameTF.getText() );
            pst.setString(6, phoneTF.getText() );
            pst.setString(7, emailTF.getText() );
            pst.setString(8, dobTF.getText() );
            pst.setString(9, addressTF.getText() );
            //pst.setString(10, addNoteTA.getText() );
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data saved");
            
            clearFields();
            
            pst.close();
                   
        }catch (Exception e){
            e.printStackTrace();
        }  
                                               
        
    }//GEN-LAST:event_submitStudentBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUserGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addNoteTA;
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton browsePicBT;
    private javax.swing.JButton closeBT;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel fathersNameLB;
    private javax.swing.JTextField fathersNameTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JLabel mothersNameLB;
    private javax.swing.JTextField mothersNameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel picLB;
    private javax.swing.JComboBox<String> selectClassCB;
    private javax.swing.JButton studentForm;
    private javax.swing.JButton subProfileBT;
    private javax.swing.JButton submitStudentBT;
    private javax.swing.JComboBox<String> typeUserCB;
    private javax.swing.JButton userForm;
    // End of variables declaration//GEN-END:variables
}