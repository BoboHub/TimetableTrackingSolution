/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

import dbUtil.dbConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//@author Boris, Owen, Richard, Yami

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    Connection connection=null;
    
    public LoginForm() {
        initComponents();
        connection=dbConnection.dbConnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        cancelBT = new javax.swing.JButton();
        loginBT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        closeLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Timetable Tracking Solution LTD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Username:");

        userNameTF.setBackground(new java.awt.Color(108, 122, 137));
        userNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameTF.setForeground(new java.awt.Color(228, 241, 254));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Password:");

        passwordTF.setBackground(new java.awt.Color(108, 122, 137));
        passwordTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordTF.setForeground(new java.awt.Color(228, 241, 254));

        cancelBT.setBackground(new java.awt.Color(192, 57, 43));
        cancelBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelBT.setForeground(new java.awt.Color(255, 255, 255));
        cancelBT.setText("Cancel");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });

        loginBT.setBackground(new java.awt.Color(34, 167, 240));
        loginBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBT.setForeground(new java.awt.Color(255, 255, 255));
        loginBT.setText("Login");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cancelBT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginBT))
                            .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        closeLB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeLB.setForeground(new java.awt.Color(255, 255, 255));
        closeLB.setText("X");
        closeLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLBMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Form");

        minLB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minLB.setForeground(new java.awt.Color(255, 255, 255));
        minLB.setText("-");
        minLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minLB)
                .addGap(18, 18, 18)
                .addComponent(closeLB)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeLB)
                    .addComponent(minLB)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLBMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLBMouseClicked

    private void minLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLBMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLBMouseClicked
    private void clearFields() {
                  passwordTF.setText("");
                  userNameTF.setText("");
               }
    
    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
        // TODO add your handling code here:
        
             try {
                    String query ="select ID,firstName,userType from EmployeeInfo where Username=? and password=? ";
                    PreparedStatement pst=connection.prepareStatement(query);
                    pst.setString(1, userNameTF.getText());
                    pst.setString(2, passwordTF.getText());
                    
                    ResultSet rs=pst.executeQuery(); 
                    int count = 0;
                    String userType="";
                    String userName="";
                    
                    while(rs.next()) {
                    count=count+1;
                    userName = rs.getString(2);
                    userType = rs.getString(3);
                    }
                    if(count ==1)
                    {
                    JOptionPane.showMessageDialog(null, "Username and password is correct");
                    MainGUI newMainGUI = new MainGUI();
                    this.dispose();
                    newMainGUI.setVisible(true);
                    newMainGUI.setSize(925, 550);
                    newMainGUI.setLocationRelativeTo(null);
                    newMainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newMainGUI.setUserType(userType);
                    newMainGUI.setName(userName);
                    }
                    else if (count >1)
                    {
                      JOptionPane.showMessageDialog(null, "Duplicated username and password is correct");
                    }
                    else 
                    {
                      JOptionPane.showMessageDialog(null, "Username/password is NOT correct");
                    }
                    rs.close();
                    pst.close();
        }
        catch (Exception e)    
        {
                     JOptionPane.showMessageDialog(null, e);
        }
           
        
   /*
        String password =  passwordTF.getText();
        String username = userNameTF.getText();
        
        if (password.contains("password") && (username.contains("Boris")))
        {
       */ 
      
       /* }
        else
        {
        JOptionPane.showMessageDialog(null, "Invalid Login Details", "Please use the correct name or password", JOptionPane.ERROR_MESSAGE);
        clearFields();
        }
        
        
        /*
        newMainGUI.pack();
        
        newMainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        */
    }//GEN-LAST:event_loginBTActionPerformed
    // clears field when pressing CANCEL
       
    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        // TODO add your handling code here:
           clearFields();
    }//GEN-LAST:event_cancelBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel closeLB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBT;
    private javax.swing.JLabel minLB;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
