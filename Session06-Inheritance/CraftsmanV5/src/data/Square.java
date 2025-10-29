
package data;

/**
 *
 * @author gia.thinh
 */
//Nên kế thừa ai ??
//kế thừa Shape: khai báo cạnh edge; éo thoải hiệp, đảo thứ tự biến nếu muốn
//      get set 
//BẮT BUỘC VIẾT CODE PHẢI IMPLEMENS

//ngon: kế thừa mẹ nó rectangle
//                          không cạnh, phễu thoải hiệp tí
//cùng lắm là làm paint()
//Shape là ông nội, ta có cây gia phả

public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    //done không làm gì nữa
    //có cả get set, owner, color new bên cha kìa
    //MÀY MUỐN IN KIỂU SQR THÌ MÀY OVERRIDE RA GẮN MÀY ĐI, HCN
    
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%-7.2f|\n",
                                owner, color, borderColor, width, getArea());
    }
    
}