/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

/**
 *
 * @author Bobo
 */
public class TimetableTrackingSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Declares and creates a new instance of GaaTicketsApplicationGUI
       /** MainGUI newMainGUI = new MainGUI();
        newMainGUI.setVisible(true); **/
       
       
       
       
       
          
       // the Main GUI shold be activated by the Log in button but I couldnt make it work
	   //In the Login GUI we can set the mainGUI to visible when the user clicks login
       
        LoginForm newLoginForm = new LoginForm();
        // Sets the GUI to be visible to the user
        newLoginForm.setVisible(true);
        // Sets the GUI to the center of the screen once the code is executed
        newLoginForm.setLocationRelativeTo(null);
      
    }
    
}
