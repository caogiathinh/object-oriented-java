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
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
    ////        Student xx = getAStudent("SE12345");
////        if (xx != null) //không trỏ null là trỏ vùng tìm thấy
////        {
////            xx.showProfile();
////        } else {
////            System.out.println("NOT FOUND");
////        }
//
//        //sortStudentList();
//        List<Student> result = initData();
//        System.out.println("The Student list");
//        for (Student x : result) {
//            x.showProfile();
//        }
//        
////        for (Student x : initData()) {
////            x.showProfile();
////        }
//        
//    }
        
    public static void main(String[] args) {
        List<Student> arr = initData();
        //gọi hàm search với 4 bạn sv có trong arr, mà thực ra do hàm initData() tạo ra

        Student xxx = searchAStudent(arr, "sE888888");
        if (xxx == null) {
            System.out.println("NOT FOUND");
        } else {
            //lỡ tìm thấy update lại điểm số
            xxx.showProfile(); //xxx đang trỏ vùng new bạn TÁM 8.8
            xxx.setGpa(6868);
        }
        //ra hẳn ngoài if kiểm tra điểm có 6868 hay chưa chơi lớn 
        System.out.println("Checking Student list after updating info of SE8 student");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //------------------------
    //TỬ TẾ HÀM SEARCH VÀ SORT, UPDATE LUÔN 
    //------------------------
    public static List<Student> initData() {
        //hàm trả về 1 cái túi có sẵn bên trong một nhóm sinh viên
        //trả về tọa độ của 1 cái túi, vẫn new Túi mà, trong túi có thể bài sinh viên là khác nữa
        List<Student> arr = new ArrayList<Student>();

        Student chin = new Student("SE999999", "CHIN LE", 2009, 9.9);
        arr.add(new Student("SE444444", "BON PHAM", 2004, 4.4));
        arr.add(chin);
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ  
        //
        arr.add(new Student("SE555555", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE888888", "TAM LY", 2008, 8.8));

        return arr; //initData() = arr; arrr ơi mày trỏ new Bự nào
        //cho tên hàm t trỏ với
    }

    //có thể đưa cái Giỏ vào đây cũng được
    public static void sortStudentList() {
        List<Student> arr = new ArrayList<Student>();

        Student chin = new Student("SE999999", "CHIN LE", 2009, 9.9);
        arr.add(new Student("SE444444", "BON PHAM", 2004, 4.4));
        arr.add(chin);
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ  
        //
        arr.add(new Student("SE5L55555", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE888888", "TAM LY", 2008, 8.8));
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));  // ~~arr[i] = arr[j];
                    arr.set(j, tmp);         // ~~arr[j] = tmp;
                    //set thay đổi giá trị info của con trỏ, trỏ chỗ khác.
                    //lấy thẻ bài ra khắc lại thông tin con trỏ.
                }
            }
        }
        System.out.println("With For-each");
        for (Student x : arr) {
            x.showProfile();
        }
        System.out.println("With for-i");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    //ta search tìm kiếm sinh viên dựa theo mã số. Nhận vào ds luôn cũng được
    public static Student searchAStudent(List<Student> arr, String id) {
        ///arr là cái túi đã new đâu đó rồi, tên biến là tên con trỏ mà
        //túi này có 1 nhóm sv sẵn rồi, add sẵn rồi
        if (arr.isEmpty()) {
            return null; //túi không có thẻ bài, tức là size() trả về 0 
        }                         //có sv nào được tìm thấy đâu, trả về tọa độ đáy ram
        //cpu chạy đến đây, Túi có thẻ bài rồi, có người điền tên rồi. 
        //for hỏi từng thẻ 1, ku[i] id mày là gì ? coi có bằng id cần tìm không
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if (tmp.getId().equalsIgnoreCase(id)) {
                return tmp; //return thẻ bài thứ i có trỏ vùng id tìm thấy
            }                            //thẻ bài con trỏ lưu tọa độ return tọa độ
        }
        //đi hết for mà không return được thì trả về null không tìm thấy
        return null; //hàm yêu cầu trả tọa độ vùng new, éo thấy trả về null
    }

    //Set: 1 loại giỏ, túi không cho phép đựng trùng món, không có món nào xuất hiện quá một lần
    //không cho phép trỏ trùng 1 vùng new. 
    //List: cứ có vào là đếm - số lượt người ghé. 
    //thử nghiệm hàm trả về object, thực chất là trả về tọa độ vùng new
    //đưa vào mã số sinh viên muốn tìm ta tìm trong giỏ túi thẻ bài coi có ai trùng mã số
    //thì trả về thẻ bài, hồ sơ bạn sv đó, trả về tọa độ hồ sơ sv đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList<Student>();

        Student binh = new Student("SE123457", "BINH LE", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));

        Student tmpStudent = arr.get(0); //lây được tọa độ sv 0. thẻ bài 0 
        //hỏi xme bạn í id là gì ? 
        String tmpId = tmpStudent.getId(); //arr.get(0).getId(); 
