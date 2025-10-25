package workshop2;

import data.Triangle;

/**
 *
 * @author gia.thinh
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sortTriangle();
    }

    public static void sortTriangle() {
        Triangle arr[] = new Triangle[6];
        
        arr[0] = new Triangle("PINK", 3, 4, 5);
        arr[1] = new Triangle("PINK", 6, 8, 10);
        arr[2] = new Triangle("PINK", 5, 12, 13);

        arr[3] = new Triangle("RED", 5, 6, 7);
        arr[4] = new Triangle("RED", 7, 10, 15);
        arr[5] = new Triangle("RED", 8, 9, 11);
        
        System.out.println("List triangle before sort");
        for (int i = 0; i < 6; i++) {
            arr[i].paint(); 
        }
        
        for (int i = 0; i < 6 - 1; i++) {
            for (int j = i + 1; j < 6; j++) {
                if(arr[i].getArea() > arr[j].getArea()) {
                    Triangle tmp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println("List triangle after sort");
        for (int i = 0; i < 6; i++) {
            arr[i].paint(); 
        }
    }

}
