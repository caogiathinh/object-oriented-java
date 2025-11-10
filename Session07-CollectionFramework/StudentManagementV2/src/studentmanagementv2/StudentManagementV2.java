package studentmanagementv2;

import data.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gia.thinh
 */
public class StudentManagementV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithArrayList();
    }

    //đây chỉ là tạm thời. 
    public static void playWithArrayList() {

        //Student arr[] = new Student[500]; 
        //arr là 1 cái túi chứa sẫn 500 chỗ, 500 món đồ có thể bỏ vô. 
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn
        //List arr = new ArrayList(); //đựng lộn xộn đủ loại con trỏ
        //đúng nghĩa túi Doraemon, món gì cũng đựng, đụng tham chiếu thôi nha
        //nhét được NhanVien, GiangVien, Animal, Dog, .. 
        //túi đồng nhất con trỏ chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList(); //túi đựng đồng nhất 1 món GENERIC
        //List<Student> arr = new ArrayList<>()
        //List<Student> arr = new ArrayList<Student>()

        //đừng dại dột new List vì là anonymous phải implements all methods 
        //arr là cái túi chứa vô hạn chỗ, vô hạn các con trỏ
        //nhét đồng nhất món đồ thì mới dễ chấm chung được, đa hình được
        //mở ngăn tủ, nhét đồ vô
        //arr[i] = new Student(....); //mảng
        // arr.add(new Student(.......)); //lưu danh sách, lưu con trỏ hoi 
        //bên ngoài, vùng HEAP
        //chỉ cần lưu danh sách sinh viên, tham chiếu
        Student s1 = new Student("SE123456", "AN NGUYEN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BINH LE", 2003, 9.0);

        arr.add(s1);  //giỏ vùng new ArrayList, tủ đã có thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2);  //sinh ra thêm 1 con trỏ nữa [1]
        //add() vô tận, mảng[length - 1] hết mức
        //new cứ nằm trên heap sinh viên cứ ở nhà, công nhân cứ ở xưởng, bệnh nhân cứ ở phòng bệnh 
        //add() mở khóa kéo, khóa dây, nhét đồ tham chiếu, thẻ bài   
        //sỉnh ra con trỏ
        arr.add(s1); //add trùng nè 1  tên người vào trong danh sách, 
        //Set không báo lỗi, chỉ lấy 1 ... đừng đi vào chi tiết vội  

        arr.add(new Student("SE999999", "CHIN PHAM", 2003, 9.0));
        arr.add(new Student("SE888888", "TAM PHAM", 2003, 9.0));
        //new cứ lên HEAP mà nằm, Bệnh nhân cứ về phòng, tớ nắm thẻ bài
        //1 con trỏ nữa được add vào

        //hỏi xem túi có bao nhiêu đồ 
        //arr.length, hỏi tú mà, hỏi biến má mì mà 
        System.out.println("The bag has: " + arr.size() + " mon do");
        for (Student x : arr) { //không sợ NULL POINTER vì add đến đâu thêm con trỏ tới đó
            x.showProfile();
            //x = arr.get(i) = arr[i] 
        }
        //5 sinh viên in ra, nhưng thực ra chỉ có 4 sv, do có người đếm trùng
        
        //in mọi người ra, tủ có gì, chứa bên trong một đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ-1, con-tror2- contro3, ...., nếu add thêm]
        //add() đẩy vào 1 con trỏ, trả vè tọa độ con trỏ thứ i
        //                          trả về địa chỉ vùng new đang trỏ
        //[i] lấy được tham chiếu bạn thứ i
        //get(i) lấy được chỗ ngồi tham chiếu con trỏ thể bài thứ i. 
        //a, thẻ này trỏ bạn sinh viên kia kìa
        
        //in bạn đầu tiền
        //arr[0].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); //trả về tọa độ con trỏ thẻ bài của bạn thứ 0, 
        //trả về tọa độ gán vào biến Student khác nằm cùng tọa độ okie
        System.out.println("--------------------------");
        xxx.showProfile();
        //bạn 1 thì get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì ??
        arr.get(1).showProfile(); //quy tắc bắt cầu. 
    }
}
