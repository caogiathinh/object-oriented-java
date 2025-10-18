
package main;


import java.util.Scanner;
import data.Student;

/**
 *
 * @author gia.thinh
 */
public class Stage {
    public static void main(String[] args) {
        inputStudentList();
    }
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        
        System.out.println("How mayny students do you want to input? ");
        count = Integer.parseInt(sc.nextLine()); //MyToys.getAnInteger(???)
        
        Student[] arr = new Student[count];
       
        for (int i = 0; i < count; i++) {
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
        System.out.println("Student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
