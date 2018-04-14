/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

import dbUtil.dbConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

//@author Boris, Owen, Richard, Yami

public class AdminDatabases extends javax.swing.JFrame {
    
    //global varibales
    private ImageIcon format = null;
    String filename = null;
    int s = 0;
    byte[] person_image = null;
    
    //Create a GLOBAL variable called connection
    Connection connection = null;
    
    //Creates new form AdminDatabases
    
    public AdminDatabases() {
        initComponents();
        
        connection = dbConnection.dbConnector();
        
        takeStudentsData();
        takeStaffData();
    }
    
    public void takeStudentsData(){
        try{
            String query = "SELECT id as 'Student ID', firstName as 'Name', lastName as 'Surname', mothersName as 'Mothers Name', fathersName as 'Fathers Name', phone as 'Phone Number', email as 'Email', dob as 'Date of Birth', address as 'Address', year as 'Year', teacher as 'Teacher' FROM students";
            
            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            //Declare a result set - execute the query and pass it to the rs
            ResultSet rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(115);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(105);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(125);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(135);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(30);
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                        
            pst.close();
            rs.close();
             
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
    public void takeStaffData(){
        try{
            String query = "SELECT id as 'Staff ID', firstName as 'Name', lastName as 'Surname', username as 'Username', password as 'Password', jobCategory as 'Job Category',userType as 'User Type', phone as 'Phone', email as 'Email', dob as 'Date of Birth', address as 'Address' FROM staff";
            
            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            //Declare a result set - execute the query and pass it to the rs
            ResultSet rs = pst.executeQuery();
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            //Sizes below not finished yet
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(115);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(85);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(85);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(105);
            
            
            pst.close();
            rs.close();
             
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
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
        addInfoTA.setText(null);
        
        searchTF1.setText(null);
        idTF1.setText(null);
        firstNameTF1.setText(null);
        lastNameTF1.setText(null);
        phoneTF1.setText(null);
        emailTF1.setText(null);
        dobTF1.setText(null);
        addressTF1.setText(null);
        usernameTF.setText(null);
        passwordTF.setText(null);
        jobCategoryTF.setText(null);
        userTypeTF.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        searchBT = new javax.swing.JButton();
        clearBT = new javax.swing.JButton();
        saveBT = new javax.swing.JButton();
        updateBT = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dobTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mothersNameTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fathersNameTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        yearTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        teacherTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addInfoTA = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        picLB = new javax.swing.JLabel();
        pathTF1 = new javax.swing.JTextField();
        browsePicBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                //Disable cells to be edited
                return false;
            }
        }
        ;
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTF1 = new javax.swing.JTextField();
        searchBT1 = new javax.swing.JButton();
        clearBT1 = new javax.swing.JButton();
        saveBT1 = new javax.swing.JButton();
        updateBT1 = new javax.swing.JButton();
        deleteBT1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        idTF1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        firstNameTF1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lastNameTF1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        emailTF1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        dobTF1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phoneTF1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        addressTF1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        picLB1 = new javax.swing.JLabel();
        browsePicBT1 = new javax.swing.JButton();
        pathTF = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jobCategoryTF = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        userTypeTF = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                //Disable cells to be edited
                return false;
            }
        }
        ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database");

        jPanel3.setBackground(new java.awt.Color(240, 244, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Students C.R.U.D. Functionality"));
        jPanel3.setPreferredSize(new java.awt.Dimension(1136, 250));

        jLabel1.setText("Search");

        searchBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchBT.setText("Search");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });

        clearBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearBT.setText("Clear");
        clearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTActionPerformed(evt);
            }
        });

        saveBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveBT.setText("Save");
        saveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTActionPerformed(evt);
            }
        });

        updateBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateBT.setText("Update");
        updateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTActionPerformed(evt);
            }
        });

        deleteBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteBT.setText("Delete");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Name");

        jLabel5.setText("Surname");

        jLabel6.setText("Email");

        jLabel7.setText("DOB");

        jLabel8.setText("Tel");

        jLabel9.setText("Address");

        jLabel10.setText("Mother");

        jLabel11.setText("Father");

        jLabel12.setText("Year");

        jLabel13.setText("Add Info");

        jLabel14.setText("Teacher");

        addInfoTA.setColumns(20);
        addInfoTA.setRows(5);
        jScrollPane1.setViewportView(addInfoTA);

        jPanel6.setBackground(new java.awt.Color(240, 244, 243));

        picLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        browsePicBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        browsePicBT.setText("Search");
        browsePicBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePicBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(browsePicBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pathTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(picLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picLB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsePicBT)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameTF))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneTF)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lastNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addressTF)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(205, 205, 205))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(clearBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mothersNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(teacherTF)
                    .addComponent(fathersNameTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBT)
                            .addComponent(clearBT)
                            .addComponent(saveBT)
                            .addComponent(updateBT)
                            .addComponent(deleteBT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(mothersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(fathersNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(teacherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Students Database", jPanel1);

        jPanel4.setBackground(new java.awt.Color(240, 244, 243));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Students C.R.U.D. Functionality"));
        jPanel4.setPreferredSize(new java.awt.Dimension(1136, 250));

        jLabel2.setText("Search");

        searchBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchBT1.setText("Search");
        searchBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBT1ActionPerformed(evt);
            }
        });

        clearBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearBT1.setText("Clear");
        clearBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBT1ActionPerformed(evt);
            }
        });

        saveBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveBT1.setText("Save");
        saveBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBT1ActionPerformed(evt);
            }
        });

        updateBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateBT1.setText("Update");
        updateBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBT1ActionPerformed(evt);
            }
        });

        deleteBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteBT1.setText("Delete");
        deleteBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBT1ActionPerformed(evt);
            }
        });

        jLabel15.setText("ID");

        jLabel16.setText("Name");

        jLabel17.setText("Surname");

        jLabel18.setText("Email");

        jLabel19.setText("DOB");

        jLabel20.setText("Tel");

        jLabel21.setText("Address");

        jPanel7.setBackground(new java.awt.Color(240, 244, 243));

        picLB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        browsePicBT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        browsePicBT1.setText("Search");
        browsePicBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePicBT1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(browsePicBT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(picLB1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(pathTF))
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browsePicBT1)
                    .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel22.setText("Username");

        jLabel23.setText("Password");

        jLabel24.setText("Job Category");

        jLabel25.setText("User Type");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBT1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dobTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstNameTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(phoneTF1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lastNameTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addressTF1))
                                .addGap(183, 183, 183))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(clearBT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveBT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jobCategoryTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTypeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(passwordTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(searchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBT1)
                            .addComponent(clearBT1)
                            .addComponent(saveBT1)
                            .addComponent(updateBT1)
                            .addComponent(deleteBT1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(firstNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(lastNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(emailTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dobTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel21)
                                .addComponent(addressTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jobCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25)
                                .addComponent(userTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24))
                        .addGap(60, 60, 60)))
                .addGap(19, 19, 19))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Staff Database", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        try{
            String query = "SELECT * FROM students WHERE firstName=? COLLATE NOCASE";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, searchTF.getText());
            ResultSet rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            pst.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBTActionPerformed

    private void searchBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBT1ActionPerformed
        try{
            String query = "SELECT * FROM staff WHERE firstName=? COLLATE NOCASE";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, searchTF1.getText());
            ResultSet rs = pst.executeQuery();

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

            pst.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBT1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.getSelectedRow();
            String id = (jTable1.getModel().getValueAt(row, 0).toString());
            
            String query = "SELECT * FROM students WHERE id='"+id+"'";
            PreparedStatement pst = connection.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                idTF.setText(rs.getString("id"));
                firstNameTF.setText(rs.getString("firstName"));
                lastNameTF.setText(rs.getString("lastName"));
                mothersNameTF.setText(rs.getString("mothersName"));
                fathersNameTF.setText(rs.getString("fathersName"));
                phoneTF.setText(rs.getString("phone"));
                emailTF.setText(rs.getString("email"));
                dobTF.setText(rs.getString("dob"));
                addressTF.setText(rs.getString("address"));
                yearTF.setText(rs.getString("year"));
                teacherTF.setText(rs.getString("teacher"));
                addInfoTA.setText(rs.getString("addInformation"));
            }
            
            pst.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
           
    }//GEN-LAST:event_jTable1MouseClicked

    private void clearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTActionPerformed
        clearFields();
        takeStudentsData();
    }//GEN-LAST:event_clearBTActionPerformed

    private void saveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTActionPerformed
        try{
            String query = "INSERT INTO students (id, firstName, lastName, mothersName, fathersName, phone, email, dob, address, year, teacher, addInformation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
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
            pst.setString(12, addInfoTA.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data saved into students DB successfully!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        takeStudentsData();
        
        clearFields();
    }//GEN-LAST:event_saveBTActionPerformed

    private void updateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTActionPerformed
        try{
            String query = "UPDATE students SET id='"+idTF.getText()+"', firstName='"+firstNameTF.getText()+"', lastName='"+lastNameTF.getText()+"', mothersName='"+mothersNameTF.getText()+"', fathersName='"+fathersNameTF.getText()+"', phone='"+phoneTF.getText()+"', email='"+emailTF.getText()+"', dob='"+dobTF.getText()+"', address='"+addressTF.getText()+"', year='"+yearTF.getText()+"', teacher='"+teacherTF.getText()+"', addInformation='"+addInfoTA.getText()+"' WHERE id='"+idTF.getText()+"'";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data successfully updated into students DB!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        
        takeStudentsData();
        
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
        takeStudentsData();
        
        clearFields();        
    }//GEN-LAST:event_deleteBTActionPerformed

    private void clearBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBT1ActionPerformed
        clearFields();
        takeStaffData();
    }//GEN-LAST:event_clearBT1ActionPerformed

    private void saveBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBT1ActionPerformed
        try{
            String query = "INSERT INTO staff (id, firstName, lastName, username, password, jobCategory, userType, phone, email, dob, address, profilePic) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, idTF1.getText());
            pst.setString(2, firstNameTF1.getText());
            pst.setString(3, lastNameTF1.getText());
            pst.setString(4, usernameTF.getText());
            pst.setString(5, passwordTF.getText());
            pst.setString(6, jobCategoryTF.getText());
            pst.setString(7, userTypeTF.getText());
            pst.setString(8, phoneTF1.getText());
            pst.setString(9, emailTF1.getText());
            pst.setString(10, dobTF1.getText());
            pst.setString(11, addressTF1.getText());
            pst.setBytes(12, person_image);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data saved into staff DB successfully!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        takeStaffData();
        
        clearFields();   
    }//GEN-LAST:event_saveBT1ActionPerformed

    private void updateBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBT1ActionPerformed
        try{
            String query = "UPDATE staff SET id='"+idTF1.getText()+"', firstName='"+firstNameTF1.getText()+"', lastName='"+lastNameTF1.getText()+"', username='"+usernameTF.getText()+"', password='"+passwordTF.getText()+"', jobCategory='"+jobCategoryTF.getText()+"', userType='"+userTypeTF.getText()+"', phone='"+phoneTF1.getText()+"', email='"+emailTF1.getText()+"', dob='"+dobTF1.getText()+"', address='"+addressTF1.getText()+"' WHERE id='"+idTF1.getText()+"'";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data successfully updated into staff DB!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        
        takeStaffData();
        
        clearFields(); 
    }//GEN-LAST:event_updateBT1ActionPerformed

    private void deleteBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBT1ActionPerformed
        try{
            String query = "DELETE FROM staff WHERE id='"+idTF1.getText()+"'";

            //Pass the query to the preparedStatement
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Data successfully deleted from staff DB!");
                        
            pst.close();
                         
        }catch(Exception e){
            e.printStackTrace();
        }
        takeStaffData();
        
        clearFields();        
    }//GEN-LAST:event_deleteBT1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            int row = jTable2.getSelectedRow();
            String id = (jTable2.getModel().getValueAt(row, 0).toString());
            
            String query = "SELECT * FROM staff WHERE id='"+id+"'";
            PreparedStatement pst = connection.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                idTF1.setText(rs.getString("id"));
                firstNameTF1.setText(rs.getString("firstName"));
                lastNameTF1.setText(rs.getString("lastName"));
                usernameTF.setText(rs.getString("username"));
                passwordTF.setText(rs.getString("password"));
                jobCategoryTF.setText(rs.getString("jobCategory"));
                userTypeTF.setText(rs.getString("userType"));
                phoneTF1.setText(rs.getString("phone"));
                emailTF1.setText(rs.getString("email"));
                dobTF1.setText(rs.getString("dob"));
                addressTF1.setText(rs.getString("address"));
            }
            
            pst.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void browsePicBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePicBT1ActionPerformed

        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();
        filename = f.getAbsolutePath(); /// stores the path for the picture to be displayed
        String path = f.getAbsolutePath(); // stores the path for the path TEXT field
       
        pathTF.setText(filename); 
       
        format = new ImageIcon(path); // shows the path in text field
        picLB1.setIcon(format); // dispalys the picute
        
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum; (readNum=fis.read(buf))!=-1; ){
                bos.write(buf, 0, readNum);
            }
                person_image=bos.toByteArray();
        
        }catch (Exception e){
            e.printStackTrace();  
        }
    }//GEN-LAST:event_browsePicBT1ActionPerformed

    private void browsePicBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePicBTActionPerformed
        
        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();
        filename = f.getAbsolutePath(); // stores the path for the picture to be dispyed
        String path = f.getAbsolutePath(); // stores the path for the path TEXT field
       
        pathTF1.setText(filename); 
       
        format = new ImageIcon(path); // shows the path in text field
        picLB.setIcon(format); // dispalys the picute
        
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum; (readNum=fis.read(buf))!=-1; ){
                bos.write(buf, 0, readNum);
            }
                person_image=bos.toByteArray();
        
        }catch (Exception e){
            e.printStackTrace();  
        }
    }//GEN-LAST:event_browsePicBTActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDatabases.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDatabases.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDatabases.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDatabases.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDatabases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addInfoTA;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField addressTF1;
    private javax.swing.JButton browsePicBT;
    private javax.swing.JButton browsePicBT1;
    private javax.swing.JButton clearBT;
    private javax.swing.JButton clearBT1;
    private javax.swing.JButton deleteBT;
    private javax.swing.JButton deleteBT1;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField dobTF1;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField emailTF1;
    private javax.swing.JTextField fathersNameTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField firstNameTF1;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField idTF1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jobCategoryTF;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField lastNameTF1;
    private javax.swing.JTextField mothersNameTF;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JTextField pathTF;
    private javax.swing.JTextField pathTF1;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField phoneTF1;
    private javax.swing.JLabel picLB;
    private javax.swing.JLabel picLB1;
    private javax.swing.JButton saveBT;
    private javax.swing.JButton saveBT1;
    private javax.swing.JButton searchBT;
    private javax.swing.JButton searchBT1;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField searchTF1;
    private javax.swing.JTextField teacherTF;
    private javax.swing.JButton updateBT;
    private javax.swing.JButton updateBT1;
    private javax.swing.JTextField userTypeTF;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}
