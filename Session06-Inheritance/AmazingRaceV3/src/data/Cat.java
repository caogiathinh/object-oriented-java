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
public class Cat extends Pet {

    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED; 
        //anonymous object hong thèm đặt tên, xài vùng new một lần bỏ luôn 
        //Garbage Collector: gôm rác, System.gc();
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                            "CAT", name, yob, weight, run());
    }

}
