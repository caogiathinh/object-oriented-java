
package craftmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;

/**
 *
 * @author gia.thinh
 */
public class CraftmanV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithShapes();
    }
    
    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MEGENTA", "PINK", 6, 5);

        Disk d1 = new Disk("MA", "PINK", "MEGENTA", "<3", 6); 
        Shape d2 = new Disk("MA", "MEGENTA", "PINK", ":x", 6); 

        r1.paint();  //CON, RETANGLE 
        r2.paint();  //CHA, khi chạy thì qua mặt Cha
        d1.paint();  //CON ,DISK
        d2.paint();  //CHA, DISK, không care Cha nói chung, ưu tiên Con 
                     //code Cha không có không ảnh hưởng
                     //NEW CHA THÌ SAO CHƯA THẤY, BÀN VỤ NÀY SAY, KHÓ 
                     //DO CODE KHÔNG HOÀN HẢO, KHÔNG DẦY ĐỦ 
        //.PAINT() CHÍNH LÀ POLYMORPHISM, ĐA XẠ ĐA HÌNH ĐÃ XUẤT HIỆN 
    }   
}
