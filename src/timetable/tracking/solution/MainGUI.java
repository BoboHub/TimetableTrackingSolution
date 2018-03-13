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

/**
 *
 * @author Bobo
 */
public class MainGUI extends javax.swing.JFrame {


    /**
     * Creates new form MainGUI
     */
    Connection connection = null;
    public MainGUI() {
        initComponents();
        
        connection=dbConnection.dbConnector(); // database connection init
        jTable1.setVisible(false); // sets the table to false + only when class is selected will it appear
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listYearsP = new javax.swing.JPanel();
        year1BT = new javax.swing.JButton();
        year2BT = new javax.swing.JButton();
        year3BT = new javax.swing.JButton();
        year4BT = new javax.swing.JButton();
        classInfoP = new javax.swing.JPanel();
        tutorNLB = new javax.swing.JLabel();
        classNLB = new javax.swing.JLabel();
        nStudentsLB = new javax.swing.JLabel();
        adminFunctionsP = new javax.swing.JPanel();
        sStudentBT = new javax.swing.JButton();
        sStaffBT = new javax.swing.JButton();
        addUserBT = new javax.swing.JButton();
        closeBT = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setName("Attendance Tracking Solutions"); // NOI18N
        getContentPane().setLayout(null);

        listYearsP.setBackground(new java.awt.Color(248, 148, 6));

        year1BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year1BT.setText("Year 1");
        year1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1BTActionPerformed(evt);
            }
        });

        year2BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year2BT.setText("Year 2");
        year2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2BTActionPerformed(evt);
            }
        });

        year3BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year3BT.setText("Year 3");

        year4BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year4BT.setText("Year 4");

        javax.swing.GroupLayout listYearsPLayout = new javax.swing.GroupLayout(listYearsP);
        listYearsP.setLayout(listYearsPLayout);
        listYearsPLayout.setHorizontalGroup(
            listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listYearsPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(year1BT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(year2BT)
                .addGap(18, 18, 18)
                .addComponent(year3BT)
                .addGap(18, 18, 18)
                .addComponent(year4BT)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        listYearsPLayout.setVerticalGroup(
            listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listYearsPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year1BT)
                    .addComponent(year2BT)
                    .addComponent(year3BT)
                    .addComponent(year4BT))
                .addGap(27, 27, 27))
        );

        getContentPane().add(listYearsP);
        listYearsP.setBounds(0, 0, 900, 50);

        classInfoP.setBackground(new java.awt.Color(248, 188, 8));

        tutorNLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tutorNLB.setText("Tutor name:");

        classNLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        classNLB.setText("Class name:");

        nStudentsLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nStudentsLB.setText("No.of Students:");

        javax.swing.GroupLayout classInfoPLayout = new javax.swing.GroupLayout(classInfoP);
        classInfoP.setLayout(classInfoPLayout);
        classInfoPLayout.setHorizontalGroup(
            classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classInfoPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tutorNLB)
                    .addComponent(classNLB)
                    .addComponent(nStudentsLB))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        classInfoPLayout.setVerticalGroup(
            classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classInfoPLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(tutorNLB)
                .addGap(28, 28, 28)
                .addComponent(classNLB)
                .addGap(31, 31, 31)
                .addComponent(nStudentsLB)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(classInfoP);
        classInfoP.setBounds(0, 50, 230, 410);

        adminFunctionsP.setBackground(new java.awt.Color(248, 148, 6));

        sStudentBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sStudentBT.setText("Search Student");

        sStaffBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sStaffBT.setText("Search Staff");

        addUserBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addUserBT.setText("Add User Profile");
        addUserBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBTActionPerformed(evt);
            }
        });

        closeBT.setBackground(new java.awt.Color(192, 57, 43));
        closeBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminFunctionsPLayout = new javax.swing.GroupLayout(adminFunctionsP);
        adminFunctionsP.setLayout(adminFunctionsPLayout);
        adminFunctionsPLayout.setHorizontalGroup(
            adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFunctionsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sStudentBT)
                .addGap(18, 18, 18)
                .addComponent(sStaffBT)
                .addGap(18, 18, 18)
                .addComponent(addUserBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(closeBT)
                .addContainerGap())
        );
        adminFunctionsPLayout.setVerticalGroup(
            adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminFunctionsPLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sStudentBT)
                    .addComponent(sStaffBT)
                    .addComponent(addUserBT)
                    .addComponent(closeBT))
                .addContainerGap())
        );

        getContentPane().add(adminFunctionsP);
        adminFunctionsP.setBounds(0, 460, 900, 50);

        DynamicPanel.setBackground(new java.awt.Color(44, 62, 80));
        DynamicPanel.setMinimumSize(new java.awt.Dimension(700, 440));

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );

        getContentPane().add(DynamicPanel);
        DynamicPanel.setBounds(230, 50, 670, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        // TODO add your handling code here:
           int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);

       
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void year1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1BTActionPerformed
        // TODO add your handling code here:
        try {
            String query = "select * from year1";
             PreparedStatement pst=connection.prepareStatement(query);
             ResultSet rs = pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             jTable1.setVisible(true);
             
      
             
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_year1BTActionPerformed

    private void year2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2BTActionPerformed
        // TODO add your handling code here:
             try {
            String query = "select * from year2";
             PreparedStatement pst=connection.prepareStatement(query);
             ResultSet rs = pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             jTable1.setVisible(true);
             
             
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_year2BTActionPerformed

    private void addUserBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBTActionPerformed
            
                   NewProfileGUI newNewProfileGUI = new NewProfileGUI();
                    this.dispose();
                    newNewProfileGUI.setVisible(true);
                    newNewProfileGUI.setSize(1000, 1000);
                   // newNewProfileGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }//GEN-LAST:event_addUserBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton addUserBT;
    private javax.swing.JPanel adminFunctionsP;
    private javax.swing.JPanel classInfoP;
    private javax.swing.JLabel classNLB;
    private javax.swing.JButton closeBT;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listYearsP;
    private javax.swing.JLabel nStudentsLB;
    private javax.swing.JButton sStaffBT;
    private javax.swing.JButton sStudentBT;
    private javax.swing.JLabel tutorNLB;
    private javax.swing.JButton year1BT;
    private javax.swing.JButton year2BT;
    private javax.swing.JButton year3BT;
    private javax.swing.JButton year4BT;
    // End of variables declaration//GEN-END:variables

   

}
