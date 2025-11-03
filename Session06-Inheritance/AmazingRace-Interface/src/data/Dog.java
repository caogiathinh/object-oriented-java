package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
//Dog ngoan ngoãn ban ngày, tối chủ đi ngủ nó trốn nhà đi đua
//đi đua thì nó phải chạy vượt tốc độ bình thường như mọi đua thủ
//mình vẫn là con cháu họ lê, phạm, .. 
//nhưng mình vẫn tham gia CLB Đua, Thủ, Phượt, CLB gì đó, thì phải có hành động của clb đó
//IMPLEMENT ALL ABSTRACT METHOD, NỘI QUY CỦA CLB
public class Dog extends Pet implements DeathRacer {

    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double gpa) {
        super(name, yob, gpa);
    }

    //IMPLEMENT ABSTRACT METHOD
    //----------------------------
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                "DOG", name, yob, weight, run());
    }

    //phần hoang giã trong ta, BỘC LỘ KHI ĐUA
    //NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    //VÀO SG, CHẤC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU NHẸT SISHA, GAME CÁ ĐỘ, ĐÁNH BÀI
    //                                         CLB TIẾNG ANH, PHƯỢT, TỪ THIỆN, CẦU LÔNG, ... 
    
    //-----------------------------
    
    
    //-----------------------------
    //DEATHRACER INTERFACE
    @Override
    public double runToDead() {
        return run() * 5;  //hơn 5 lần so với bình thường
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%4d|%4.1f|%4.1f|\n",
                "DOG-RACER", name, yob, weight, runToDead());
    }
    
    //-----------------------------

}
