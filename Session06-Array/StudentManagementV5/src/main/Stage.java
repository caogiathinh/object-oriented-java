package main;

import data.Shelf;
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
        Scanner sc = new Scanner(System.in);
        int choice;
        
        Shelf tuSE = new Shelf("PINK", "SE");
        
        do {
            printMenu();
            System.out.print("Input your choice (1..6): ");
            choice = Integer.parseInt(sc.nextLine()); //kiểm tra myToys
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choice 1..6 options");
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Welcome to SIS");
        System.out.println("Choose the following function play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }
}
