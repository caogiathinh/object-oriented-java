package main;

import data.Student;

/**
 *
 * @author gia.thinh
 */
public class Stage {

    public static void main(String[] args) {
        //checkObjectV8();
        Student Ahihi = checkObjectV8(); //ahihi lưu tọa độ của AN trong hàm thảy ra ngoài
        Ahihi.showProfile();
    }

    //hàm trả về 1 object hả thầy, ko 
    //đọc chuẩn, hàm trả về 1 tọa độ của object nào đó, vì trả được tọa độ nghĩa là 
    //sờ dc object, có tọa độ chấm là tới object
    
    //             Student x;
    public static Student checkObjectV8() { // ~ Student x = sẽ là 1 vùng new

        Student x; 
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        return x; //x lưu tọa độ vùng clone AN, hướng 6< 
                  //thảy tọa độ đó cho tên hàm, tên hàm là 6M, hướng 6M

    }

    public static void checkObjectV7() {

        Student x; //khai báo con trỏ nhưng chưa trỏ ai 
        //tao với mày nói về thằng x kia đi 
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //à nó đây nè
        //x = new ()

    }

    public static void checkObjectV6() {

        //câu chuyện của sinh ra rồi chết non 
        //câu chuyện vô danh tên gọi 
        //object ko thèm, kh có tên gọi, f
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //          đã tương đương tọa độ rồi, thảy tọa độ đó đi đâu hoy
        //          thảy cho biến object nào đó giữ giùm tọa độ 
        //biến đó mà chấm nghĩa là tọa độ chấm, NGHĨA LÀ NEW CHẤM LUÔN 
        //vì biến có tọa độ từ new. CHỐT HẠ: NEW NẮM TẠO ĐỘ
        //chấm là vào trong tọa độ xem có cái gì, trong object có gì ?? 

        new Student("SE666789", "AN NGUYEN", 1999, 8.9).showProfile();
        //ko thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
        //object vô danh, anonymous object, object was created without a name, a reference
        //XUẤT HIỆN XONG, GÁY XONG, GRABAGE COLLECTOR PHÁT HIỆN KHÔNG CÓ CON TRỎ 
        //CLEAR
        //MÚN RE-USE LẠI VÙNG NEW TỐI THIẾU ÍT NHẤT 1 TÊN GOI, 1 BIẾN OBJECT
        //ĐỂ CÒN CHẤM TIẾP 
    }

    public static void checkObjectV5() {

        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student x = s1;

        s1.showProfile();
        x.showProfile(); //backup tọa độ new AN ở trên, trên 1 con trỏ trên cùng
        //chứng minh 2 chàng trỏ đúng 1 nàng
        //chàng 1 tát, chàng 2 thấy
        s1.setName("MINH CHOI U TIM HEN");
        //trong vùng new AN NGUYEN đã bị thay đổi thành MÌNH CHƠI .. 
        System.out.println("After TAT");
        //hông thèm hỏi s1, hỏi luôn x xem sao
        x.showProfile();

        //nhiều tên cùng tham chiếu một đối tượng - 1 object
        //tí tèo -> (Mình...)
        //hoàng, gl, xàm, đa cấp, -> (Tui)
        //cùng 1 tên ám chỉ nhiều object khác
        //sếp = ST
        //sếp = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM CHIẾU
    }

    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        Student x = s1; //mày là biến lưu tọa độ vùng new, cho tọa độ đi
        //nếu như tao new như mày, ra vùng clone mới

        //int a = 10;
        //int b = a; //cho tao value của mày, tao muốn lấy value của mày
        //trước khi s1 trỏ tọa độ mớ, backup tọa độ cũ
        //giữ được An
        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.8);
        s1.showProfile();
        x.showProfile(); //AN trở lại, backup tọa độ lưu vào 1 biến khác cùng kiểu.  

    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.8);
        //con diều đứt dây
        //vì sợi dây nối với diều mới LP

        //s1 li dị vùng clone AN, chuyển sang kết nối với LP 
        //ống nhòm dờm sang chỗ mới, con trỏ lưu tọa độ mới, biến thay đổi value
        //lưu value gần nhất 
        //int a = 10; a = 100; hỏi a là mấy: 100    
        //s1 là biến object
        //tui cần lắm luôn tọa độ vùng new, vùng Clone Student
        s1.showProfile();
        //mất tọa độ vùng clone AN
        //vùng RAM không có ai trỏ tới, thì định kì khi chạy app, JVM (phần chạy song song)
        //Window kiểm soát app bạn. clear vùng CLONE không có con trỏ
        //CÔNG TY MÔI TRƯỜNG ĐÔ THỊ - JVM có đoạn code, module giám sát HEAP, xem có đứa nào mồ coi kh?
        //giết ngay và luôn ~~ free (con trỏ bên C chơi malloc())
        //anh giám sát này gọi là Garbage Collector, người gom rác
        System.gc(); //gom rác vùng HEAP

        //ngoài đời có gán lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = (ông, gã chấm lương cho mình, qđ mình tăng lương hay không)
        //tí = mày, tao ba má gọi ở nhà
        //tí = NGÔ THANH VÂN & câu chuyện trạng Tí.
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student s2 = new Student("SE666788", "BINH  LE", 1998, 8.8);
        s1.setName("AI ROI CUNG KHAC");

        s1.showProfile();
        s2.showProfile();
        //một nhát new một clone, 2 sinh viên khác nhau, 2 vùng ram khác nhau

    }

    public static void checkObjectV1(String[] args) {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //reference                 object, vùng RAM bự trong HEAP
        //pointer var                instance, thể hiện, hiện thân, bức tượng
        //object var
        s1.showProfile();
        //      s1 đang nắm/lưu tọa độ vùng ram object trong heap
        //          new làm nhiều việc 
        //              1. clone khuôn (object và static)
        //              2. gọi phễu dổ data vào vùng clone
        //              3. chốt lại tọa độ của vùng new vùa rồi, đem tọa độ đó gán cho biến con trỏ 

        //s1 là biến, vậy nó có thể thay đổi value
        //sếp với bạn trẻ đang trỏ tới casi Sơn Tùng
        Student x = s1; //2 con trỏ trỏ cùng vùng new 

        s1 = new Student("SE666788", "BINH  LE", 1998, 8.8);

        System.out.println("s1 now is BINH");
        s1.showProfile();

        System.out.println("An after S1 reject");
        x.showProfile();

        //AN NGUYEN LÚC NÀY KHÔNG CÒN AI TRỎ, KO CÒN CÁCH NÀO LẤY LẠI DUDOC VÙNG RAM NÀY
        //TỌA ĐỘ NEW CŨ TA KHÔNG GIỮ LẠI 
        //biến object là tay cầm con diều, new chính là con diều.
        //khi tay cầm nối dây con diều mới, con diều cũ ko còn chơi được nữa, dứt dây bay mất
        //1 vùng ram k còn ai trỏ tới, JVM có chương trình ngầm gọi là  
        //GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW KHÔNG CON TRỎ, ĐỂ GIẢI PHÓNG RAM FREE HEAP
        //trả lại ram không sài nữa cho các câu lệnh new sau này
        //1 biến có quyền trỏ vùng new, giữ lại An mà vẫn có Bình
    }
}
