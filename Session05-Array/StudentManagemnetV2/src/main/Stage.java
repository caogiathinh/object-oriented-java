
package main;

import data.Shelf;
import data.Student;
import java.util.Scanner; 
/**
 *
 * @author gia.thinh
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2. IN DANH SÁCH        
        //inputStudentList();
        Shelf tuSE = new Shelf("RED", "SE");
        
        tuSE.inputStudentList();
        tuSE.inputStudentList();
        
        tuSE.printStudentList();  
    }
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in); 
        
        String id, name;
        int yob, count;
        double gpa; 
        
        System.out.print("How many student do you want to input? ");
        count = Integer.parseInt(sc.nextLine()); //MyToys.getAnInteger(???); 
             
        Student[] arr = new Student[count]; 
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine(); 
            
            System.out.print("Input name: ");
            name = sc.nextLine(); 
            
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine()); 
            
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
