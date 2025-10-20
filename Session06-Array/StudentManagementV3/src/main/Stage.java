
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
        
        tuSE.inputAStudent();
        tuSE.inputAStudent();
        
        tuSE.printStudentInfo();
                
    }
    
}
