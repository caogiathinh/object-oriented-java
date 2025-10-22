package data;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Shelf {

    //đặc điểm của cái tủ??
    private String color;
    private String label;

    //đặc điểm chính cần focus
    //dung lượng không gian chứa là bao nhiêu ?? 
    //có nhiều cách khác nhau ?? 
    //1. đóng sẵn kích thước 
    //2. kích thước theo yêu cầu, đưa vào phễu
    private Student[] arr = new Student[300]; //sẵn kích thước
    //logic của mảng: cần có kích thước, value từng phần tử mảng từ từ tính
    //khi chơi với mảng phải biết chơi for đến đâu thôi, coi chừng null pointer
    //add vào đúng vị trí từ trái sang phải
    //ta cần 1 biến count để nói về số lượng đang có trong mảng
    //sure non static
    private int count = 0;   //mới mua tủ thì chưa có hồ sơ cụ thể
    //non-static cho những đặc tính ở trên
    private Scanner sc = new Scanner(System.in);
    //constructor làm những việc gì ? đổ info vào 
    //bài này đổ màu sắc, tủ dùng cho việc gì {lable}
    //đặt hàng dung lượng, hoặc fix dung lượng
    //câu hỏi: sao em không đưa hồ sơ sinh viên thật vào
    //mua tủ trống nhét hồ sơ vào từ từ hợp lí hơn.
    //nhét ngay 1 lần hết hồ sơ vào tủ là không thực tế.
    //bỏ hồ sơ vào tủ thực sự lặp đi lặp lại nhiều lần với cái tủ
    //hàm thêm hồ sơ sinh viên ở cái tử là hợp lí: ai có nhiều info, kẻ đó xử lí

    //addSV(), xoaSV().... 
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
        //this.count = 0; //mới mua tủ thì chưa có hồ sơ cụ thể
        //có thể đưa qua con đường phễu nhưng không hay, vì đây là thứ người dùng 
        //khi mua tủ không cần biết, họ chỉ cần biết kích thước tối đa .
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //hành động add mới hồ sơ sv sẽ lập lại cho mỗi cái tủ, dk member
    public void addAStudent() {
        //chơi for là toang, phải là từ từ, nó sẽ được liên tục bổ sung theo 
        //quy trình công ty, cách làm cái tủ quản lí sách
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student: #" + (count + 1) + "/" + arr.length);

        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr[count] = new Student(id, name, yob, gpa);
        count++; //đã add xong một hồ sơ, thì phải sẵn sàng cho vị trí kế tiếp
        //bao nhiêu lần mở tủ add() hồ sơ, bấy nhiêu lần count tăng lên ... 
    }

    //y chang danh sách số kênh đã add vào cái tivi
    public void printStudentList() {
        System.out.println("There is/are " + count + " student(s)  in the list");
//        for (Student x : arr) {
//            x.showProfile();
//        } //coi chừng null pointer
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
    
    public void searchAStudent() {
        //đưa đi vào từ bàn phím, tìm sv theo id
        //for từ đầu đến cuối mảng, lôi từng sinh viên so sánh mã số sv
        //với id gõ vào, = nhau thì done, tìm sv ở vị trí thứ i
        String id;
        System.out.print("Input student id that you want to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found!! Here she/he is");
                arr[i].showProfile();
                return; //thoát hàm luôn, vì mã số sv duy nhất, thầy rồi không còn ai để for.
            }
        }
        
        System.out.println("Student not found!!!");
    }
}
