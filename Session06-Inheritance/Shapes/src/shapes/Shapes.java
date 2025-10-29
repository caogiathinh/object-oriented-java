
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
        sortShapes();
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
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2}; 
        
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
