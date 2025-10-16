
package basicarrray;

/**
 *
 * @author gia.thinh
 */
public class BasicArrray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithPrimitiveArrayV2();
    }
    
    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //biến ct       new Object
        // ref          new Object
        double arr[] = new double[100]; //default gán hết = 0 
                                //new() là phễu để đúc object
        //em muốn có 365 biến object, nó là biến lẻ nè 
        //      arr[0], arr[1], arr[i] ... 
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        
        System.out.println("The array has values of {for i}");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //arr[0] éo sổ cái gì vì nó là primitive mà ... 
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIẾN CON TRỎ, REFERNCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ NEW ĐÓ, KO ĐÚC TRUYỀN THỐNG
        //                                              MÀ LÀ ĐÚC NHIỀU BIẾN
        //MÁ MÌ SẼ QUẢN LÍ BAO NHIÊU CHÁU DƯỚI QUYỀN, ĐẶC ĐIỂM CỦA MÁ MÌ 
        //MÁ MÌ CHẤM RA ĐƯỢC SỐ LÍNH DƯỚI QUYỀN
        

        System.out.println("\nThe array has values of {for each}");
        for (double x : arr) {
            System.out.print(x + " ");
        }
    }
    
    public static void playWithPrimitiveArray() {
        //double vol[365];  JAVA cấm khai báo kích thước mảng, số phần tử trong []
            
        //double v[365] = {0, 0, 5, 10, 15, 20};
        double v[] = {0, 0, 5, 10, 15, 20, 25}; //mảng có 7 phần tử, có sẵn luôn value
        //7 biến float nằm trên HEAP đấy
        //có new ngầm đấy
        
        v[0] = 6868; 
        System.out.println("The array has value of {printed by individual}");
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        //ta có thể xem mảng như 1 là 1 tập hợp các value trong {} giống toán
        //ta có thể xài khái niệm với mọi, với mỗi lần duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (double x : v) {
            //x = v[0], x = v[1], x = v[2], x = v[i] với mọi x là 1 biến lẻ, = từng thằng 
            //thằng lẻ trong mảng sỉ
            System.out.print(x + " ");
        }
        
        //V x e N, x là mấy, x là bất cứ giá trị nào trong N 
        //x = 0, x = 1, x = 2, x = 5
        //với mọi là kĩ thuật quét qua mảng
        //giống dùng đèn pin quét từ đầu tới cuối 
        //kĩ thuật dùng con số tự nhiên 
        //duyệt qua tất cả các phần tử của tập hợp
        //V int x e N (với mọi x thuộc n) x = N[0], x = N[1], x = N[2]
        
    }
    
}
