package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
//Chơi thêm kế thừa, Motor is a kind of Vehicle (abstract class)
//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG TRÊN ĐƯỜNG THĂNG VỚ VẪN NÀO ĐÓ NẸT PÔ, MÌNH KÉO TAY GA MẠNH HƠN.
//BỐC ĐẦU, TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR THÔNG THƯỜNG
//TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ VỚI TỐC ĐỘ CAO
//GIA NHẬP ĐUA THOI, 
//TỚ CÒN LÀ 1 ĐUA-THỦ, KO DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER
//                                                          IMPLEMENTS
//                                                      TỚ THAM GIA CLB, TRIỂN KHAI VIỆC DÙNG 
//THAM GIA CLB NÀO PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENT ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KHÔNG CHỊU ĐUA SAO ĐƯỢC
//@OVERRIDE
//CLASS CHÍNH CỦA CHÚNG TA CÓ ĐẶC ĐIỂM HVI NHƯ BÌNH THƯỜNG
//CHÚNG TA THAM GIA CLB NÀO THÌ THÊM HOẠT ĐỘNG CỦA CLB ĐÓ,OVERRIDE HÀNH ĐỘNG ĐÓ
//CHÚNG TA CÓ NHIỀU HÀNH ĐỘNG ỨNG VỚI TỪNG CLUB TA THAM GIA, HỢP LÍ NGOÀI ĐỜI
//ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIẤY
//VỀ LOGIC, TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ MỘT DÒNG HỌ
//TRONG JAVA, MỘT CON TỐI ĐA MỘT CHA, ĐƠN KẾ THỪA
//            MỘT CON THAM GIA N CLUB, VẬY SẼ CÓ HÀNH ĐỘNG CỦA N CLB
//TRONG C++   MỘT CON CÓ NHIỀU CHA / ĐA KẾ THỪA
public class Motor implements DeathRacer {

    public static final double MAX_SPEED = 180;

    private String model;  //exciter: 2021
    private String volume; //số phân khối
    private String vin; //biển số, số khung, Vehicle Identifier Number

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

    //hành vi của xe máy là chạy, có tốc độ được ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|\n",
                "MOTOR", model, volume, vin, run());
    }

    //INTERFACE - IMPLEMENTS
    @Override
    public double runToDead() {
        //CHẠY TỐC ĐỘ CAO
        return run() * 3; //run() giả sử được 150 x 3 đua đến chết còn gì? 

    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%-11s|%5.1f|\n",
                "MOTOR-RACER", model, volume, vin, runToDead());
    }
}
