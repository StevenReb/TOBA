package JavaBeans;

import java.beans.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import JavaBeans.User;

@Entity
public class Account {
    
    private User user;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;
    private double balance;
    

    public Account () {
        balance = 0;
    }
    
    public Account (double money) {
        this.balance += money;
    }

    private void credit (double credit) {
        this.balance += credit;
    }
    
    private void debit (double debit) {
        this.balance -= debit;
    }
}

