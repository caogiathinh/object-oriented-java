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
        //ráp menu cảm giác 1 cái app 
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE");
        do {
            printMenu();
            System.out.print("Input your choice (1..6): "); //my Toys là ngon nhất
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 options");
                    break;
            }
        } while (choice != 6); //còn đúng còn làm
    }

    public static void printMenu() {
        System.out.println("Welcome to SIS");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print a student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }

    public static void testShelf() {
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");
        tuSE.addAStudent();
        tuSE.addAStudent();

        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR");
        tuGD.addAStudent();

        System.out.println("The student list for all");
        System.out.println("SE Student");
        tuSE.printStudentList();
        System.out.println("GD Student");
        tuGD.printStudentList();

    }

}
