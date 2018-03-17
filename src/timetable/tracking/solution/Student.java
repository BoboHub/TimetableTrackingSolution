/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

//@author Boris, Owen, Richard, Yami

public class Student {
    public int id;
    public String firstName;
    public String lastName;
    public String mothersName;
    public String fathersName;
    public int phone;
    public String email;
    public String DOB;
    public String address;
    public int year;
    public String addInformation;
    
    public Student(int id, String firstName, String lastName,String mothersName,String fathersName,int phone, String email, String DOB, String address,int year, String addInformation ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.phone = phone;
        this.email = email;
        this.DOB = DOB;
        this.address = address;
        this.year = year;
        this.addInformation = addInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddInformation() {
        return addInformation;
    }

    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }

    
    public String toString(){
            return firstName.toString();
    }
}