
package data;

/**
 *
 * @author gia.thinh
 */
//là khái niệm chung cho mọi loại hình nào đó: V, , CN, TG, HBH, ... 
public abstract class Shape {

    protected String owner;
    protected String color;
    protected String borderColor;

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    //hình nói chung sẽ có S và P, tính thế nào? tùy hình mà tính không thể nói cụ thể được
    //S và P là khái niệm đề cập đặc tính và hành vi của hình học nói chung
    //nó là chung chung không cụ thể 
    //cụ thể thì để mỗi hình tự lo 
    //nói về ý tưởng thôi, gọi là trừu tượng 
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void paint();
}
