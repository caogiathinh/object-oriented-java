package amazingracev3;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

/**
 *
 * @author gia.thinh
 */
public class AmazingRaceV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showRecords();
    }

    public static void showRecords() {
        Pet y = new Hamster("MICKY", 1960, 0.6); 
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
                                new Dog("VANG OI", 1950, 10),
                                new Cat("TOM", 1960, 15.0),
                                new Cat("KITTY", 1990, 5.0),
                                new Hamster("JERRY", 1950, 0.5), 
                                y
                               };
        //đa hình quay trở lại
        //vì mảng PET nên MỌI VIỆC CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        //HOÀN TOÀN KHÔNG ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI CHẠY ĐI CHÚNG MAFYM THẾ LÀ 3 ĐỨA CON CHẠY.
        //TỐC ĐỘ CỦA RIÊNG CHÚNG ĐA HÌNH XUẤT HIỆN, OVERRIDE QUA MẶT CHA XH
        System.out.println("The record table");
        for (Pet x : racer) {
            x.showRecord();
        }
    }
}
