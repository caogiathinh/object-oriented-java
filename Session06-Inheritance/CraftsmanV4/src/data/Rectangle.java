
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
//   hoặc mày abstract, nếu mày chịu viết code cho Cha, thừa kế Abstract
//                  vậy mày là khái niệm luôn còn gì ? 
// hoặc mày phải viết code abstract của Cha, vì mày đủ info để làm 
//mày là cụ thể, vì mọi thứ trong mày là rõ ràng. 
// CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT, ABSTRACT METHODS
// implement the body of Parent abstract method
//Cha đã nói ý tưởng, Con thực hiện thôi 
//                  làm biếng, mày giống Cha Abstract, đời cháu tính
//  Nếu không chịu làm tiếp , mãi mãi là nói không làm ->> có hệ quả gì không ?? 
//  VÔ SINH, KHÔNG THỂ NEW ĐƯỢC OBJECT TỪ CHA, CON LUÔN, VÌ CẢ 2 KHÔNG CÓ CODE
//  KO SINH ĐC OBJECT DO KHUÔN KHÔNG HOÀN HẢO

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
    
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2; 
    }

    @Override
    public void paint() {
        System.out.printf("|RETANGLE  |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", 
                                        owner, color, borderColor, a, b, getArea());
    }
}
