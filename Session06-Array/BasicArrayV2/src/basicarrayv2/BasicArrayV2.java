package basicarrayv2;

/**
 *
 * @author gia.thinh
 */
public class BasicArrayV2 {

    public static void main(String[] args) {
        // TODO code application logic here
        playWithStudentArray();
        //playWithStudentObject();
        //playWithPrimitiveArrayV3();
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ sinh viên cả lớp
        //10 biến + 10 tên tắt + 10 value phức tạp ~ 10 nhát new() 
        //lưu 10 só tự nhiên 
        //10 biến/tên tắt + 10 value đơn

        int arr[] = new int[10];

        //Student s1, s2, s3, s4, .... s12, s13; //LẺ
        //      x[0] x[1] x[2] x[3] 
        //      s1. ra gì ra public của s1 (propertise + method) 
        //      x[0]. ra public.
        Student list[] = new Student[3]; //đừng nhằm lẫn khi new, 2 loại ngoặc
        //() gọi phễu tạo object
        //[] tao cần nhiều biến đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt                                 
        list[0] = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        list[1] = new Student("SE123457", "BINH LE", 2000, 5.7);
        list[2] = new Student("SE123458", "CUONG VO", 1999, 5.8);

        list[0].showProfile();
        list[1].showProfile();
        //mấy biến Student chưa gáng mang giá trị gì ?? 
        //list[3] .. list[9] ?? 0 là DEFAULT
        //                      TRỎ VÀO ĐỊA CHỈ 0 CỦA RAM, ĐỊA CHỈ CỦA RAM
        //                      BYTE ĐẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ OFF OFF OFFF
        //tức là byte đầu tiên của ram chứa toàn số 0 
        //byte NULL BYTE KHÔNG CÓ GÌ CẢ, TOÀN 0, 
        //IN MẢNG CÁI COI 
        System.out.println("The list of students");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chỉ là 1 biến sinh viên thôi mà
        }
        
        //s1 = null; //tao trỏ xuống đáy ram, null hen, làm biếng new, 
        
        //s1.showProfile(); //không có để show, NullPointerException
                
        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE TỚI ĐÂU, FOR TỚI ĐÓ, KHÔNG FOR ĐẾN LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
         
    }

    public static void playWithStudentObject() {
        Student x;
        x = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20}; //new ngầm không nói rõ việc new
        int arr3[] = new int[]{5, 10, 15, 20};
        int arr2[] = new int[5];

        int arr[];
        arr = new int[5];
        //có nhiều biến rồi, sau đó xài từng biến theo nhu cầu. 
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        //arr là gì, là 1 biến đặc biệt, mày là biến object luôn, vì mày trỏ 1 vùng new bự
        //có quyền chấm, chấm cái gì ?? tốt nhất là .toString(); 
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là
        //phần tử của mảng 
        //arr[0] ~~~~ arr.get(thằng thứ 0) -> dc 5 / arr[0] được 5
        //arr.length --biến lưu đặc điểm của mảng, có bao nhiêu phần tử.
        // ??? static hay non ?? -> non static mỗi đối tượng mảng sẽ có một kích thước nhất định
        //arr.length; hằng số đặc biệt ăn theo từng mảng, mỗi mảng sẽ có kích thước khác nhau
        System.out.println("Array has: " + arr);
        //gọi thàm tên em, convert data của các biến thành mã hexa

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr . xổ gì --> xổ các propertise và method của object với access modifier là public vì là object value 
        //arr[0] . xổ gì -> không xổ đươc vì là primitive value
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        //get() set() khong có mà thay bằng chơi trực tiếp []
        //thay đổi value bên trong biến/phần tử. 
    }

    public static void playWithPrimitiveArrayV2() {
        //dynamic
        double arr[] = new double[1001]; //defualt gán hết = 0 
        //new () là phễu đế đúc object

        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array has values of {for i}");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nThe array has values of {for each}");
        for (double x : arr) {
            System.out.print(x + " ");
        }

        //arr[0] chấm không xổ gì vì là biến primitive
    }

    public static void playWithPrimitiveArray() {
        //===========================================\
        //array in java
        //double vol[365]; //java cấm khai báo trước số lượng phần tử (kich thước mảng) trong []
        //java có nhiều điểm tương động so với các ngôn ngữ lập trình hướng đối tượng khác. 

        double v[] = {0, 0, 5, 10, 15, 20, 25}; //mảng có 7 phần tử có sẵn value, bản chất là 7 biến double 
        //v[0] = 0, v[1] = 0, v[2] = 5, .. 
        //7 biến float nàm trên HEAP, có new ngầm, malloc() 
        System.out.println("The array has value of {printed by individual}");

        v[0] = 6868;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);

        //for to 10 -> exception, khai báo bao nhiêu for bấy nhiêu
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        //=============================================
        //for each 
        //ta có thể xem như là tập hợp các value trong dấu {} bên toán
        //ta có thể xài với mọi, để duyệt toàn bộ mảng, 

        //N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,...}
        // V x E N với mọi x thuộc tập hợp N, x là bất kì giá trị nào trong tập hợp N 
        // x = 0, x = 1, x = 2, ... 
        //với mọi là kĩ thuật quét qua mảng. 
        //dùng đèn pin quét từ đầu đến cuối mảng
        //kĩ thuật dùng là 1 con số tự nhiên dể duyệt qua tất cả phần tử của tập hợp
        //V int x e N, x = N[0], x = N[1], x = N[i]
        System.out.println("\nThe array v has values of {printed by using for each}");
        for (double x : v) {
            System.out.print(x + " ");
            //x = v[0], x = v[1], x = v[i], với mọi x là từng biến lẻ, = từng
            //thằng lẻ trong mảng sỉ
            //sout(v[i]) <-> sout(x)
        }
    }
}
