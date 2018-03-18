/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

//@author Boris, Owen, Richard, Yami

public class User {
      // We can have a userType here to tell if user is a teacher or an admin
     
    public String id; 
    public String firstName;
    public String lastName;
    public String address; 
    public int phone;
    public String email;
    public String dob;
    
    public User(String id, String firstName, String lastName, String address, int phone, String email, String dob){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.dob = dob;
    }
    
     /**
     * Checks if a minimum amount of fields have been set.
     *
     * Name, email must be set.
     *
     * @return Whether this customer can be saved.
     */
    public boolean validates() {
        if (firstName.equals("") || email.equals("")) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
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

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Returns the full name of a customer and email from the customer
     * @return
     */
   // public String getFullName() {
     //    return String.format("%s %s", name, address);
    //}
    
}
