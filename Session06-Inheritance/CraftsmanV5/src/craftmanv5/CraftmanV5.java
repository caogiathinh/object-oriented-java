package craftmanv5;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author gia.thinh
 */
public class CraftmanV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithShapes();
        sortShapes();
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5, 6);
        Shape r2 = new Rectangle("ITA", "MEGENTA", "PINK", 6, 5);
        ((Rectangle) r2).getLength();

        Disk d1 = new Disk("MA", "PINK", "MEGENTA", "<3", 6);
        Shape d2 = new Disk("MA", "MEGENTA", "PINK", ":x", 6);

        r1.paint(); //Con, hàm RECTANGLE 
        r2.paint(); //Cha, khi chạy thì vượt mặt Cha, Rectangle, Cha éo có code kia kìa 
        d1.paint(); //Con, Disk
        d2.paint(); //Cha, qua mặt Cha, không care Cha nói chung, ưu tiên Con
        //Code cho dù không có cũng không ảnh hưởng

        //NEW CHA THÌ SAO THƯA THẦY, BÀN VỤ NÀY SAU, KHÓ !!!
        //DO CODE CHA KHÔNG HOÀN HẢO, KHÔNG ĐẦY ĐỦ
        //.PAINT() CHÍNH LÀ POLYMOPHISM, ĐA XẠ ĐA HÌNH ĐÃ XUẤT HIỆN
        //
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5, 6);
        Shape r2 = new Rectangle("ITA", "MEGENTA", "PINK", 6, 5);

        Square s1 = new Square("MA", "PINK", "MEGENTA", 7);
        Rectangle s2 = new Square("MA", "PINK", "MEGENTA", 8);
        Shape s3 = new Square("MA", "PINK", "MEGENTA", 9);
        //Hà Kiều Anh nhận là công chúa!!! 

        Disk d1 = new Disk("BE NA", "RAINBOW", "BORDAUX", "<3", 6);
        Shape d2 = new Disk("BE NA", "RAINBOW", "BORDAUX", "<3", 6);

        Triangle t1 = new Triangle("GHE BE NA", "RAINBOW", "BORDAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHE BE NA", "RAINBOW", "BORDAUX", 6, 8, 10);
        
        //ta có thể khai báo 9 hình này đều là SHAPE, CỰC ĐẸP KHI NHÌN ĐỘI HÌNH
        //ĐỒNG NHẤT
        
        //in kết quả trước khi sort diện tích 
        r1.paint(); //hàm của con, chạy của con
        r2.paint(); //hàm của cha, chạy của con 
        s1.paint(); //hàm của con, chạy của con
        s2.paint(); //hàm của cha, chạy của con
        s3.paint();  //hàm của ông, chạy của cháu
        d1.paint();  //hàm của con, chạy của con
        d2.paint();  //hàm của cha, chạy của con 
        t1.paint();  //hàm của con, chạy của con
        t2.paint();  //hàm của cha, chạy của con
        
        //sắp xếp thôi 
        
        //PAINT() Ở ĐÂY CỰC HAY
        //CHỈ CÓ 1 HÀM TÊN LÀ PAINT() NHƯNG CÓ ĐA DẠNG CÁCH VIẾT CODE, 
        //LÚC CHẠY CŨNG ĐA DẠNG LUÔN, LÚC T, V, CN, TG, ... 
        //cùng hàm Cha, Ông nội tùy cách khai báo nhưng đám Con Biết hết
        //Override
        //từ 1 hàm paint() ánh xạ chiếu ra N cách viết code/implement khác nhau
        //thực thi (chạy theo N cách khác nhau)
        //từ 1 mà biến hóa ra nhiều, từ 1 có đa hình dạng, đa ánh xạ cách làm cách chạy
        //từ 1 biến hình transformer, đa nhân cách 50 sắc thái, từ 1 ra nhiều.
        //KĨ THUẬT VIẾT CODE TỪ 1 HÀM CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
        //KĨ THUẠT NÀY GỌI LÀ TÍNH ĐA XẠ, ĐA HÌNH POLYMOPIHSM
        
       //HAY HƠN NỮA NÈ, CHÚNG MÀY VÀO MẢNG DÙM TA ĐỂ TAO SORT
//       Shape box[] = new Shape[9]; //9 biến Shape
//       box[0] = r1; 
//       box[1] = r2; 
//       box[2] = s1;
//       // ...

        //Shape box [] = new Shape[]{new Disk(), new Rectangle(), new Square()}
                
        Shape box[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes before sort");
        for (Shape x : box) {
            x.paint();
        }
        //đa hình siêu đẹp. 1 hàm paint n cách chạy
        //1 ra nhiều cách thực thi, đa hình đa xạ, POLIMOPHISM
        //cha chỉ nói paint đám con nhà vô
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9 - 1; j++) {
                Shape tmp = box[i]; 
                box[i] = box[j]; 
                box[j] = tmp;
            }
        }
        
        System.out.println("The list of Shape after sort");
        for (int i = 0; i < 9; i++) {
            box[i].paint();
        }
    }
}
