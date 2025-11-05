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
        playWithArrayList();

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
        //arr[i] = new Student(....);  //mảng
        //arr.add(new Student(....)) //lưu con trỏ thôi, new Student() thoải mái bên ngoài
        //bên ngoài vùng HEAP
        Student s1 = new Student("SE123456", "AN NGUYEN", 2003, 9.0);

        Student s2 = new Student("SE123457", "BINH LE", 2003, 9.0);

        arr.add(s1); //giỏ vùng new ArrayList, tủ thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2); //sinh ra thêm 1 con trỏ nữa [1]
                     //add() vô tận, mảng[length -1] hết mức
                     //new cứ nằm ở HEAP, 
        //add() mở khóa dây khóa kéo, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ 
        arr.add(s1); ///add trùng nè 1 tên người vào danh sách,
        //Set không báo lỗi, chỉ lấy 1.... đừng đi vào chi tiết vội vã!!!
        
        arr.add(new Student("SE999999", "CHIN PHAM", 2003, 9.0));
        //new cứ lên HEAP, bệnh nhân về phòng mà nằm, nắm thẻ bài. 
        //một con trỏ nữa lại được add vào
        
        
        //hỏi xem túi đang có bao nhiêu đồ
        //arr.length hỏi túi mà má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " mon do");
        //4 sinh viên in ra nhưng thực ra chỉ có 3 sinh viên, do có người đếm trùng
        
        //in mọi người ra
        //tủ có gì, chưa bên trong một đóng con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ1, con-tror2, con-trror3, con-tro4, ...] nếu add() thêm
        //add() đẩy vào 1 con trỏ muốn lấy, trả về tọa độ con trỏ thứ i
        //                                  trả về địa chỉ vùng new đang trỏ
        //[i] lấy được tham chiếu của bạn thứ i 
        //get(i) lấy được chỗ ngồi tham chiếu con trỏ thể bài thứ i 
        //a, thẻ này trỏ bạn sinh viên kia kìa
        
        //in bạn đầu tiên
        //arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); //trả về tọa độ con trỏ thẻ bài bạn thứ 0 
        //trả về tọa độ gán vào biến Student khác nằm cùng tọa độ cũng okie
        System.out.println("The student list");
        xxx.showProfile();
        
        //bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ
        //cùng làm gì ?? 
        arr.get(1).showProfile(); //á đù trả về con trỏ, học rồi bảy viên ngọc rồng
        
        System.out.println("In Xin So");
        for (Student x : arr) { //éo sớ null pointer add() đến đâu thêm  con trỏ tới đó
            //x = arr.get(i) = arr[i]
            x.showProfile();
        }
        
        //có hành động xóa 1 con trỏ, loại bỏ thể bài, món đồ, gạch tên
        //1 người khỏi danh sách, 
        //vùng new Student bị mất hay không còn tùy vào mấy con trỏ trỏ nó
        //size() giảm liền, mảng éo có, fix cứng số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác(get() hàm set() truyền thống từ xưa nay của các
        //các object)
        System.out.println("-------------------");
        arr.remove(0); 
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
