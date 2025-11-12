
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Cabinet {
    //tủ sẽ có nhiều ngăn chứa được nhiều món đồ. ta xài mảng ArrayList, Collection 
    //để lưu nhiều đồ 
    //từ từ các bạn sv đến nhập học, nộp hồ sơ, và ta cất vào tủ arr
    
    private List<Student> arr = new ArrayList(); 
    
    //làm biếng làm phễu luôn, mọi thứ sẽ là default, tủ từ từ được add() vô
    //mình không chơi trò mua Tủ có sẵn luôn 1 cái Túi, trong túi có sẵn hồ sơ
    //nếu muốn làm, thì new sẵn túi bên ngoài, có sẵn sv đưa vào trong tủ, okie.
    
    private Scanner sc = new Scanner(System.in); 

    //default constructor. ko làm gì cả
    public Cabinet() {
    }
    
    //hành động của cái Tủ là: thêm hồ sơ, tìm hồ sơ, sắp xếp hồ sơ, xóa hồ sơ, udpate hồ sơ
    public void addAStudent() {
        String id, name; 
        int yob;
        double gpa; 
        
        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");
               
        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase(); //cắt trăng dư. đổi qua HOA
        
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase(); 
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine()); 
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added sucessfully");
    }
    
    public void printStudenList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
    
    
}
