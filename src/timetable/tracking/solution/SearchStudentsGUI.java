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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

//@author Boris, Owen, Richard, Yami

public class SearchStudentsGUI extends javax.swing.JFrame {

    //Create a GLOBAL variable called conn
    Connection connection = null;
        
    //Creates new form searchStudentsGUI

    public SearchStudentsGUI() {
        initComponents();
        
        connection = dbConnection.dbConnector();
        
        //connection = sqliteConnection.dbConnector();
        
        refreshDBTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        takeDataBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mothersNameTF = new javax.swing.JTextField();
        fathersNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        yearTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        teacherTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        infoTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        saveBT = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        searchBT = new javax.swing.JButton();
        clearTF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Database");
        setResizable(false);

        jLabel1.setText("Name");

        takeDataBT.setText("Take data from DB");
        takeDataBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeDataBTActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        updateBT.setText("Update");
        updateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTActionPerformed(evt);
            }
        });

        jLabel2.setText("Surname");

        jLabel3.setText("Mother");

        jLabel4.setText("Father");

        jLabel5.setText("Phone");

        jLabel6.setText("Email");

        jLabel7.setText("DOB");

        jLabel8.setText("Year");

        jLabel9.setText("Teacher");

        jLabel10.setText("Address");

        jLabel11.setText("Info");

        jLabel12.setText("ID");

        saveBT.setText("Save");
        saveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTActionPerformed(evt);
            }
        });

        deleteBT.setText("Delete");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        jLabel13.setText("Search");

        searchBT.setText("Search");

        clearTF.setText("Clear");
        clearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBT)
                                .addGap(18, 18, 18)
                                .addComponent(takeDataBT)
                                .addGap(18, 18, 18)
                                .addComponent(saveBT)
                                .addGap(18, 18, 18)
                                .addComponent(updateBT)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBT)
                                .addGap(18, 18, 18)
                                .addComponent(clearTF))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fathersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mothersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dobTF)
                                                    .addComponent(yearTF))
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel10))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel9)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstNameTF)
                                        .addGap(60, 60, 60)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(infoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 276, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(takeDataBT)
                        .addComponent(searchBT)
                        .addComponent(saveBT)
                        .addComponent(updateBT)
                        .addComponent(deleteBT)
                        .addComponent(clearTF))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mothersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(teacherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fathersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(infoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void takeDataBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeDataBTActionPerformed
        
        try{
            String query = "SELECT * FROM students";
            
            //More specific query
            //String query = "SELECT id, firstName, address FROM student";
            
            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            //Declare a result set - execute the query and pass it to the rs
            ResultSet rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            pst.close();
            rs.close();
             
        }catch(Exception e){
            e.printStackTrace();
        }  
    }//GEN-LAST:event_takeDataBTActionPerformed
    
    public void clearFields(){
        searchTF.setText(null);
        idTF.setText(null);
        firstNameTF.setText(null);
        lastNameTF.setText(null);
        mothersNameTF.setText(null);
        fathersNameTF.setText(null);
        phoneTF.setText(null);
        emailTF.setText(null);
        dobTF.setText(null);
        addressTF.setText(null);
        yearTF.setText(null);
        teacherTF.setText(null);
        infoTF.setText(null);
    }
    
    public void refreshDBTable(){
        try{
            String query = "SELECT * FROM students";
            
            //More specific query
            //String query = "SELECT id, firstName, address FROM student";
            
            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            //Declare a result set - execute the query and pass it to the rs
            ResultSet rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            pst.close();
            rs.close();
             
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void saveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTActionPerformed
        
        try{
            String query = "INSERT INTO students (id, firstName, lastName, mothersName, fathersName, phone, email, dob, address, year, teacher, addInformation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            //More specific query
            //String query = "SELECT id, firstName, address FROM student";
            
            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, idTF.getText());
            pst.setString(2, firstNameTF.getText());
            pst.setString(3, lastNameTF.getText());
            pst.setString(4, mothersNameTF.getText());
            pst.setString(5, fathersNameTF.getText());
            pst.setString(6, phoneTF.getText());
            pst.setString(7, emailTF.getText());
            pst.setString(8, dobTF.getText());
            pst.setString(9, addressTF.getText());
            pst.setString(10, yearTF.getText());
            pst.setString(11, teacherTF.getText());
            pst.setString(12, infoTF.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data saved into students DB successfully!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        refreshDBTable();
        
        clearFields();
    }//GEN-LAST:event_saveBTActionPerformed

    private void updateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTActionPerformed
        
        try{
            String query = "UPDATE students SET id='"+idTF.getText()+"', firstName='"+firstNameTF.getText()+"', lastName='"+lastNameTF.getText()+"', mothersName='"+mothersNameTF.getText()+"', fathersName='"+fathersNameTF.getText()+"', phone='"+phoneTF.getText()+"', email='"+emailTF.getText()+"', dob='"+dobTF.getText()+"', address='"+addressTF.getText()+"', year='"+yearTF.getText()+"', teacher='"+teacherTF.getText()+"', addInformation='"+infoTF.getText()+"' WHERE id='"+idTF.getText()+"'";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data successfully updated into students DB!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        refreshDBTable();
        
        clearFields();
    }//GEN-LAST:event_updateBTActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        
        try{
            String query = "DELETE FROM students WHERE id='"+idTF.getText()+"'";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data successfully deleted from students DB!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        refreshDBTable();
        
        clearFields();
    }//GEN-LAST:event_deleteBTActionPerformed

    private void clearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTFActionPerformed
        clearFields();
    }//GEN-LAST:event_clearTFActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchStudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudentsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton clearTF;
    private javax.swing.JButton deleteBT;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField fathersNameTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField infoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField mothersNameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton saveBT;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton takeDataBT;
    private javax.swing.JTextField teacherTF;
    private javax.swing.JButton updateBT;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}