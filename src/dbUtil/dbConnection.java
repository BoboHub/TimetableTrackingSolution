/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//@author Boris, Owen, Richard, Yami

//Class to connect to the DB
public class dbConnection {
    
    //Create a GLOBAL variable called conn
    Connection conn = null;
    
    //Method called dbConnector to return the connection
    public static Connection dbConnector() {
        try {
            //Define the class for connection to the SQLite
            Class.forName("org.sqlite.JDBC");
            
            //Creates the connection
            Connection conn = DriverManager.getConnection("jdbc:sqlite:H:\\Semester IV\\TimetableTrackingSolution-master\\src\\tracking_database.sqlite");
                
            //For test purposes only
            JOptionPane.showMessageDialog(null, "The connection was successful");
            
            //Once we have the connection we return it
            return conn;
            
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        return null;
        }
    }
}
