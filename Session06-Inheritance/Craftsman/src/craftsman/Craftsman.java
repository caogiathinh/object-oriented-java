
package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author gia.thinh
 */
public class Craftsman {

    public static void main(String[] args) {
        cutShape();
        
    }
    
    public static void cutShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MA", "PINK", 3.0);
        s1.paint();
        
        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
        d1.paint();
    }
    
}
