/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author gia.thinh
 */
public class Account {
    private int accoutID; 
    private String ownerName; 
    private String cccd; 
    private String phone; 
    private double balance; 

    public Account(int accoutID, String ownerName, String cccd, String phone, double balance) {
        this.accoutID = accoutID;
        this.ownerName = ownerName;
        this.cccd = cccd;
        this.phone = phone;
        this.balance = balance;
    }

    public int getAccoutID() {
        return accoutID;
    }

    public void setAccoutID(int accoutID) {
        this.accoutID = accoutID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showInfo() {
        System.out.printf("|%4d|%-20s|%-10s|%-10s|%4.1f|\n", accoutID, ownerName, cccd, phone, balance);
    }
    
    public boolean withdraw(double amount) {
        if (this.balance - amount < 50) {
            return false;
        }
        this.balance -= amount;
        return true; 
    }
}
