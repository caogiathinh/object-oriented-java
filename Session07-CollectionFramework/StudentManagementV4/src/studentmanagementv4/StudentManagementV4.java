
package studentmanagementv4;

import data.Cabinet;

/**
 *
 * @author gia.thinh
 */
public class StudentManagementV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabinet se = new Cabinet(); 
        Cabinet ia = new Cabinet(); 
        
        System.out.println("INPUT SE STUDENT(S)");
        se.addAStudent();
        se.addAStudent();
        
        System.out.println("INPUT IA STUDENT(S)");
        ia.addAStudent();
        ia.addAStudent();

        System.out.println("SE MAJOR");
        se.printStudenList();
        
        System.out.println("IA MAJOR");
        ia.printStudenList();
    }
    
}
