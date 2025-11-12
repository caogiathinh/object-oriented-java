package studentmanagementv2;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author gia.thinh
 */
public class StudentManagementV2 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //sortArrayListManually();
//        //playWithSet();
////        Student xxx = getAStudent("se123456");
////
////        if (xxx != null) {
////            xxx.showProfile();
////        } else {
////            System.out.println("NOT FOUND");
////        }
//        //sortStudentList();
//        List<Student> result = initData(); 
//        System.out.println("The student list");
//        for (Student x : result) {
//           x.showProfile();
//        }
//        
//        searchAStudent(result, "SE123456");
//    }
        
    public static void main(String[] args) {
        List<Student> arr = initData(); 
        //gọi hàm search với 4 bạn sinh viên đã có trong arr, mà hàm initData() đã tạo 
        Student xxx = searchAStudent(arr, "sE888888");
        
        if (xxx != null) {
            //lỡ tìm thấy update lại điểm số
            xxx.showProfile(); //xxx đang trỏ vùng new bạn TÁM
            xxx.setGpa(6868);
        }
        else
            System.out.println("NOT FOUND");
        
        //ra hẳn ngoài if kiểm tra có 686868 hay chưa ?
        System.out.println("Checking student list after updating info of the SE8 student");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //-------------------
    //TỬ TẾ SEARCH VÀ SORT, UPDATE
    public static List<Student> initData() {
        //hảm trả về 1 cái Túi có sẵn bên trong một nhóm Sinh Viên
        //trả về tọa độ 1 cái Túi, vẫn new Túi mà, trong túi chứa thẻ bài sinh viên là khác
        List<Student> arr = new ArrayList();

        Student chin = new Student("SE999999", "CHIN LE", 2009, 9.9);
        arr.add(new Student("SE444444", "BON PHAM", 2004, 4.4));
        arr.add(chin);
        arr.add(new Student("SE444444", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE888888", "TAM LY", 2008, 8.8));
        
        return arr;     //initData() = arr;  arr ơi mày đang trỏ ai new Bự nào
                        //cho tên hàm tao trỏ với
    }
    //                                có thể đưa cái giỏ vào
    //ta search/tìm kiếm 1 hồ sơ sinh viên dựa theo mã số. có nhận vào danh sách luôn cũng được
    
    public static Student searchAStudent(List<Student> arr, String id) {
        //arr là một cái túi new đâu đó rồi, tên biến là con trỏ
        //trong túi này có 1 nhóm sinh viên sẵn rồi, add sẵn rồi
        if (arr.isEmpty()) //túi không có thể bài, tức là size() trả về 0 
            return null; 
        //CPU chạy đến đây túi có thể bài rồi, danh sách có người điền tên rồi
        //for hỏi từng thẻ một
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) { //tránh so sánh =
                return arr.get(i);  //thẻ bài con trỏ có lưu tọa độ return tọa độ
            }
        }
        //đi hết for mà không return được chắc chắn LÀ KHÔNG CÓ 
        return null;
    }         
            
    public static void sortStudentList() {
        List<Student> arr = new ArrayList();

        Student chin = new Student("SE999999", "CHIN LE", 2009, 9.9);
        arr.add(new Student("SE444444", "BON PHAM", 2004, 4.4));

        arr.add(chin);
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ

        arr.add(new Student("SE444444", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE888888", "TAM LY", 2008, 8.8));
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i); 
                    arr.set(i, arr.get(j)); 
                    arr.set(j, tmp); 
                } //set thay đổi info của con trỏ, trỏ chỗ khác
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    //-------------------
    //THỬ NGHIỆM HÀM TRẢ VỀ OBJECT 
    //đưa vào mã số sv muốn tìm 
    //ta sẽ tìm trong giỏ, túi thẻ bài coi có ai mà trùng mã số 
    //thì trả về thẻ bài hồ sơ bạn sinh viên đó, trả về tạo độ hồ sơ sinh viên đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList();

        Student binh = new Student("SE999999", "BINH LE", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));

        arr.add(binh);

        Student tmp = arr.get(0);
        String tmpId = tmp.getId();

        if (tmpId.equalsIgnoreCase(id)) {//arr.get(0).getId() 
            return tmp;  //arr.get(0)
        }
        return null;

    }

    //Set: là 1 loại giỏ túi không cho phép đựng trùng món không có món nào xuất hiện quá 1 lần
    //ko cho phép trỏ cùng 1 vùng NEW
    //List cứ có là đếm 
    public static void playWithSet() {

        Set<Student> arr = new HashSet<Student>();  //mua cái túi doraemon
        //mở khóa để thao tác, .hàm()
        Student an = new Student("SE123456", "AN NGUYEN", 2003, 9.0);
        arr.add(an);
        arr.add(an); //add trùng

        arr.add(new Student("SE123457", "BINH LE", 2003, 4.9));
        arr.add(new Student("SE123457", "BINH LE", 2003, 4.9)); //cái này không trùng có new có vùng nhớ mới
        //OBJECT MỚI, TRÙNG INFO KỆ
        //SET LÀ KHÔNG CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW
        //MỖI THỂ BÀI ADD VÀO GIỎ, KHÔNG TRỎ LẠI VÙNG NEW NÀO ĐÓ
        //không có hàm get() vì loại giỏ này đưa đồ vào. thẻ bài vào
        //không giữ nguyên thứ tự như đưa vô
        //lấy thì FOR EACH, QUÉT HẾT GIỎ
        //có 2 tình huống xảy ra: HashSet: để "lộn xộn" thẻ bài
        //                                 để thẻ bài "có thứ tự" theo cách riêng
        //KHÁC HOÀN TOÀN THỨ TỰ KIỂU ARRAY LIST 
        //ARRAY LIST LÀ VÀO TRƯỚC, ADD TRƯỚC NGỒI TRƯỚC, VÀO SAU NGỒI SAU

        //GIỎ CHỨA MẤY THẺ BÀI? ADD 3 LẦN, ARRAYLIST ADD BAO NHIÊU CHỨA BẤY NHIÊU
        System.out.println("The student list");
        for (Student x : arr) { //duyệt qua từng con trỏ lấy tọa độ 
            //từng thẻ bài gán vào con trỏ x
            x.showProfile();
        }
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

        //có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên
        //1 người khỏi danh sách, 
        //vùng new Student() bị mất hay không tùy vào mấy con trỏ trỏ nó
        //size() giảm liền, mảng éo có, fix cứng số con trỏ
        //set() đảo con, trỏ sang vùng new khác hàm (get() hàm set() xưa nay của các object)
    }

    //tự sort danh sách sinh viên bằng tay
    //còn 1 cơ chế ta không cần dùng vòng for tự viết
    //hàm static: Collections.sort(); //dùng chơi với INTERFACE mới được
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList<Student>(); //đi mua cái túi Doraemon

        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));

        Student binh = new Student("SE999999", "BINH LE", 2003, 4.9);
        arr.add(binh); //đưa tọa độ vùng new 
        //có 2 tọa độ trong túi, 2 thẻ bài trong túi 
        //get() từng thẻ bài được tọa độ vùng new
        //[i] để tọa độ vùng new,  y chang mảng, mỗi phần tử mảng là 1 tọa độ
        System.out.println("The student list");
        //mảng đang giảm dần về điểm, túi đang giảm dần về điểm
        //thẻ bài 1 trỏ vùng điểm cao, thẻ bài 2 trỏ vùng điểm thấp
        for (Student x : arr) { //trong arr là 1 đống con trỏ
            x.showProfile();
        }
        System.out.println("The student list (printed using for i)");
        for (int i = 0; i < arr.size(); i++) {
            //Student x = arr.get(i); //lấy tọa đang nằm trỏ thứ i
            //x.showProfile();
            arr.get(i).showProfile();
        } //nhớ câu có tọa độ chấm luôn 

        //MẢNG SỞ NGAY CON TRỎ THỨ I 
        //túi phải mở ra, để lấy, gọi qua hàm
        //đổi được 2 thằng thì đổi được cả mảng
        Student tmp = arr.get(0); //tmp trỏ cùng AN 
        arr.set(0, arr.get(1));  //con trỏ thứ 0 trong giỏ, thẻ bài thứ 0 
        //phải trỏ thằng BÌNH 4.9
        arr.set(1, tmp);
        //con trỏ 1 thay cách trỏ, trỏ vào vùng tmp đang trỏ
        //                         tmp đang trỏ AN 9.0 
        //vùng new Student() vẫn nằm im chỉ có thẻ bài trong giỏ 
        //trỏ lại vùng new
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        arr.remove(1);

        System.out.println("The student list after removing a student");
        for (Student x : arr) {
            x.showProfile();
        }
        //bản chất là thay đổi vị trí trỏ vùng new vẫn giữ nguyên
    }
}
