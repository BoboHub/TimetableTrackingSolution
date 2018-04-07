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
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


//@author Boris, Owen, Richard, Yami

public class MainGUI extends javax.swing.JFrame {

    //Creates new form MainGUI

    Connection connection = null;
    String userType="";
    
    public MainGUI() {
        initComponents();
        
        connection=dbConnection.dbConnector(); // database connection init
        jTable1.setVisible(false); // sets the table to false + only when class is selected will it appear
                        
    }

    public void setUserType(String userType){
        this.userType = userType;
            if(userType.equals("admin")){   
              
            }else{
                searchDBsBT.setVisible(false);
                sStudentBT.setVisible(false);
                sStaffBT.setVisible(false);
                addUserBT.setVisible(false);
                deleteRecordBT.setVisible(false);
          }
    }
    
    public void setName(String name){
        nameLabel.setText(name);
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
        nameLabel = new javax.swing.JLabel();
        classNameLabel = new javax.swing.JLabel();
        numOfStudents = new javax.swing.JLabel();
        adminFunctionsP = new javax.swing.JPanel();
        sStudentBT = new javax.swing.JButton();
        sStaffBT = new javax.swing.JButton();
        addUserBT = new javax.swing.JButton();
        closeBT = new javax.swing.JButton();
        deleteRecordBT = new javax.swing.JButton();
        searchDBsBT = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        ;

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
        year3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year3BTActionPerformed(evt);
            }
        });

        year4BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year4BT.setText("Year 4");
        year4BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year4BTActionPerformed(evt);
            }
        });

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

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        classNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        numOfStudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout classInfoPLayout = new javax.swing.GroupLayout(classInfoP);
        classInfoP.setLayout(classInfoPLayout);
        classInfoPLayout.setHorizontalGroup(
            classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classInfoPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classInfoPLayout.createSequentialGroup()
                        .addComponent(tutorNLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classInfoPLayout.createSequentialGroup()
                        .addComponent(classNLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classInfoPLayout.createSequentialGroup()
                        .addComponent(nStudentsLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOfStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        classInfoPLayout.setVerticalGroup(
            classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classInfoPLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorNLB)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classNLB)
                    .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nStudentsLB)
                    .addComponent(numOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(classInfoP);
        classInfoP.setBounds(0, 50, 230, 410);

        adminFunctionsP.setBackground(new java.awt.Color(248, 148, 6));

        sStudentBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sStudentBT.setText("Search Student");
        sStudentBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sStudentBTActionPerformed(evt);
            }
        });

        sStaffBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sStaffBT.setText("Search Staff");
        sStaffBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sStaffBTActionPerformed(evt);
            }
        });

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

        deleteRecordBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteRecordBT.setText("Delete Record");
        deleteRecordBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBTActionPerformed(evt);
            }
        });

        searchDBsBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchDBsBT.setText("DBs Search and C.R.U.D.");
        searchDBsBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDBsBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminFunctionsPLayout = new javax.swing.GroupLayout(adminFunctionsP);
        adminFunctionsP.setLayout(adminFunctionsPLayout);
        adminFunctionsPLayout.setHorizontalGroup(
            adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFunctionsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchDBsBT)
                .addGap(18, 18, 18)
                .addComponent(sStudentBT)
                .addGap(18, 18, 18)
                .addComponent(sStaffBT)
                .addGap(18, 18, 18)
                .addComponent(addUserBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteRecordBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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
                    .addComponent(closeBT)
                    .addComponent(deleteRecordBT)
                    .addComponent(searchDBsBT))
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Timetable Tracking Solution | Exit", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void year1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1BTActionPerformed
        // TODO add your handling code here:
        try {
            String query = "SELECT id, firstName, lastName, phone, email, dob, address, addInformation FROM students WHERE year = 1 AND teacher = 'Boris'";
            PreparedStatement pst=connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel( wrapperModel );
                jTable1.setVisible(true);
            classNameLabel.setText("Year 1");
            numOfStudents.setText(jTable1.getRowCount()+"");
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_year1BTActionPerformed

    private void year2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2BTActionPerformed
        // TODO add your handling code here:
        try {
            String query = "SELECT id, firstName, lastName, phone, email, dob, address, addInformation FROM students WHERE year = 2 AND teacher = 'Boris'";
            PreparedStatement pst=connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel( wrapperModel );
                jTable1.setVisible(true);
            classNameLabel.setText("Year 2");
            numOfStudents.setText(jTable1.getRowCount()+"");
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_year2BTActionPerformed

    private void addUserBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBTActionPerformed

          AddUserGUI myAddUserGUI = new AddUserGUI();
          this.dispose();
          myAddUserGUI.setVisible(true);
          myAddUserGUI.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_addUserBTActionPerformed

    private void year3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year3BTActionPerformed
        // TODO add your handling code here:
        try{
            String query = "SELECT id, firstName, lastName, phone, email, dob, address, addInformation FROM students WHERE year = 3 AND teacher = 'Boris'";;
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel( wrapperModel );
                jTable1.setVisible(true);
            classNameLabel.setText("Year 3");
            numOfStudents.setText(jTable1.getRowCount()+"");
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_year3BTActionPerformed

    private void year4BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year4BTActionPerformed
        // TODO add your handling code here:
        try{
            String query = "SELECT id, firstName, lastName, phone, email, dob, address, addInformation FROM students WHERE year = 4 AND teacher = 'Boris'";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel( wrapperModel );
                jTable1.setVisible(true);
            classNameLabel.setText("Year 4");
            numOfStudents.setText(jTable1.getRowCount()+"");
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_year4BTActionPerformed

    private void sStaffBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sStaffBTActionPerformed

            SearchStaffGUI mySearchGUI = new SearchStaffGUI();
            this.dispose();
            mySearchGUI.setVisible(rootPaneCheckingEnabled);
            mySearchGUI.setLocationRelativeTo(this);
    }//GEN-LAST:event_sStaffBTActionPerformed

    private void sStudentBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sStudentBTActionPerformed

            SearchStudentsGUI myStudentsSearchGUI = new SearchStudentsGUI();
            this.dispose();
            myStudentsSearchGUI.setVisible(rootPaneCheckingEnabled);
            myStudentsSearchGUI.setLocationRelativeTo(this);
 
    }//GEN-LAST:event_sStudentBTActionPerformed

    private void deleteRecordBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBTActionPerformed

    }//GEN-LAST:event_deleteRecordBTActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        if(evt.getClickCount() == 2){
   
            AddUserGUI myAddUserGUI = new AddUserGUI();
            myAddUserGUI.pack();
            myAddUserGUI.setVisible(true);
            myAddUserGUI.setLocationRelativeTo(this);
          
            String id =model.getValueAt(index, 1).toString();
            String name =model.getValueAt(index, 2).toString();
            String surname =model.getValueAt(index, 3).toString();
            String phone =model.getValueAt(index, 4).toString();
            String email =model.getValueAt(index, 5).toString();
            String dob =model.getValueAt(index, 6).toString();
            String address =model.getValueAt(index, 7).toString();
            String addInformation = model.getValueAt(index, 8).toString();

            myAddUserGUI.idTF.setText(id);
            myAddUserGUI.firstNameTF.setText(name);
            myAddUserGUI.lastNameTF.setText(surname);
            myAddUserGUI.phoneTF.setText(phone);
            myAddUserGUI.emailTF.setText(email);
            myAddUserGUI.dobTF.setText(dob);
            myAddUserGUI.addressTF.setText(address);
            myAddUserGUI.addNoteTA.setText(addInformation);
          
            myAddUserGUI.subProfileBT.setVisible(false); 
            myAddUserGUI.pathTF.setVisible(false);
            myAddUserGUI.jLabel5.setVisible(false);
            myAddUserGUI.browsePicBT.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchDBsBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDBsBTActionPerformed
        AdminDatabases myAdminDB = new AdminDatabases();
        this.dispose();
        myAdminDB.setVisible(rootPaneCheckingEnabled);
        myAdminDB.setLocationRelativeTo(this);
    }//GEN-LAST:event_searchDBsBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton addUserBT;
    private javax.swing.JPanel adminFunctionsP;
    private javax.swing.JPanel classInfoP;
    private javax.swing.JLabel classNLB;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JButton closeBT;
    private javax.swing.JButton deleteRecordBT;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listYearsP;
    private javax.swing.JLabel nStudentsLB;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numOfStudents;
    private javax.swing.JButton sStaffBT;
    private javax.swing.JButton sStudentBT;
    private javax.swing.JButton searchDBsBT;
    private javax.swing.JLabel tutorNLB;
    private javax.swing.JButton year1BT;
    private javax.swing.JButton year2BT;
    private javax.swing.JButton year3BT;
    private javax.swing.JButton year4BT;
    // End of variables declaration//GEN-END:variables

}