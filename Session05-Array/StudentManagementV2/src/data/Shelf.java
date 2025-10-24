package data;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Shelf {

    //cái tủ -> nhiều cuốn sách -> thông tin một cuốn sách
    //đặc điểm của một cái tủ bất kì là (màu sơn, giá tiền, nhà sản xuất)
    //số ngăn/không gian chứa dồ nhét vào: _______, món đồ là object
    //chứa nhiều đồ nhiều object thì cần mảng (danh sách các đối tượng)
    //OOP tìm các object phối hợp với nhau.
    private String color;
    private String label; //tủ hồ sơ SE, IA, .. 

    //chứa cái gì 
    //có thể tối ưu bằng cách qui định số lượng phần tử của mảng
    private Student[] ds = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;  //mới mua tủ về hồ sơ bằng 0 
    //nhét thêm hồ sơ thì count++
    //chơi mảng chỉ for đến cao

    //tui có không gian chứa info tui sẽ giải quyết câu chuyện nhập xuất
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void inputStudentList() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
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
            ds[i].showProfile(); //for hết là toang null pointer exception           
        }
    }
}
