import java.sql.SQLOutput;

public class WrapperClass {

    public static void main(String[] args) {
        playWithIntegers();
    }

    public static void playWithPointers() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        //3 lệnh này tương đương value lõi
        //hỏi: num1 có = num2 hay không, hỏi num3 cũng okie
    }

    public static void playWithIntegers() {
        int num0 = 2003; // tốn một vùng ram  4 byte, đặt tên là num0, ON OFF 2003
        Integer num1 = new Integer("2004"); //2 vùng ram, con trỏ, và new...
                                               //lõi vùng new có int value = 2003;
        Integer num2 = new Integer(2005);
        Integer num3 = 2006; //cách viết tiện nhất, tự nhiên nhất
                             //thực tế là vẫn new Integer
        //cách ta lấy con số literal (số xuất hiện trong code) chính là primitive
        //gói lại thành 1 vùng new mà nhân chính là primitive,
        //cách này được gọi là đóng gói primitive - BOXING A PRIMITIVE VALUE
        //BOXING: PRIMITIVE -> WRAPPER OBJECT

        //sử dụng như bình thường
        System.out.println("num0: " + num0); //xài trưc tiếp primitive vùng RAM
        System.out.println("num1: " + num1.toString()); //gọi thầm tên em
        System.out.println("num2: " + num2.toString()); //mở hộp lấy value ra xài int
        System.out.println("num3: " + num3.intValue()); //ra xài, unboxing

        int num4 = num1; //hiện tượng mở hộp, không phải ép kiểu
                         //UNBOXING từ object -> primitive
                         //mở vùng NEW LẤY VALUE/NHÂN/LÕI GỐC PRIMITIVE

        System.out.println("num4: " + num4);

        Integer num5 = num0; //boxing, new ngầm Interger(2003)
        System.out.println("num5: " + num5);

        //num0 đang bằng 2003
        num0 = 20010726;
        //gán giá trị mới cho biến primitive, đè vào là xong, 1 vùng ram
        System.out.println("num0 again: " + num0);
        //num5 là biến con trỏ trỏ vùng new Integer(2003);
        num5 = 20210711; //ram điều gì diễn ra
        //biến Integer mỗi lần = value mới primitive => new Integer mới

        //VÙNG INTEGER ĐƯỢC NEW KO CÓ HÀM SET() CHỈ CÓ HÀM GET()
        //muốn thay đổi nhân cãi lõi, gói bánh mới, new mới đi
        //INTEGER là OBJECT READ-ONLY
        //CLASS KO CÓ HÀM SỬA, CHỈ NEW XONG XÀI VALUE ĐÃ ĐỔ, ĐỔ 1 LẦN
        //KHÔNG SỬA, READ-ONLY OBJECT, IMMUTABLE CLASS/OBJECT
    }
    //CÓ 8 CÁI CLASS TRAI BAO, WRAPPER CLASS (IMMUTABLE CLASS)
    //Byte, Short, Integer, Long, Float, Double, Boolean, Character
    //byte  sort    int     long   float double   boolean   char
    //xài new cũng được, gán trực tiếp okie (new ngầm)
    //
}
