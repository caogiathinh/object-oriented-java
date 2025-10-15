package main;

import data.Student;

/**
 *
 * @author gia.thinh
 */
public class Stage {

    public static void main(String[] args) {
        Student ahihi = checkObjectV8();
        
        ahihi.showProfile();
    }

    //hàm trả về object 
    //đọc chuẩn: hàm trả về 1 tọa độ của object nào đó, có tọa độ nghĩa là 
    //sờ được object, có tọa độ, chấm là tới object
    public static Student checkObjectV8() {

        Student x; //khai báo con trỏ nhưng chưa trỏ ai
        
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        
        return x; //lưu tọa vùng clone AN, hường 6M
                  //thảy tọa độ đó cho tên hàm, tên hàm là 6M 

    }

    public static void checkObjectV7() {

        Student x; //khai báo con trỏ nhưng chưa trỏ ai
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        x.showProfile();

    }

    public static void checkObjectV6() {

        //object không có tên gọi, vẫn hành xử dc
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        Student x = s1;
        //nguyên vùng new đã tương đương tọa độ rồi, 
        //gửi biến giữ tọa độ
        //nếu biến mà chấm tức là tọa độ chấm
        //CHỐT: NEW NẮM TỌA ĐỘ 
        new Student("SE666789", "AN NGUYEN", 1999, 8.9).showProfile();
        //ko đặt tên cho object - anonymous object, object was created without a name, a reference
        //xuất hiện xong clear liền, garbage collector clear ngay
        //muốn re-use một vùng new, tối thiểu ít nhất 1 tên gọi, 1 biến obejct
    }

    public static void checkObjectV5() {

        //2 chàng - 1 nàng
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        Student x = s1;

        s1.showProfile();
        x.showProfile(); //backup tọa độ vùng new con trỏ, trỏ trùng

        s1.setName("CHOI TRON TIM");

        System.out.println("After TAT");
        x.showProfile();
        //nhiều tên cùng tham chiếu 1 đối tượng
    }

    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        Student x = s1;
        s1 = new Student("SE666789", "LOC PHAT", 1998, 8.8);

        s1.showProfile();
        x.showProfile(); //backup tọa độ new vào 1 biến khác cùng kiểu

    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        s1 = new Student("SE666789", "LOC PHAT", 1998, 8.8);

        s1.showProfile();
        System.gc(); //gom rác HEAP
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        Student s2 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);

        s1.setName("AI ROI CUNG KHAC");

        s1.showProfile();
        s2.showProfile();
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
