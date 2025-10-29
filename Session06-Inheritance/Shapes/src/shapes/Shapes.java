
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
    }
    
    public static void sortShapes() {
        //sort cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TIA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TIA", "MEGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MEGENTA", 7.0);
        Rectangle s2 = new Square("MA", "PINK", "MEGENTA", 8.0);
        Shape s3 = new Square("MA", "PINK", "MEGENTA", 9.0);
        
        
    }
}
