package craftmanv5;

import data.Disk;
import data.Rectangle;
import data.Shape;

/**
 *
 * @author gia.thinh
 */
public class CraftmanV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithShapes();
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5, 6); 
        Shape r2 = new Rectangle("ITA", "MEGENTA", "PINK", 6, 5);
        
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
    }
}
