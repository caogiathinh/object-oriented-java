package main;

import data.Student;

/**
 *
 * @author gia.thinh
 */
public class Stage {

    public static void main(String[] args) {
        checkObjectV2();
    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.8);

        s1.showProfile();
        s2.showProfile();
        //một nhát new một clone
        
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
