package data;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Shelf {

    private String color;
    private String label;

    private Student[] ds = new Student[300];

    private int count = 0;

    private Scanner sc = new Scanner(System.in);

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void addAStudent() {

        String id, name;
        int yob;
        double gpa;

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
    
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
    }
}
