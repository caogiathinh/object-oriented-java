
package studentmanagement;

import data.Student;
import java.util.Scanner;


/**
 *
 * @author gia.thinh
 */
public class StudentManagement {
    public static void main(String[] args) {
       saveAStudent();
    }
    
    //nhập bàn phím
    //cần Scanner object từ bàn phím, OOP cái gì cũng object, class
    //máy Cam, Scanner tiệm photo, WC, Bàn Phím, Bàn phím cơ, bàn phím touchpad -> nhóm quét dữ liệu
    //đưa vào máy tính, Class Scanner xuất hiện. Xài phải new để cho nó hành xử
    //từ bàn phím đi vào RAM, do đó phải có biến hứng value. 
    public static void inputAStudent() {
       String id, name;
       int yob;
       double gpa; 
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Input id: ");
        id = sc.nextLine();
        System.out.println("Input name: "); //chuỗi trước để tránh trôi lệnh 
        name = sc.nextLine(); 
        System.out.println("Input yob: ");
        yob = sc.nextInt(); 
        System.out.println("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
            
    }
    
    public static void saveAStudent() {
        Student an = new Student("SE666789", "AN NGUYEN", 2001, 8.9);
        an.showProfile();
        
    }
}

