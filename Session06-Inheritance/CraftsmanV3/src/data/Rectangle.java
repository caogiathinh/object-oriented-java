
package data;

/**
 *
 * @author gia.thinh
 */
public class Rectangle {
    protected String owner;
    protected String color; 
    protected double width;
    private double length;
    //private double area; //đặc điểm/đặc tính dc tính từ các đặc tính khác
                         //khác, từ w * l- > đặc tính dẫn xuất - derived field
                         //thành tiền = số lượng * đơn giá
    //dẫn xuất tức là dc tính từ kẻ khác, tính tức là xử lý, hàm xuất hiện 
    //hàm phụ thuộc về kẻ có nhiều info
    //ví dụ khác: lưu tuổi, lưu cả năm sinh -> mỗi năm tăng 1 tuổi lên 1 nhát
    
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
        
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    
    //ai có nhiều info gã đó tính, hàm thuộc về....
    public double getArea() {
        return this.width * this.length;           
    } 
    //re-use ở các chỗ khác
    
    @Override 
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }

    public void paint() {
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }
}
