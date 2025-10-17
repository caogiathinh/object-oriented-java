package basicarrayv2;

/**
 *
 * @author gia.thinh
 */
public class BasicArrayV2 {

    public static void main(String[] args) {

        playWithPrimitiveArrayV2();

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
