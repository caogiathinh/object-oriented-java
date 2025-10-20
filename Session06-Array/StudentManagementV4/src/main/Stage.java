package main;

import data.Shelf;

/**
 *
 * @author gia.thinh
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
