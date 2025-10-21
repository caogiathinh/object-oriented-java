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
        
        System.out.println("Input profile student: #" + (count + 1) + "/" + ds.length);
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
    
    public void searchStudent() {
        //đưa id vào từ bàn phím, tìm sv theo id
        //for từ đầu đến count của mảng, lôi từng sinh viên ra hỏi. 
        //so sánh id  gõ vào = nhau thì báo tìm thấy không thì báo ko tìm thấy
        String id; 
        System.out.print("Input student id that you want to search: ");
        id = sc.nextLine(); 
        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found!!! Here she/he is: ");
                ds[i].showProfile();
                return; //thoát hàm luôn vì chỉ có 1 mã số sinh viên
            }
        }
        System.out.println("Student not found!!!!");
    }
}
