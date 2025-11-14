
package studentmanagementv4;

import data.Cabinet;
import data.Student;
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
        se.addAStudent();
        se.addAStudent();

        se.printStudentList();
        //search kh thấy
        se.searchAStudent();
        //search thấy
        se.searchAStudent();

    }
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//
//        System.out.println("INPUT SE STUDENT(S)");
//        se.addAStudent();
//        se.addAStudent();
//
//        System.out.println("INPUT IA STUDENT(S)");
//        ia.addAStudent();
//        ia.addAStudent();
//
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//
//        System.out.println("IA MAJOR");
//        ia.printStudentList();
//    }
}
