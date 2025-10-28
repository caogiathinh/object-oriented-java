package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
public class Cat extends Pet {
    
    public static final double MAX_SPEED = 50;
    
    private String ribbon; 

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon; //ruy băng
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        //trong cuộc sống có những thứ sinh ra cho mình mấu trò ngãu nhiên như vậy chúng thuộc nhóm, class Ngẫu Nhiên xuất hiện
        //JDK có sẵn cái Khuôn này rồi, tên là Random 
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED; //trả cho mình con số trong khoảng {0 .. 1} 
        return speed;    //trả về tốc độ gần 50, hên xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4s|%4.1f|\n", 
                                        name, yob, weight, ribbon, run());
    } 
}
