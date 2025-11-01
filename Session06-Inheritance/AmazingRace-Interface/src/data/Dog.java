
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

public class Dog extends Pet implements DeathRacer {
    
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double gpa) {
        super(name, yob, gpa);
    }
    
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                            "DOG", name, yob, weight, run());
    }

    @Override
    public double runToDead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showHowToDead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
