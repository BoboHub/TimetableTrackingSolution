/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbUtil;
/*import.java.sql.*;
import.javax.swing.*; 
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**

    
 * @author Bobo
 */
public class dbConnection {
    Connection conn = null;
    
    public static Connection dbConnector() {
        try {
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Richard\\Documents\\GitHub\\TimetableTrackingSolution\\TimetableTrackingSolution\\src\\tracking_database.sqlite");
                JOptionPane.showMessageDialog(null, "Connecton was successful");
                return conn;
        }
        catch (Exception e)    
        {
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
  
}
