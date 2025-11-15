import java.sql.SQLOutput;

public class WrapperClass {

    public static void main(String[] args) {
        //playWithIntegers();
        //playWithPointers();
        playWithPool();
    }

    public static void playWithPointers() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        //3 lệnh này tương đương value lõi
        //hỏi: num1 có = num2 hay không, hỏi num3 cũng okie
        boolean result = num1 == num2;
        System.out.println("num1 == num2?? " + result);
        if (num2 == num3)
            System.out.println("num2 = num3 ");
        else
            System.out.println("num2 != num3 vì đi so sánh 2 địa chỉ tọa độ vùng new");

        Integer num4 = 2004;
        if (num3 == num4)
            System.out.println("num3 = num4 ");
        else
            System.out.println("num3 != num4 vì đi so sánh 2 địa chỉ tọa độ vùng new");

        //kết luận không so sánh Obejct dùng các toán tử truyền thống > >= < <= == !=
        //vì biến Object bản thân nó chỉ là tọa độ tham chiếu 1 vùng mew có nhiều info
        //muốn so sánh 2 biến Object dùng toán tử trên tương đương đi so sánh 2 địa chỉ
        //vớ vẫn, không ai so sánh số nhà
        //vào nhà xem info mà so sánh
        //vào vùng new Integer(....) lấy value lõi ra mà so
        //á đù vào vùng new Integer() làm gì đó, so sánh value hả
        //muốn so sánh 2 object/biến object ta sẽ chấm để...
        //                                               gọi hàm so sánh value bên trong

        //Integer phải có hàm so sánh cái lõi với nhau
        //hàm nằm trong Integer thì lấy value lõi
        //GL rules: ai có nhiều info, gã đó có hàm xử lí
        System.out.println("num3 vs. num4 (core value): " + num3.equals(num4));
        System.out.println("num3 vs. num4 (core value): " + num3.compareTo(num4));
        System.out.println("num4 vs. num3 (core value): " + num4.compareTo(num3));

    }

    //chốt hạ: không so sánh 2 biến Object dùng > < =
    //chấm vào bên trong để so sánh các đặc điểm lõi
    //phải viết hàm so sánh 2 Object() vì sau này chấm lấy value lõi mà so sánh

    public static void playWithPool() {
        Integer num1 = 2001;
        Integer num2 = 2001;
        //num1 có bằng num 2 ko ? không
        System.out.println("num1 vs num2: " + (num1 == num2)); //false 2 tọa độ khác nhau
        //lõi num1 có bằng lõi num2 hay không ? có
        System.out.println("num1 vs num2 (core value): " + (num1.equals(num2)));
        if (num1.equals(num2))
            System.out.println("2 thằng bằng nhau trong lõi");
        else
            System.out.println("Đến cả lõi còn khác nhau");

        //vi diệu
        Integer num3 = -127; //trỏ lõi -129
        Integer num4 = -127; //trỏ cùng, éo tạo vùng new mới
        //Integer pool hồ bơi cho vùng new lõi có giá trị trong đoạn
        //[-128 -> 127]
        System.out.println("XEM VI DIỆU!!!!!");
        System.out.println("num3 vs num4: " + (num3 == num4)); //true
        //vẫn so con trỏ heng, éo so sánh lõi vì biết lõi = nhau òi

        //riêng cho boxing từ -128 -> +127 thì
        //gói những thằng primitive/boxing trong đoạn này thì chúng
        //chỉ xài 1 vùng new Chung nếu chung lõi

        Integer num5 = new Integer(-127); //éo tắm chung
        //vì new rõ ràng tường minh
        System.out.println("num3 vs num5: " + (num3 == num5)); //false

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

}
