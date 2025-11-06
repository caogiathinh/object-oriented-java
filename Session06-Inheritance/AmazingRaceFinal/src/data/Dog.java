/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author gia.thinh
 */
//Dog ngoan ngoãn ban ngfy tối chủ đi ngủ, nó trốn nhà đi hoang
//đi đua thì nó phải chạy vươt tốc độ bình thường, runToDead() như mọi đua thủ. 
//mình vẫn là con cháu nhà họ Lê Phạm, học như bình thường sinh viên
//nhưng còn tham gia clb Đua thủ, 
//IMPLEMENT ALL ABSTRACT METHOD, NỘI QUI CÂU LẠC BỘ

public class Dog extends Pet implements DeathRacer {
    
    public static final double MAX_SPEED = 40; 

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
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

    
    //PHẦN HOANG GIẢ TRONG TA, BỘC LỘ KHI ĐI ĐUA
    //TỤI MÀY, SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    //VÀO SG, CHẮC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU, GAME, CÁ ĐỘ, ĐÁNH BÀI, .. CLB TA, TỪ THIỆN, CẦU LÔNG
    
    @Override
    public double runToDead() {
        return run() * 5; 
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%4d|%4.1f|%4.1f|\n", 
                           "DOG-RACER", name, yob, weight, runToDead());
    }    
}
