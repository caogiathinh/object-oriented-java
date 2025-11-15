public class StringClass {

    public static void main() {
        playWithStrings();
    }

    public static void playWithStrings() {
        //tuần sau là tuần đầu tiên của HK Summer 2021
        //không có tiền cạp đất mà ăn à
        //Vạn lời khuyên sẽ trở nên vô nghĩa nếu bạn không bắt đầu để làm
        //Hãy vượt sướng để thành công
        //có 4 dòng, 4 object
        //Mô tả được: rất nhiều chữ cái, độ dài dòng chữ: ??
        //            gồm các kí tự nhân loại đang dùng.
        // -> thuộc một nhóm String class String xuất hiện

        String s1 = new String("HELLO");
        String s2 = new String("HELLO"); //không khuyến khích
        //nhìn không tự nhiên
        String s3 = "HELLO"; //new ngầm boxing
        String s4 = "HELLO"; //new ngầm !!!!~ Integer x = 2003;
        //pool hồ bơi tắm chung s3 s4, s4 trỏ cùng new s3, 2 chàng 1 nàng
        //pool phân biệt hoa thường
        //vẫn đề là biến nào tạo trước new trước pool biến sau nếu muốn sài đúng data đó
        //cho xài ké, cứ gán = "HELLO" này không được new, xài chung với tao
        //tắm chung, trỏ cùng

        String s5 = "Hello";
        String s6 = "hello";

        //hỏi s1 có bằng s2 không ? - con trỏ
        if (s1 == s2) //2 tọa độ khác nhau làm sao = được
            System.out.println("s1 = s2");
        else
            System.out.println("s1 éo bằng s2");
        //hỏi s3 có bằng s4 không ?
        System.out.println("s3 vs. s4? " + (s3 == s4));
        //hỏi s2 có bằng s3 không ?
        System.out.println("s2 vs. s3? " + (s2 == s3));
        //hỏi s4 có bằng s5 không ?
        System.out.println("s4 vs. s5? " + (s4 == s5));

        //=>> KHÔNG SO SÁNH 2 OBJECT QUA == MÀ PHẢI CHẤM VÀO BÊN TRONG LẤY VALUE ĐI SO SÁNH
        //CÁC OBJECT NÊN LÀM SẴN HÀM SO SÁNH BÊN TRONG CHÚNG ĐỂ ĐI SO SÁNH
        //VỚI ĐỨA KHÁC
        //SO SÁNH OBJECT PHẢI CHẤM
        //2 LOẠI CÂU HỎI: equals() compareTo()
    }
}
