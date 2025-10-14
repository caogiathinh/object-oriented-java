
package thinh.main;

import thinh.util.MyToys;

/**
 *
 * @author gia.thinh
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0; 
        System.out.println("PI again: " + MyToys.PI);
        int choice;
        choice = MyToys.getAnInteger("Input an integer (1..7): ");
        System.out.println("Your choice: " + choice);
        
    }
}
