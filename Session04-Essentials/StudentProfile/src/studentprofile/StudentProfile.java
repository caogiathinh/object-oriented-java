/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputProfile();
    }
    
    
    //nhập thông tin sinh viên, address
    public static void inputProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info trước đã, không chơi class Student
        String name, address;
        int yob;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        yob = sc.nextInt(); //convert data từ bàn phím - từ chuỗi thành số
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();       
        
        System.out.println("\nHere is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        
    }
}
