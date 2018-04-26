/*
Classname Staff.java
Date 25/4/18
@Yamina Santillan (x16110561) 
 * 
 */
package timetable.tracking.solution;

//@author Boris, Owen, Richard, Yami

public class Staff extends User{

    public String jobCategory;
    public String username;
    public String password;
    
    public Staff(String id, String firstName, String lastName, String address, int phone, String email, String dob, String jobCategory, String username, String password){
        super(id, firstName, lastName, address, phone, email, dob);
        this.jobCategory = jobCategory;
        this.username = username;
        this.password = password;
    }

    public String getJobCategory() {
        return jobCategory;
    }
    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}