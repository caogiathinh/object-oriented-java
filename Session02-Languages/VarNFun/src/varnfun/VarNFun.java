
package varnfun; 
/**
 *
 * @author gia.thinh
 */
public class VarNFun {
    public static void main(String[] args) {
        //gióng lề code chuẩn chỉ
        System.out.println("Practice with variable and function in Java");  
        printIntegerList();
        //playWithBooleans();
        //playWithCharacters();
        //playWithDoubles();
        //playWithIntegers();
        //playWithVariables();
    }
    
    //in ra các số tự nhiên từ 1 đến 100 
    public static void printIntegerList() {
        System.out.println("The list of 100 first integer");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.printf("\n");
    }
    
    public static void playWithBooleans() {
        //C: đúng 1,  > 0; sai 0
        //Java: đúng: true, sai: false. -> boolean
        boolean marriedStatus = false; 
        if(marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    
    public static void playWithCharacters() {
        //2 byte cho kiểu char, lưu Unicode.
        char m = '$'; 
        System.out.println("unit: " + m);
        //lưu tên thì sao? C: mảng các kí tự, không phải primitive nữa rồi 
        //                 char name[] = "Ahihi"; 
        
        String name = "Cao Gia Thinh"; //loại data type mới hoàn toàn
                                       //phức tạp, do gom n thứ khác
                                       //object data type, học sớm thoi.
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0)); 
        System.out.println("My name as in a lowercase: " + name.toLowerCase()); 
     
    }
    
    //java va ưu tiên double hơn float
    public static void playWithDoubles() {
        double PI = 3.14;
        System.out.println("pi: " + PI);
        System.out.printf("pi: %.2f\n", PI); //cấm tuyệt đối không dùng %lf
        
        // float vat = 0.1; //mặc định literal trong java với số thực là double 
                        //lấy số double gán vào chỗ float thì có thể mất dữ liệu
                        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
      
    }
    
    public static void playWithIntegers() {
        int n = 39; //mọi con số, kí tự xuất hiện trong code là 
                    //literal value
                    //số nguyên xuất hiện trong code mặc định là int
                    
        System.out.println("n: " + n);
        
        long m = 3000_000_000L; //vì java  mặc định số nguyên là int nên phải thêm sub phia sau là L
        System.out.println("m: " + m);
        
        int status = 0xFA; //0x đứng trước là hệ 16
        System.out.println("status: " + status);
        
        int phone = 010; //0 đứng trước là số hệ 8 (octal)
        System.out.println("phone: " + phone);
        
    }
    
    //static chỉ chơi với static
    public static void playWithVariables() {
        //biến là một vùng RAM được đặt tên chiếm 1 số byte nhất định
        //tùy loại dữ liệu và thông tin nó chứa bên trong - data type - hình thức data
        //số, chữ, hình ảnh,...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức
        int age = 20; 
        int a = 10, b; 
        b = 100; 
        //tốn 12 byte trong RAM để lưu trữ thông tin on off trong RAM 
        // ctrl + space: gợi ý khi tên dài - mồi theo kiểu từ điển
        System.out.println("age: " + age); //~ printf("age: %d\n", age); 
        //java tự đoán age là biến convert sang chuỗi sau đó ghép chuỗi
        
        int yob = 2001;
        age = 2024 - yob; 
        
        System.out.println("age again: " + age);
        
        //định luật bắt cầu
        System.out.println("age by using transitive tech: " + (2024 - yob));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2024 - yob));
        
    }
}
