/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thinh.main;

import thinh.util.MyToys;

/**
 *
 * @author gia.thinh
 */
public class Stage {
    
    public static void main(String[] args) { //psvm -> tab: viết tắt của hàm main 
        System.out.println("PI: " + MyToys.PI);
        
//        int n = MyToys.getAInteger();
//        
//        System.out.println("n: " + n);
        int choice;
        choice = MyToys.getAInteger("Ipnut your choice (1..7): "); 
        System.out.println("Your choice is: " + choice);
        
    }
    
    
}
