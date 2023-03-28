/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azfarsufianproject1;
import java.util.*;
/**
 *
 * @author sufia
 */
public class Customer {
    private String customerName;
    private boolean isMember;
    private boolean hasPaidMemberFee;
    private double moneySpent;
    public ArrayList<Book> booksPurchased;
    public ArrayList<CD> cdsPurchased;
    public ArrayList<DVD> dvdsPurchased;
    
    public Customer(String aname) {
    this.customerName = aname;
    this.booksPurchased = new ArrayList();
    this.cdsPurchased = new ArrayList();
    this.dvdsPurchased = new ArrayList();
    this.moneySpent = 0.0;
    }
    
    public Customer(){
        this.booksPurchased = new ArrayList();
        this.cdsPurchased = new ArrayList();
        this.dvdsPurchased = new ArrayList();
    }
    
    public String getCustomerName() {
    return customerName;
    }
    
    public double getMoneySpent() {
    return moneySpent;
    }
    
    public void purchasePremiumMembership() {
    isMember = true;
    this.moneySpent += 20;
    }
    
    public void incrementMoneySpent(double amount) {
    moneySpent += amount;
    }
    
    public void setCustomerName(String name) {
        this.customerName = name;
    }
}
