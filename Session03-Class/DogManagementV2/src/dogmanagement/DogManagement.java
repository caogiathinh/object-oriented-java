package dogmanagement;

import data.Dog;

/**
 *
 * @author gia.thinh
 */
public class DogManagement {
    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
     
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2001, 50.0);
        ngaoDa.bark();
       
      
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        
        
        System.out.println("After overweight");
        chiHu.setNewWeight(5.0);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        System.out.println("ND YOB: " + ngaoDa.getYob());
    }  
}


 