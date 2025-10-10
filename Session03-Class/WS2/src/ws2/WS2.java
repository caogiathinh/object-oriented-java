/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws2;

import data.Account;
import data.Book;

/**
 *
 * @author gia.thinh
 */
public class WS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Book Atomic = new Book("Atomic Habits", "Jam Clear", 450.00);
//        Book Listen = new Book("Listen Like You Mean It", "XIMENA VENGOECHEA", 270.24);
//        Listen.show();
//        Atomic.show();
        Account thinh = new Account(1, "Thinh", "abc", "09x", 60.0);
        Account t = new Account(2, "Thinh", "abc", "091x", 100.0);
        Account h = new Account(3, "Thinh", "abc", "092x", 200.0);
        Account i = new Account(4, "Thinh", "abc", "093x", 80.0);
        Account n = new Account(5, "Thinh", "abc", "094x", 90.0);
        thinh.showInfo();
        t.showInfo();
        h.showInfo();
        i.showInfo();
        n.showInfo();
        
        System.out.println("Thinh withdraw");
        if(thinh.withdraw(50))
            System.out.println("Successful, now balance is: " + thinh.getBalance());
        else
            System.out.println("Don't successful because account must have bigger than 50000 after withdraw ");
        
        thinh.showInfo();
        t.showInfo();
        h.showInfo();
        i.showInfo();
        n.showInfo();
        
        System.out.println("t withdraw");
        if(t.withdraw(50))
            System.out.println("Successful, now t balance is: " + t.getBalance());
        else
            System.out.println("Don't successful because account must have bigger than 50000 after withdraw ");
        
        thinh.showInfo();
        t.showInfo();
        h.showInfo();
        i.showInfo();
        n.showInfo();
    }
    
}
