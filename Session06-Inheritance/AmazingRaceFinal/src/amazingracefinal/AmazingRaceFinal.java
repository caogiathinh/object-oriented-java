package amazingracefinal;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

/**
 *
 * @author gia.thinh
 */
public class AmazingRaceFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        runToDead();
    }

    public static void runToDead() {
        Dog d1 = new Dog("NGAO DA", 2021, 50.0);
        //chấm full hàn của Con, đủ code hàm Cha, CLB
        Pet d2 = new Dog("VÁNG OI", 1950, 10.0);
        //chấm thì chỉ có full hàm của Cha, chạy cũng không sợ vì đa hình con qua mặt Override
        //tổ lái con trỏ dược, new Dog mà sợ gì ??
        //tao là danh nghĩa Cha thì chỉ xổ của Cha
        DeathRacer d3 = new Dog("NANH TRANG", 1901, 20.0);

        //ngộ nhở dấu chấm thì sao
        //chỉ xổ full CLB, 2 hàm runToDead() và showHowToDead()
        //tao là đua thủ chỉ quan tâm đua thôi, 
        //chạy éo sợ vì Con qua mặt Override, có đủ hàm đã làm rồi, đa hình tiếp
        //ép được con trỏ luôn, new Dog mà sợ gì 
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2};
        //DeathRacer racer[] = new DeathRacer[5]
        //racer[0] = new Dog(....); 
        //racer[1] = new Motor(..)
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowToDead
        //Con tự lo, motor chạy theo cách của Motor, Dog chạy theo cách của Dog
        System.out.println("The racing record:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }

     }
}