//        if (tmpId == id) return tmpStudent; //arr.get(0)
//                                            //trả về tọa độ trong thẻ bài 0 
        if (tmpId.equalsIgnoreCase(id)) {
            return tmpStudent; //arr.get(0); 
        }        //hoàn toàn không có sinh viên mới xuất hiện chỉ tham chiếu tọa độ vùng new
        //return get(0), thẻ bài 0 trỏ vùng new AN. 
        return null; //không tìm thấy
    }

    public static void playWithSet() {
        Set<Student> arr = new HashSet(); //mua một cái túi doraemon
        //mở khóa để thao tác, .hàm()
        Student an = new Student("SE123456", "AN NGUYEN", 2003, 9.0);

        arr.add(an);
        arr.add(an);  //add trùng
        arr.add(new Student("SE123457", "BINH LE", 2003, 4.9));
        arr.add(new Student("SE123457", "BINH LE", 2003, 4.9)); //éo trùng, có new có vùng ram mới 
        //OBJECT MỚI, trùng info bên trong không thành vấn đề
        //SET LÀ KHONG CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW 
        //MỖI THẺ BÀI ĐƯỢC ADD VÀO GIỎ KHÔNG TRỎ LẠI VÙNG NEW

        //không có hàm get() vì giỏ đưa đồ vào
        //thẻ bài đưa vô không giữ nguyên thứ tự như đưa vô
        //lấy thì for each, quét hết giỏ
        //thì có 2 tình huống xảy ra: HashSet, để "lộn xộn" thẻ bài
        //                                     để thẻ bài "có thứ tự" theo cách riêng
        //khác hoàn toàn thứ tự kiểu ArrayList
        //ArrayList là vào trước, add trước ngồi trước, sau ngồi sau
        //giỏ chứa bao nhiêu thẻ bài, add 3 lần, arrayList add bao nhiu có bấy nhiêu
        System.out.println("The student list");
        for (Student x : arr) { //duyệt qua từng con trỏ, lấy tọa độ 
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
        List<Student> arr = new ArrayList<Student>();

        Student binh = new Student("SE123457", "BINH LE", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));
        arr.add(binh);  //đưa địa chỉ vùng new là được
        arr.add(binh); //add trùng
        //có 2 tọa độ thẻ bài trong túi
        //get() từng thẻ bài thì được tọa độ vùng new
        //[i] được tạo độ vùng new, y chang mảng, mỗi phàn tử mảng là tọa độ 
        System.out.println("The student list");
        //mảng đang giảm dần về điểm, túi đang giảm dần về điểm 
        //thẻ bài 1 trỏ vùng điểm cao, thẻ bài hai trỏ vùng điểm thấp
        for (Student x : arr) { //arr là 1 đống con trỏ, đóng tham chiếu
            x.showProfile();
        }

        System.out.println("The student list (printed using for i)");
        for (int i = 0; i < arr.size(); i++) {
            Student x = arr.get(i); //lấy tọa độ con trỏ nằm vị trí thứ i
            x.showProfile();

        } //CÓ TỌA ĐỘ CHẤM LUÔN

        //MẢNG CHƠI [I] SỜ NGAY CON TRỎ 
        //túi phải mở ra, để lấy gọi hàm .hàm 
        Student tmp = arr.get(0);
        arr.set(0, arr.get(1)); //con trỏ thứ 0 trong giỏ, thể bài thứ 0
        //phải trỏ thằng Bình 4.9
        arr.set(1, tmp);
        //con trỏ 1 thay chỗ trỏ, trỏ vào vùng tmp đang trỏ  
        //                                      tmp đang trỏ AN 9.0
        //vùng new Student() nằm im, chỉ có thẻ bài trong giỏ trỏ lại

        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

        arr.remove(1);  //AN
        System.out.println("The student list after removing a student");
        for (Student x : arr) {
            x.showProfile();
        }
        //còn lại bình chứng tỏ đúng true
        //đổi được 2 thằng đổi được cả mảng
    }
}
