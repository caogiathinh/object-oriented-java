
package ou.main;

import ou.util.MyToysV2;

/*
 *
 * @author gia.thinh
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToysV2.PI);
        
//        int n = MyToysV2.getAInteger(); 
//        System.out.println("n: " + n);
        int choice;
        choice = MyToysV2.getAInteger("Input your choice (1..7): "); 
        System.out.println("Choice: " + choice);
    }
            
}
