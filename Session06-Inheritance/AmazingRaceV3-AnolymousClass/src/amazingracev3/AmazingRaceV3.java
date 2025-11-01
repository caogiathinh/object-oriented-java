package amazingracev3;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

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
        //showRecords();
        showRecordsWithTakeAway();
    }

    public static void showRecordsWithTakeAway() {

        //đường đua đông vui, có nhiều racer và có 1 con gì đó không nhìn rõ bảy theo 
        //hay một vật gì đó bay theo, tức là có tốc độ
        //mình không biết hay không xác định được nhóm của nó là gì, chưa biết class là gì?
        //vì mày muốn nhập hội, okie chạy theo đi, chơi trò take away
        //mượn gió bẻ măng, mượn Pet để new Object
        Pet ufo = new Pet("UFO", 2021, 0.3) {

            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                        "XXX", name, yob, weight, run());
            }
        };

        Pet y = new Hamster("MICKY", 1960, 0.6);
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VANG OI", 1950, 10),
            new Cat("TOM", 1960, 15.0),
            new Cat("KITTY", 1990, 5.0),
            new Hamster("JERRY", 1950, 0.5),
            y, 
            ufo //object tạo từ anonymous , vẫn là Pet
        };

        System.out.println("The record table");
        for (Pet x : racer) {
            x.showRecord();
        }

        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    Pet tmp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = tmp;
                }
            }
        }
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

        //TẠI THỜI ĐIỂM NÀY KHÔNG SORT DC THÀNH TÍCH
        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    //đa hình. hàm Cha nhưng chạy Con tương ứng: HT, D, C,. ... 
                    //mỗi gọi run() để so sánh thì sẽ có tốc độ khác
                    //bài SV, hình học, S cố định cho n lần gọi 
                    //điểm trung bình cố định cho đến khi cập nhật điểm mới
                    //for hoải, getGpa(), getS() cố dịnh nên ta mới đảo được
                    //bài AmazingRace này băt chạy 1 lượt ghi nhận thành tích 
                    //ta so sánh trên thành tích chạy này

                    Pet tmp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = tmp;
                }
            }
        }
    }
}
