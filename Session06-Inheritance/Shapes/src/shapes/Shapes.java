package shapes;

import data.*; // .* tức là import hết tắt cả các Khuôn trong ngăn tủ đó

/**
 *
 * @author gia.thinh
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sortShapes();
        //playWithAnonymousClass();
        sortShapesWithAnolymous();
    }

    public static void sortShapesWithAnolymous() {
        
        //Anonymous, here
        Shape onTheGo = new Shape("THIS TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //cắt hình ngẫu nhiên không có công thức, ko gọi dc là hình gì, S phải tự đo
                return 50;
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n",
                                    "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea());
            }
        };
        
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TIA", "MEGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MEGENTA", 7.0);
        Rectangle s2 = new Square("MA", "PINK", "MEGENTA", 8.0);
        Shape s3 = new Square("MA", "PINK", "MEGENTA", 9.0);

        Disk d1 = new Disk("BE NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHE BE NA", "RAINBOW", "RAINBOW", 1.0);
 
        
        
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, onTheGo};


        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint(); 
        }   
        for (int i = 0; i < 8 - 1; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (arr[i].getArea() > arr[j].getArea()) { 
                    Shape tmp = arr[i];  
                    arr[i] = arr[j];     
                    arr[j] = tmp;        
                }
            }
        }

        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            x.paint(); 
        }
    }

   
    public static void playWithAnonymousClass() {
        //Shape vangLai = new NoName(...) //bên trong phải fullcode cho Cha
        //Shape x       = new HCN(......)? //bên trong phải có code hình chữ nhật 
        //CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIU CẠNH MÀ ĐƯA VÀO 
        //CHỈ ĐƯA ĐƯỢC MÀU, TẶNG AI, TÔ MÀU, TỰ ĐO S, P LÀ ỔN ÉO CÓ CÔNG THỨC
        //NẾU MUỐN RÕ RÀNG THÌ CẮT V, TR, CN, TG, HBH, ... 
        Shape vangLai = new Shape("CHINH MINH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50; //vì hình cụ thể, ko theo hình dạng nào, ta tự do  
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                //khai báo là Con Shape vẫn kế thừa như bt
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|\n",
                        "NGAU NHIEN", owner, color, borderColor, getArea());
            }
        }; //VIP
        //mày là 1 hình thoải mái vào mảng Sort nếu muốn
        //mày vẫn là Shape, kiểu Shape, có đủ code cho hàm Cha
        //kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        //THỎA CÔNG THỨC CON - NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CÀN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾNG
        //LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        vangLai.paint();
    }

    public static void sortShapes() {
        //sort cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TIA", "MEGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MEGENTA", 7.0);
        Rectangle s2 = new Square("MA", "PINK", "MEGENTA", 8.0);
        Shape s3 = new Square("MA", "PINK", "MEGENTA", 9.0);

        Disk d1 = new Disk("BE NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHE BE NA", "RAINBOW", "RAINBOW", 1.0);

//        Shape[] arr = new Shape[7];
//        //arr[0] = new 1 hình cụ thể nào đó , new Rectangle(...), new Disk(... )
//        //cần lắm luôn [i] lưu tọa độ vùng new()
//        //[i] tham chiếu vùng new, trỏ vùng new, lưu địa chỉ vùng new()
//        //vùng new () nằm đâu đó trong heap kệ nó
//        arr[0] = r1;
//        arr[1] = r2;
//        arr[2] = d2; 
//        Shape arr[] = new Shape[] {các tọa độ vùng new đưa vô}; 
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2};

//        Shape arr1[]= new Shape[] {
//                                    new Disk("BE NA", "RAINBOW", "RAINBOW", 2.0),
//                                    new Disk("GHE BE NA", "RAINBOW", "RAINBOW", 1.0)           
//                                    }
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint(); //tính đa hình 
        }   //GỌI PAINT() CỦA CHA, NHƯNG 3 CON TỰ ĐỘNG QUA MẶT
        //CHÚT LO LẮNG: PAINT() CỦA CHA ÉO CÓ CODE, ABSTRACT
        //ĐỪNG LO, VÌ LÁT HỒI MẤY CON TỰ LO, DO MÌNH NEW CON KHÔNG HÀ.
        //NEW CON CON ĐẪ VIẾT CODE RỒI, CHA NGỒI IM CON LO CHO
        //CON SẼ GIẢI QUYẾT HOÀN TOÀN CHO CHA.
        //TỪ HÀM CHA GỌI, CON HƯỞNG ỨNG, N CON HƯỞNG ỨNG
        //TỪ 1 ÁNH XẠ RA NHIỀU CÁCH THỨC, TÍNH ĐA XẠ, ĐA HÌNH, POLYMOPHISM
        //sắp xếp tăng dần theo diện tích
        for (int i = 0; i < 7 - 1; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (arr[i].getArea() > arr[j].getArea()) { //bản chất là swap địa chỉ, tọa độ vùng new
                    Shape tmp = arr[i];  //đa hình lấy hàm getArea() của Cha
                    arr[i] = arr[j];     //abstract, đừng lo, Con sẽ l
                    arr[j] = tmp;        //vì [i] luôn trỏ 1 hình cụ thể
                    //getArea() là cụ thể Con
                }
            }
        }

        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            x.paint(); //tính đa hình
        }
    }
}
