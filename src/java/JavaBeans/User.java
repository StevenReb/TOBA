package JavaBeans;

import java.beans.*;
import java.io.Serializable;

public class User implements Serializable {
    
    // UserBean variables
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
    
    // Setter
    public void setUsername (String username) {
        this.username = username;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    // Getter for customer data
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
    
    public String getUsername () {
        return username;
    }
    
    public String getPassword () {
        return password;
    }
    
}
