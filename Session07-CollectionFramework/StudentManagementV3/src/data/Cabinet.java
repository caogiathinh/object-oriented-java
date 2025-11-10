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

    //ta làm hafmd tìm kiếm sinh viên với 2 mục đích: 
    //1. phục vụ tính năng tìm một sv theo id
    //2. phục vụ thêm cho việc kiểm tra id có trùng hay không khi tạo mới
    //   1 hồ sơ sinh viên
    //hàm search có 2 cách trả về: trả về vị trí tìm thấy trong Túi/int pos
    //                              trả về 1 object/tọa độ object/tham chiếu
    //hàm helper
    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        ///nếu thấy trả ngay cái thẻ thứ i tham chiếu vùng new chứa id tìm thấy
        /////đi hết cả for sure không tồn tại
        return null;
    }

    //hàm bao hàm search ở trên 
    public void searchAStudent() {
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("FOUND. Here he/she is");
            xxx.showProfile();
        }
    }

    //hành động của cái Tủ: thêm hs, xóa hs, sửa hs, sắp xếp hs, tìm kiếm hồ sơ
    public void addAStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");

        //dùng lại hàm SEARCH ĐỂ KIỂM TRA COI ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ TỒN TẠI CHƯA ? 
        //CẤM TRÙNG ID - BÊN DB GỌI LÀ PRIMARY KEY - KHÓA CHÍNH CẤM TRÙNG
        //TƯƠNG ĐƯƠNG ĐĂNG KÝ MEMBER, LOGIN NAME, ACCOUNT NAME CHỬI TRÙNG ÉO CHO ĐI TIẾP
        //CÒN TRÙNG LÀ CÒN CHỬI, ÉO CHO ĐI TIẾP 
        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();  //cắt khoản trắng dư, đổi qua A
            //String là object là vùng new. 
            Student xxx = searchAStudent(id); 
            if (xxx == null) //id éo tồn tại trong giỏ, thoát đi tiếp
                break;
            else 
                System.out.println("Duplicated id. Try with another one!!!");
        }

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
        
    public void updateAStudent(Student x, double newGPA) {
        x.getGpa();
    }
    
    public void updateAStudent(String id, double newGPA) {
        Student xxx = searchAStudent(id); 
        if (xxx == null)  {
            System.out.println("NOT FOUND! Nothing to update");
            return; 
        }
        
        xxx.setGpa(newGPA);
    }
       
    public void updateAStudent() {
        String keyword;
        double newGpa; //giá tiền mà kiểu int
        
        System.out.print("Input the student id you want to update info: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null)
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        else {
            System.out.println("FOUND. Here he/she is before updating");
            xxx.showProfile();
            
            System.out.print("Input a new gpa: ");
            newGpa = Double.parseDouble(sc.nextLine()); //MyToys
            xxx.setGpa(newGpa);
            
            System.out.println("FOUND. Here he/she is after updating new gpa");
            xxx.showProfile();
        }
    }
}
