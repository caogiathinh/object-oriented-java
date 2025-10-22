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
        sortShapes();
    }

    //cô giáo yêu cầu: sắp xếp các hình tăng dần theo diện tích 
    //dễ vì đã học  
    //muốn sắp xếp thì phải vào mảng thì ta mới sort tự động, vì kích thước hình
    //S hình là chưa biết trước nếu nhập từ bàn phím
    //vì e mới for được
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[3];
        //có 9 biến rectangle, chưa có hình cụ thể nào
        //lớp có 30 chỗ ngồi, chưa có bạn nào đến
        //rectArr[i] = new Rect(..); //[i] cần trỏ vùng new Rectangle() 
        //                                          new cũ, mới, éo quan tâm
        //                                      chỉ quan tâm vùng new clone new Rect
        rectArr[0] = r1;
//        rectArr[0].paint();
//        rectArr[0].setOwner("YEU TIA");
//        r1.paint();
        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("ANH HAI", "BLUE", 3.0, 3.0);

        System.out.println("The list of rectangles");
//        for (Rectangle x : rectArr) {
//            x.paint();
//        } //coi chừng null pointer exception
        //chỉ for đến chỗ đã trỏ đã gán của mảng. count trong bài cái tủ đó. 
        System.out.println("Before sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        //sort tăng dần theo diện tích, sort tăng dần theo gpa
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
