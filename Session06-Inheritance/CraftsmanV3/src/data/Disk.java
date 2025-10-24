package data;

/**
 *
 * @author gia.thinh
 */
public class Disk {
    public static final double PI = 3.1415;
    
    private String owner;
    private String color;
    private String smile; //nụ cười
    private double radius; //bán kính

    public Disk(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", smile=" + smile + ", radius=" + radius + '}';
    }
    
    public double getArea() {     
        //return 3.14 * radius * radius;
        //return Math.PI * Math.pow(radius, 2);
        return Disk.PI * Math.pow(radius, 2); //this. hông nên coi static là tư hữu, của riêng ai, kể cả tui 
    } 

    public void paint() {
        System.out.printf("|DISK     |%-15s|%-10s|%4s|%4.1f|%7.2f|\n", owner, color, smile, radius, getArea());
    }
}
