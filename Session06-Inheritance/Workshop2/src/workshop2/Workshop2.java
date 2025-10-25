package workshop2;

import data.RightTriangle;
import data.Triangle;

/**
 *
 * @author gia.thinh
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithTriangles();

        sortTriangle();
    }

    public static void sortTriangle() {
        Triangle arr[] = new Triangle[6];

        arr[0] = new RightTriangle("PINK", 3, 4);
        arr[1] = new RightTriangle("PINK", 6, 8);
        arr[2] = new RightTriangle("PINK", 5, 12);

        arr[3] = new Triangle("RED", 5, 6, 7);
        arr[4] = new Triangle("RED", 7, 10, 15);
        arr[5] = new Triangle("RED", 8, 9, 11);

        System.out.println("List triangle before sort");
        for (int i = 0; i < 6; i++) {
            arr[i].paint();
        }

        for (int i = 0; i < 6 - 1; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Triangle tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("List triangle after sort");
        for (int i = 0; i < 6; i++) {
            arr[i].paint();
        }
    }

    public static void playWithTriangles() {
        
        //t1 là tên tất của một hình tam, nó đây  ~~~~ new Triangle
        Triangle t1 = new Triangle("PINK", 3, 4, 5);
        t1.paint(); //của cha chính chủ
        
        RightTriangle rt1 = new RightTriangle("PINK", 3, 4);
        rt1.paint(); //của con chính chủ 
        
        //câu chú ý, khai Cha new Con -> kế thừa
        Triangle rt2 = new RightTriangle("RAINBOW", 6, 8);
        //      TG một           là hình tgv 
        //đang xem tgv như là 1 tg, gọi nó theo tên tắt của TG
        //rt2 chấm xổ ra Cha, xưng dưới danh nghĩa của Cha, ta là con đại gia .. 
        rt2.paint();   //xài Cha, nhưng lúc CHẠY THÌ ƯU TIÊN GỌI CON, DO NEW CON 
                       //HÙ CHA NHƯNG CHẠY CON
                       //PAINT() CHA ĐỂ ĐÓ CON LO CHO, CHA BỊ QUA MẶT. 
    }
}
