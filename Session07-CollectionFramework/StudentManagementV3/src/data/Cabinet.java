
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Cabinet {
    
    //tủ thì sẽ có nhiều ngăn chứa được nhiều món đồ: ArrayList, Collection nói chung 
    //để lưu nhiều đồ
    //từ từ các bạn sinh viên tới nhập học, nộp hồ sơ và ta cất vào tủ
    private List<Student> arr = new ArrayList(); 
    private Scanner sc = new Scanner(System.in); 
    
    //làm biếng làm phễu luôn, mọi thứ sẽ là default, Túi cứ từ từ được add() vô
    //mình không chơi trò mua Tủ có sẵn luôn 1 Cái Túi, trong Túi có sẵn hồ sơ. 
    //nếu muốn làm phải new sẵn cái Túi ở đâu đó, túi bên ngoài có sv sẵn rồi đưa vào trong tủ

    //default/empty constructor. không làm gì cả
    public Cabinet() {
    }
    
    //hành động của cái Tủ: thêm hs, xóa hs, sửa hs, sắp xếp hs, tìm kiếm hồ sơ
    public void addAStudent() {
        
        String id, name;
        int yob; 
        double gpa;
        
        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");
        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase();  //cắt khoản trắng dư, đổi qua A
                               //String là object là vùng new. 
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase(); 
        //arr.add(new Student(....)); 
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine()); 
        //                  MyToys
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine()); 
        
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully");
    }
    
    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    
}
