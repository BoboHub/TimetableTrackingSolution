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
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        submitButton.setVisible(false);
        time();
                        
    }

    public void setUserType(String userType){
        this.userType = userType;
            if(userType.equalsIgnoreCase("admin")){
                classNLB.setVisible(false);
                nStudentsLB.setVisible(false);
                yearsP.setVisible(false);
                jScrollPane2.setVisible(false);
                classNameLabel.setVisible(false);
                numOfStudents.setVisible(false);
                tutorNLB.setText("Admin:");
            }else{
                searchDBsBT.setVisible(false);
          }
    }
    
    public void setName(String name){
        nameLabel.setText(name);
    }
    
     public void time(){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        
        clockLB.setText(hour+":"+minute+" - "+day+"/"+month+"/"+year);
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
        jPanel1 = new javax.swing.JPanel();
        yearsP = new javax.swing.JPanel();
        year8BT = new javax.swing.JButton();
        year7BT = new javax.swing.JButton();
        year5BT = new javax.swing.JButton();
        year6BT = new javax.swing.JButton();
        year4BT = new javax.swing.JButton();
        year3BT = new javax.swing.JButton();
        year2BT = new javax.swing.JButton();
        year1BT = new javax.swing.JButton();
        clockLB = new javax.swing.JLabel();
        classInfoP = new javax.swing.JPanel();
        tutorNLB = new javax.swing.JLabel();
        classNLB = new javax.swing.JLabel();
        nStudentsLB = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        classNameLabel = new javax.swing.JLabel();
        numOfStudents = new javax.swing.JLabel();
        adminFunctionsP = new javax.swing.JPanel();
        closeBT = new javax.swing.JButton();
        searchDBsBT = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        ;

        setName("Attendance Tracking Solutions"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        listYearsP.setBackground(new java.awt.Color(248, 148, 6));

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        yearsP.setBackground(new java.awt.Color(248, 148, 6));

        year8BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year8BT.setText("Year 8");
        year8BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year8BTActionPerformed(evt);
            }
        });

        year7BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year7BT.setText("Year 7");
        year7BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year7BTActionPerformed(evt);
            }
        });

        year5BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year5BT.setText("Year 5");
        year5BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year5BTActionPerformed(evt);
            }
        });

        year6BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year6BT.setText("Year 6");
        year6BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year6BTActionPerformed(evt);
            }
        });

        year4BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year4BT.setText("Year 4");
        year4BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year4BTActionPerformed(evt);
            }
        });

        year3BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year3BT.setText("Year 3");
        year3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year3BTActionPerformed(evt);
            }
        });

        year2BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year2BT.setText("Year 2");
        year2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2BTActionPerformed(evt);
            }
        });

        year1BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year1BT.setText("Year 1");
        year1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yearsPLayout = new javax.swing.GroupLayout(yearsP);
        yearsP.setLayout(yearsPLayout);
        yearsPLayout.setHorizontalGroup(
            yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearsPLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(year1BT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(year2BT)
                .addGap(18, 18, 18)
                .addComponent(year3BT)
                .addGap(18, 18, 18)
                .addComponent(year4BT)
                .addGap(18, 18, 18)
                .addComponent(year5BT)
                .addGap(18, 18, 18)
                .addComponent(year6BT)
                .addGap(18, 18, 18)
                .addComponent(year7BT)
                .addGap(18, 18, 18)
                .addComponent(year8BT)
                .addContainerGap())
        );
        yearsPLayout.setVerticalGroup(
            yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearsPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year1BT)
                        .addComponent(year2BT))
                    .addGroup(yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year3BT)
                        .addComponent(year4BT))
                    .addGroup(yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year5BT)
                        .addComponent(year6BT))
                    .addGroup(yearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year7BT)
                        .addComponent(year8BT))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yearsP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        clockLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout listYearsPLayout = new javax.swing.GroupLayout(listYearsP);
        listYearsP.setLayout(listYearsPLayout);
        listYearsPLayout.setHorizontalGroup(
            listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listYearsPLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(clockLB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        listYearsPLayout.setVerticalGroup(
            listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listYearsPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listYearsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clockLB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(listYearsP);
        listYearsP.setBounds(0, 0, 1280, 40);

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
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classInfoPLayout.createSequentialGroup()
                        .addComponent(classNLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classInfoPLayout.createSequentialGroup()
                        .addComponent(nStudentsLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        classInfoPLayout.setVerticalGroup(
            classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classInfoPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorNLB)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classNLB)
                    .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(classInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nStudentsLB)
                    .addComponent(numOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(452, Short.MAX_VALUE))
        );

        getContentPane().add(classInfoP);
        classInfoP.setBounds(0, 40, 180, 550);

        adminFunctionsP.setBackground(new java.awt.Color(248, 148, 6));

        closeBT.setBackground(new java.awt.Color(192, 57, 43));
        closeBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        searchDBsBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchDBsBT.setText("DBs Search and C.R.U.D.");
        searchDBsBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDBsBTActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminFunctionsPLayout = new javax.swing.GroupLayout(adminFunctionsP);
        adminFunctionsP.setLayout(adminFunctionsPLayout);
        adminFunctionsPLayout.setHorizontalGroup(
            adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFunctionsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchDBsBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 877, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(39, 39, 39)
                .addComponent(closeBT)
                .addGap(41, 41, 41))
        );
        adminFunctionsPLayout.setVerticalGroup(
            adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFunctionsPLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminFunctionsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeBT)
                        .addComponent(searchDBsBT))
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(adminFunctionsP);
        adminFunctionsP.setBounds(0, 590, 1290, 60);

        DynamicPanel.setBackground(new java.awt.Color(44, 62, 80));
        DynamicPanel.setMinimumSize(new java.awt.Dimension(700, 440));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel);
        DynamicPanel.setBounds(180, 40, 1100, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Timetable Tracking Solution | Exit", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void year1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1BTActionPerformed
        
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 1");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 1 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 1");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year1BTActionPerformed

    private void year2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2BTActionPerformed
        
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 2");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 2 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 2");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year2BTActionPerformed

    private void year3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year3BTActionPerformed
        
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 3");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 3 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 3");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year3BTActionPerformed

    private void year4BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year4BTActionPerformed
        
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 4");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 4 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 4");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year4BTActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        submitButton.setVisible(true);
        
        if(evt.getClickCount() == 2){

            
            try {
                String query ="Select count() as total from attendance where name = ?";
                PreparedStatement pst=connection.prepareStatement(query); // pst object equals to object conneciton and pass in the query
                
                pst.setString(1, model.getValueAt(index, 2).toString()+" "+model.getValueAt(index, 3).toString()); // passing valuses from the users with index pramter 1 to identify the "username" + then the value
                
                ResultSet rs=pst.executeQuery(); //resultset which executes the query and the result will be transfered to the "rs" object
                
                int total = rs.getInt("total");
                pst.close();
                
                
                String id =model.getValueAt(index, 1).toString();
                String name =model.getValueAt(index, 2).toString();
                String surname =model.getValueAt(index, 3).toString();
                String phone =model.getValueAt(index, 4).toString();
                String email =model.getValueAt(index, 5).toString();
                String dob =model.getValueAt(index, 6).toString();
                String address =model.getValueAt(index, 7).toString();
                String addInformation = model.getValueAt(index, 8).toString();
                
                ProfileGUI myAddUserGUI = new ProfileGUI(total);
                myAddUserGUI.pack();
                myAddUserGUI.setVisible(true);
                myAddUserGUI.setLocationRelativeTo(this);
                
                myAddUserGUI.idTF.setText(id);
                myAddUserGUI.firstNameTF.setText(name);
                myAddUserGUI.lastNameTF.setText(surname);
                myAddUserGUI.phoneTF.setText(phone);
                myAddUserGUI.emailTF.setText(email);
                myAddUserGUI.dobTF.setText(dob);
                myAddUserGUI.addressTF.setText(address);
                myAddUserGUI.addNoteTA.setText(addInformation);
                
                myAddUserGUI.subProfileBT.setVisible(false);
                //myAddUserGUI.pathTF.setVisible(false);
                myAddUserGUI.jLabel5.setVisible(false);
                //myAddUserGUI.browsePicBT.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchDBsBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDBsBTActionPerformed
        AdminDatabases myAdminDB = new AdminDatabases();
        this.dispose();
        myAdminDB.setVisible(rootPaneCheckingEnabled);
        myAdminDB.setLocationRelativeTo(this);
    }//GEN-LAST:event_searchDBsBTActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void year5BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year5BTActionPerformed
        
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 5");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 5 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 5");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year5BTActionPerformed

    private void year6BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year6BTActionPerformed
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 6");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 6 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 6");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year6BTActionPerformed

    private void year7BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year7BTActionPerformed
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 7");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 7 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 7");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year7BTActionPerformed

    private void year8BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year8BTActionPerformed
        if(userType.equalsIgnoreCase("admin")){
            
            JOptionPane.showMessageDialog(null, "You have not students assigned to year 8");
            jTable1.setVisible(false);
        }
        else{
            try {
                String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', year as 'Year', dob as 'Date of Birth', phone as 'Phone', email as 'Email', addInformation as 'Extra Information' FROM students WHERE year = 8 AND teacher = '"+nameLabel.getText()+"'";
                PreparedStatement pst=connection.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                TableModel utilsModel = DbUtils.resultSetToTableModel(rs);
                TableModel wrapperModel = new CheckBoxwrapperTableModel(utilsModel, "Mark Attendance");
                jTable1.setModel(wrapperModel);
                jTable1.setVisible(true);
                classNameLabel.setText("Year 8");
                numOfStudents.setText(jTable1.getRowCount()+"");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_year8BTActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
         try {
            
                
                TableModel model = jTable1.getModel();
                
               
               for(int i=0;i<jTable1.getRowCount();i++){
                
                if(model.getValueAt(i, 0).toString().equalsIgnoreCase("true")){
                   
                String query ="INSERT INTO Attendance(StudentID,Name,Attendance,date) VALUES (?,?,?,?)";
                PreparedStatement pst=connection.prepareStatement(query); // pst object equals to object conneciton and pass in the query
                //pst.setString(1,"");
                pst.setString(1, model.getValueAt(i, 1).toString()); // passing valuses from the users with index pramter 1 to identify the "username" + then the value
                pst.setString(2, model.getValueAt(i, 2).toString()+" "+model.getValueAt(i, 3).toString());
                pst.setString(3, "Present");
                
                Calendar cal = new GregorianCalendar();
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                
                pst.setString(4, new String(""+day+"-"+month+"-"+year));
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Student marked as Present");
                pst.close();
                }
               }
            } catch (SQLException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel adminFunctionsP;
    private javax.swing.JPanel classInfoP;
    private javax.swing.JLabel classNLB;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JLabel clockLB;
    private javax.swing.JButton closeBT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listYearsP;
    private javax.swing.JLabel nStudentsLB;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numOfStudents;
    private javax.swing.JButton searchDBsBT;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel tutorNLB;
    private javax.swing.JButton year1BT;
    private javax.swing.JButton year2BT;
    private javax.swing.JButton year3BT;
    private javax.swing.JButton year4BT;
    private javax.swing.JButton year5BT;
    private javax.swing.JButton year6BT;
    private javax.swing.JButton year7BT;
    private javax.swing.JButton year8BT;
    private javax.swing.JPanel yearsP;
    // End of variables declaration//GEN-END:variables

}