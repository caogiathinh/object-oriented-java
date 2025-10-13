
package studentmanagement;

import data.Student; //~~mượn đồ để dùng, tìm nơi cất
import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class StudentManagement {
    public static void main(String[] args) {
       saveAsStudent();
       //inputAStudent();
    }
    
    //nhập từ bàn phím cần Scanner object bàn phím. OOP cái gì cũng Object, Class
    //máy Cam, Scanner tiệm phôt, bàn phím cơ, touch pad -> nhóm quét dữ liệu đưa
    //vào máy tính, Class Scanner xuất hiện. xài phải new để nó hành xử.
    //từ bàn phím đi vào ram, do đó phải có biến hứng value
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: "); //chuôi trước số tránh lạc trôi lệnh
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa); 
        x.showProfile();
        //x.setId(id) //nguy hiểm
        
    }
    
    //hard-code
    public static void saveAsStudent() {
        Student an = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student binh = new Student("SE662204", "BÌNH LÊ", 2004, 0.4);
        
        an.showProfile();
        binh.showProfile();
        
        //chấm xổ gì, access modifier Specifier
        System.out.println("An name (directly): " + an.name); //y chang cầu thủ dáng tên sau lưng
        System.out.println("An name (directly): " + an.getName()); 

        System.out.println("Binh name (directly): " + binh.name);      

        
        //vì sờ được trực tiếp cái name/biến/intance variable, ta có thể get() và set()
        an.name = "KHÔNG HỌC BÀI";
        
        System.out.println("An name again directly: " + an.name); //y chang cầu thủ dáng tên sau lưng
        System.out.println("Binh name again directly: " + binh.name);   
        

        an.showProfile();
        
        //sayHi() mà sayHi đang là static
        System.out.println("Using static ");
        an.sayHi();
        binh.sayHi();   
    }
    
}

//STATIC ĂN THEO THẰNG CUỐI CÙNG

