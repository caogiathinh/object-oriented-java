package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gia.thinh
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static void playWithArrayList() {
        //Student[]    arr  = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new thảy vào
        //tên mảng chính là má mì quản lí nhiều đồ, tên túi luôn
        
        //List arr = new ArrayList(); //lộn xộn đủ loại con trỏ
        //đúng nghĩa túi doraemon, món gì cũng được, đựng tham chiếu thoi nha
        //nhét được NhanVien, GiangVien, Animal, ... 
        

        //túi đồng nhất con trỏ chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList();
        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ thì mới dễ chấm chung đa hình được
        
        //mở ngăn tủ, túi, nhét đồ vô
        arr[i] = new Student(....);  //mảng
        arr.add(new Student)
    }

}
