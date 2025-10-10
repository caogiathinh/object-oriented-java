package data;

/**
 *
 * @author gia.thinh
 */

public class Dog {
    
    private String name; 
    private int yob;   
    private double weight; 

    //chuột phải -> insert code: để tự generate ra code
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
  

