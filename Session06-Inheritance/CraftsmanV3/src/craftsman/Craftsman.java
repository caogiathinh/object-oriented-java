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
        //cutShape();
        //sortShapes();
        playWithChildClass();
    }
    
    
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[3];
       
        rectArr[0] = r1;
        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("ANH HAI", "BLUE", 3.0, 3.0);       
        rectArr[3] = new Square("G.A.HAI", "BLUE", 5.0);

        System.out.println("The list of rectangles");
        System.out.println("Before sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
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
