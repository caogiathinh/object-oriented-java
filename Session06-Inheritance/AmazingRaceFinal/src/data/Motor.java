
package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
//chơi thêm kế thừa, Motor is a kind of Vechicle
//Motor mua về chạy đi học bình thường, hàm run()
//nhưng trên đường thằng vớ vẫn nẹt bô, mình đua luôn
//đua thủ - phải là đua thủ mới có tốc độ cao
//gia nhập hội đua thủ
//không dùng từ khóa Extends, xài từ là 1 member của IMPLEMENTS - TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA

//tham gia clb thì phải có hành động của clb đó 
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐUA MÀ KHÔNG CHỊU ĐUA SAO ĐƯỢC  
public class Motor implements DeathRacer{
    
    public static final double MAX_SPEED = 180; 
    
    private String model; 
    private String volume; 
    private String vin; //biển số khung (vehicle Identifier Number)

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    //hành vi xe máy là chạy, có tốc độ dc ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED; 
    }
    
    //quay video và gáy tốc độ 
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n", 
                           "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        return run() * 3; 
    }

    @Override
    public void showHowToDead() {
        
    }
}
