
package data;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Shelf {
    private String color;
    private String name; 
    
    public Shelf(String color, String name) {
        this.color = color;
        this.name = name;
    }
    
    private Student[] ds = new Student[300]; 
    private int count = 0; //fact size
    
    private Scanner sc = new Scanner(System.in);
    
    public void inputAStudent() {
        System.out.println("Input student info: #" + (count + 1) + "/" + ds.length);
        
        String id, name;
        int yob;
        double gpa;
        
        //input by keyboard
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        ds[count] = new Student(id, name, yob, gpa);
        count++; 
    }
    
    public void printStudentInfo() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
            System.out.println();
        }
    }
    
}
