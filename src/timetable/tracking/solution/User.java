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
    
    public String name;
    
    public int phone;
    
    public String email;
    
    public String dob;
    
    public String address; 
    
    public String jobCategory;
    
     /**
     * Checks if a minimum amount of fields have been set.
     *
     * Name, email must be set.
     *
     * @return Whether this customer can be saved.
     */
    public boolean validates() {
        if (name.equals("") || email.equals("")) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    /**
     * Returns the full name of a customer and email from the customer
     * @return
     */
   // public String getFullName() {
     //    return String.format("%s %s", name, address);
    //}
    
}
