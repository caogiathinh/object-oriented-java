
package data;

/**
 *
 * @author gia.thinh
 */
public class Triangle {
    protected String color;
    protected double firstSide; 
    protected double secondSide; 
    protected double thirdSide; 

    public Triangle(String color, double firstSide, double secondSide, double thirdSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle{" + "color=" + color + ", firstSide=" + firstSide + ", secondSide=" + secondSide + ", thirdSide=" + thirdSide + '}';
    }
    //có một bộ thư viện, đồ chơi, class khác đưa vào dùng kèm, giống xài Scanner
    //giúp không cần làm thao tác ở trên, tự nó làm giùm, mình chỉ cần viết mấy câu code ngắn
    //mà có hết đám trên này, thư viện mang tên lombok 
    
    
    //nếu em đổ a b c không thỏa 1 tham giác, tổng 2 cạnh bất kì lớn hơn cạnh còn lại 
    //thì phải làm sao??
    //có 2 cách phổ biến
    //cà chớn đưa default 3 4 9 -> default 3 4 5
    //ném ra ngoại lệ, chủ động giết app, vì tam giác cà chớn không xử lí. 
    
    public double getPerimeter() {
        return this.firstSide + this.secondSide + this.thirdSide; 
    }
    
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - this.firstSide) * (p - this.secondSide) * (p - this.thirdSide));
    }
    
    public void paint() {
        System.out.printf("|TRIANGLE  |%-10s|%4.1f|%4.1f|%4.1f|%4.1f|\n", color, firstSide, secondSide, thirdSide, getArea());
    }
}
