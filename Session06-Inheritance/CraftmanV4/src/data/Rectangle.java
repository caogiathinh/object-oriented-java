
package data;

/**
 *
 * @author gia.thinh
 */
//1. Thấy có cái IS A extends

//2. Đặc điểm cho Con, đồng nhất (Cha lo hết) hoặc dị biệt, Con có riêng
//3. Phễu tôn trọng bản sắc
//4. Vì Cha là abstract chỉ nói thôi, chưa làm chung chung thôi,
//   nếu Con chỉ nói thôi ko chịu làm, tức là con cũng là Abstract 
//   VÌ NÓ TOÀN NÓI ĐIÊU CHUNG CHUNG,  DÙ BÊN TRONG NÓ CÓ VÀI HÀM CÓ CODE
//   Con thừa kế Abstract Class, mày có 2 lựa chọn, không hơn  
//   hoặc mày 
public class Rectangle extends Shape {
    
    private double a, b; //kết hợp với phần làm biếng/extends từ Cha
                         //sẽ tái hợp đầy đủ như chưa có kế thừa

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor); //cha phải có trước, làm cánh chim để con bay xa, extends dễ bố trí vùng RAM
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
}
