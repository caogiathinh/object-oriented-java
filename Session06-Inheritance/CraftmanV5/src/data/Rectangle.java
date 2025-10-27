
package data;

/**
 *
 * @author gia.thinh
 */

//1. Thấy có IS A, extends, đông nhất hoặc dị biệt

//2. Đặc điểm cho Con, đồng nhất (Cha lo hết) hoặc dị biệt, con có riêng 
//3. Phễu tôn trọng bản sắc
//4. Vì cha là abstract chỉ nói thôi chưa làm, chung chung thoi 
//nên nếu con không chịu làm, con lại là abstract
//một class chứa hàm abstract ko có code, thì class đó phải là ABSTRACT
//vì nói toàn nói điều chung chung, dù trong nó vài hàm có code


//Con thừa kế Abstract class, mày có 2 lựa chọn, không hơn
//--hoặc mày abstract , nếu mày không chịu viết code cho Cha, thừa kế Abstract
//          vậy mày là khái niệm luôn còn gì nữa
//hoặc mày phải viết code cho hàm Abtract của Cha, vì mày đủ info để làm 
//mày là cụ thể rồi, mọi thứ trong mày là rõ ràng
//CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODS
//   implement the body of Parent's abstract methods
//Cha đã nói ý tưởng, Con hiện thực thôi 
//          làm biến, mày giống như cha Abstract, đời cháu tính ... 
// Nếu không chịu làm tiếp, mãi mãi là nói không làm ... -> hệ quả gì ?? nói sau

//dòng họ vô sinh- không thể new được 1 OBJECT TỪ CHA, CON luôn vì cả 2 không đủ code do khuôn không hoàn hảo

public class Rectangle extends Shape {
    private double width;
    private double length; 

    public Rectangle(String owner, String color, String borderColor, double width, double length) {
        super(owner, color, borderColor);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    @Override
    public double getArea() {
        return this.width * this.length; 
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTABLE  |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", 
                                owner, color, borderColor, width, length, getArea());
    }
    
}
