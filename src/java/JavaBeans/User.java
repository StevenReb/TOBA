package JavaBeans;

import java.beans.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import JavaBeans.Account;

@Entity
public class User implements Serializable {
    
    private Account account;
    // UserBean variables
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String username;
    private String password;
    
    // No-argument constructor
    public User () {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
        username = "";
        password = "";
    }
    
    // Constructor setting all variables
    public User (String firstName, String lastName, String phone,
                        String address, String city, String state, 
                        String zipCode, String email){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        
        this.username = lastName + zipCode;
        this.password = "welcome1";
    }
    
    // Setters
    public void setUserId (Long userId) {
        this.userId = userId;
    }
    
    public void setUsername (String username) {
        this.username = username;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    public void setPhone (String phone) {
        this.phone = phone;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
    public void setState (String state) {
        this.state = state;
    }
    
    public void setZipCode (String zipCode) {
        this.zipCode = zipCode;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    
    // Getters
    public Long getUserId () {
        return userId;
    }
    
    public String getUsername () {
        return username;
    }
    
    public String getPassword () {
        return password;
    } 
    public String getFirstName () {
        return firstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public String getPhone () {
        return phone;
    }
    
    public String getAddress () {
        return address;
    }
    
    public String getCity () {
        return city;
    }
    
    public String getState () {
        return state;
    }
    
    public String getZipCode () {
        return zipCode;
    }
    
    public String getEmail () {
        return email;
    } 
}
