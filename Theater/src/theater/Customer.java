/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.Date;

/**
 *
 * @author Erika92
 */
public class Customer extends Person{
    private int customerId;
    private String email;
    private String phoneNumber;
    private String city;
    
    //constructor
    public Customer(int customerId, String email, String phoneNumber, String city, int id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.customerId = customerId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
    
     //getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
