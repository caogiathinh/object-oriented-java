package data;

/**
 *
 * @author gia.thinh
 */
public class RightTriangle extends Triangle {

    public RightTriangle(String color, double firstSide, double secondSide, double thirdSide) {
        super(color, firstSide, secondSide, thirdSide);
    }

    @Override
    public void paint() {
        System.out.printf("|RIGHT TRIANGLE|%-10s|%4.1f|%4.1f|%4.1f|%4.1f|\n", color, firstSide, secondSide, thirdSide, getArea());
    }

}
