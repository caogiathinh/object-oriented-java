
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
        return 0;
    }

    @Override
    public double getPerimeter() {
         return 0;
    }

    @Override
    public void paint() {
        
    }
    
    
}
