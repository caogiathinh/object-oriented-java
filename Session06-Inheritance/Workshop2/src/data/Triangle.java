
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
    
    public double getArea() {
        double p = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        return Math.sqrt(p * (p - this.firstSide) * (p - this.secondSide) * (p - this.thirdSide));
    }
    
    public void paint() {
        System.out.printf("|TRIANGLE  |%-10s|%4.1f|%4.1f|%4.1f|%4.1f|\n", color, firstSide, secondSide, thirdSide, getArea());
    }
}
