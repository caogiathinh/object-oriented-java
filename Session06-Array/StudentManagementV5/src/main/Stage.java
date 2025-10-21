/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import data.Shelf;

/**
 *
 * @author gia.thinh
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shelf tuSE = new Shelf("PINK", "SE"); 
        
        tuSE.addAStudent();
        
        tuSE.printStudentList();
    }
    
}
