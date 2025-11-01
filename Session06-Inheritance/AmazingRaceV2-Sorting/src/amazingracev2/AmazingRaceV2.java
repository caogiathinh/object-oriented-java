
package amazingracev2;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

/**
 *
 * @author gia.thinh
 */
public class AmazingRaceV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
    }
    
    public static void register() {
        Pet petList[] = new Pet[6]; 
        
        petList[0] = new Cat("TOM", 1950, 10.5, "><");
        petList[1] = new Cat("KITTY", 1990, 5.0, "><");
        petList[2] = new Dog("NGAO DA", 2021, 50.0);
        petList[3] = new Dog("BE TO", 2012, 5.0);
        petList[4] = new Hamster("Hamster1", 2021, 3.0);
        petList[5] = new Hamster("Hamster2", 2021, 4.0);
        
        
        for (Pet pet : petList) {
            pet.performRun(); // QUAN TRỌNG: Chạy và lưu tốc độ
            pet.showProfile();
        }
        
        for (int i = 0; i < 6 - 1; i++) {
            for (int j = i + 1; j < 6; j++) {
                // So sánh speed của 2 pet liền kề
                if (petList[i].getSpeed() < petList[j].getSpeed()) {
                    // Swap nếu pet bên trái chậm hơn pet bên phải
                    Pet temp = petList[i];
                    petList[i] = petList[j];
                    petList[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        
         for (Pet pet : petList) {
            pet.showProfile();
        }
    }
    
}
