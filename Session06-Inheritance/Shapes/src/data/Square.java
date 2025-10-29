
package data;

/**
 *
 * @author gia.thinh
 */
//vuông trọn vẹn giống HCN, không dị biệt về đặc tính
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    //ta muốn in theo cách của mình, cho nên viết lại hàm paint();
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4s|%7.2f|\n", 
                            "SQUARE", owner, color, borderColor, width, " ", getArea());
    }
}
