package amazingrace.pkginterface;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

/**
 *
 * @author gia.thinh
 */
public class AmazingRaceInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead() {
        
        //có quyền có ai đó chạy ngang nhảy vô
        //mĩ nhân ngư của châu tinh trì nhảy vào
        Dog d1 = new Dog("NGAO DA", 2021, 50.0);
        //chấm full hàm Con đủ code hàm Cha, hàm CLB; 

        Pet d2 = new Dog("VANG OI", 1950, 10.0);
        //chấm full hàm của Cha, khai Cha, chạy không sợ vì đa hình Con qua mặt Cha
        //tổ lái con trỏ dược, new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì xổ Cha hoi 
        //mày biết bố tao là ai không ?? 

        DeathRacer d3 = new Dog("NANH TRANG", 1901, 20.0);
        //ngộ nhỡ dấu châm thì sao???
        //chám chỉ xổ full CLB, 2 hàm runToDead() và howToDead()
        //tao là đua thủ chỉ quan tâm đua thoi 
        //chạy éo sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, qua mặt tiếp
        //ép kiểu con trỏ luôn, new Dog mà sợ gì
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2}; 
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        //Con tự lo, con Motor chạy theo Motor, Con Dog chạy theo Dog
        
        System.out.println("The racing records");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }

    }

}
