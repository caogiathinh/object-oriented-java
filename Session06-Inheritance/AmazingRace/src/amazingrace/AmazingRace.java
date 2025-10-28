/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author gia.thinh
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        register();
    }
    
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><"); 
        kitty.showRecord();
        
        Dog ngaoDa = new Dog("NGAO DA", 2021, 50.0); 
        Pet beTo = new Dog("BE TO", 2012, 5.0);
        
        ngaoDa.showRecord();
        beTo.showRecord();
        
        //run() đa hình ròi các con ơi
        //if [i].run() > [j].run, MỖI LÀN run() thằng i, j 
        //là khác nhau
    }
}
