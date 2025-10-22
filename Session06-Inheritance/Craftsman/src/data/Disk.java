package data;

/**
 *
 * @author gia.thinh
 */
public class Disk {

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

    public void paint() {
        System.out.printf("|DISK     |%-15s|%-10s|%4s|%4.1f|\n", owner, color, smile, radius);
    }

}
