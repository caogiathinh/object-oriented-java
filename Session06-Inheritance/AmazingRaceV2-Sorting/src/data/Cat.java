
package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
public class Cat extends Pet {

    public static final double MAX_SPEED = 40;
    
    private String ribben; 

    public Cat(String name, int yob, double weight, String ribben) {
        super(name, yob, weight); //Mèo chính là 1 Thú cưng
        this.ribben = ribben;
    }

    public String getRibben() {
        return ribben;
    }

    public void setRibben(String ribben) {
        this.ribben = ribben;
    }
    
    @Override
    public double run() {
        //trong cuộc sống có những thứ Object luôn sinh ra cho mình mấy trò
        //ngẫu nhiên nhưng vậy chúng thuộc Nhóm/Khuôn Ngẫu Nhiên class Ngẫu Nhiên xh
        //JDK có sẵn cái Khuôn này rồi, tên là Random
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * MAX_SPEED;  //0..1 * 50
        //mayNgauNhien.nextDouble(): trả cho mình con số trong đoạn 0...1
    }

    @Override
    public void showProfile() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n", 
                            "CAT", name, yob, weight, ribben, speed);
    } 
}
