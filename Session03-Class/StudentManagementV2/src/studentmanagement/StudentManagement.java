
package studentmanagement;

import data.Student;
import java.util.Scanner;


/**
 *
 * @author gia.thinh
 */

public class StudentManagement {
    //hiểu được static sẽ hiểu tại sao các hàm khác phải có thêm static 
    //nằm cùng chỗ với main thì mới gọi được.
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
        //x.setId //nguy hiểm.    
    }
    
    public static void saveAStudent() {
        Student an = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student binh = new Student("SE662204", "BINH LE", 2001, 0.4);
        
        an.showProfile();
        binh.showProfile();
        
        //chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("An name (dicrectly): " + an.name); //y chang cầu thủ dán tên sau lưng
        System.out.println("An name (dicrectly): " + an.getName());
        

        System.out.println("Binh name (dicrectly): " + binh.name);

        //vì sờ được trực tiếp cái name/biến/instance/variable, ta có thể get() và set() 
        //an.name = "KHONG HOC BAI";
        Student.name = "CAY RANK HON CAY CODE";

        System.out.println("Binh name (dicrectly): " + binh.name);        
        System.out.println("An name (dicrectly): " + an.name);
                 
        System.out.println("Student name (dicrectly): " + Student.name);

        an.showProfile();
            
        //sayHi() mà sayHi() đang là static 
        System.out.println("Using static");
        an.sayHi(); //đồ static không tư hữu theo kiểu của riêng mình
        
        binh.sayHi(); 
        
        Student.sayHi(); //tên Class chấm static vì đồ chung cho multiple object
       
        //có 2 loại dấu chấm
        //chấm trực tiếp qua tên Class tức là sờ chạm STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với NON-STATIC
        //                                  đồ của riêng từng object
        //tọa sơn quan hổ đấu. 
    }
}


