package data;

/**
 *
 * @author gia.thinh
 */
public class Cat extends Pet {
    
    public static final double MAX_SPEED = 50;
    
    private String ribbon; 

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        
    }

    @Override
    public void showRecord() {
        
    }
    
    
}
