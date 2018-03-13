/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

/**
 *
 * @author x16110561
 */
public class Student {
    
    
    private String studentName;
    private String mothersName;
    private String fathersName;
    private String homeAddress;
    private int phone;
    private String email;
    private String information;
    
    public Student(String studentName,String mothersName,String fathersName,String homeAddress,int phone, String email, String information ){
        this.studentName = studentName;
        this.mothersName = mothersName;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.email = email;
        this.information = information;
            
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    public String toString(){
            return studentName.toString();
    }
    
    
}
