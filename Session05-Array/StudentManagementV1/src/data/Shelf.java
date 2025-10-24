package data;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Shelf {

    //đặc điểm của cái tủ bất kì là gì: màu sơn ___, giá tiền _____ 
    //số ngăn / không gian chứa đồ: ________ các món đồ nhét vào, món đồ là objecct
    //chứa nhiều đồ, nhiều object rõ ràng đến thời diểm hiện tại là cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng. 
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    private String color;
    private String label;

    //chứa cái gì
    private Student[] ds = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0; //mới mua tủ về, hồ sơ = 0
                           //nhét thêm hồ sơ thì count++
                           //chơi mảng thì for đến count

    //tui có không gian chứa info tôi sẽ giải quyết câu chuyện nhập xuất
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void inputAStudent() {
        Scanner sc = new Scanner(System.in);
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
            ds[i].showProfile();
            
        }
    }
}
