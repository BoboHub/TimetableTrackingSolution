/*
Classname TimetableTrackingSolution.java
Date 25/4/18
@author:Boris Figeczky (x15048179)
@Owen Crabtree (x16118791) 
 
 * 
 */
package timetable.tracking.solution;

//@author Boris, Owen, Richard, Yami

public class TimetableTrackingSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //The Main GUI shold be activated by the Log in button but I couldnt make it work
        //In the Login GUI we can set the mainGUI to visible when the user clicks login
       
        LoginForm newLoginForm = new LoginForm();
        // Sets the GUI to be visible to the user
        newLoginForm.setVisible(true);
        // Sets the GUI to the center of the screen once the code is executed
        newLoginForm.setLocationRelativeTo(null);
      
    }
}