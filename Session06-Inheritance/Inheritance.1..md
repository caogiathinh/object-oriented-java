[[OOP]]
## 1. Nhắc lại về object
- Obejct sẽ có:
	- Thông tin/đặc điểm/mô tả/thuộc tính của đối tượng: biến + value;
	- Hành động của đối tượng - method: hàm - function(). 
- Khi chơi với object oriented programming: xác định đối tượng -> class -> đúc ra đối tượng hàng loạt thông qua class Khuôn.
## 2. Vấn đề copy/paste, sắp xếp các hình khác nhau


```
package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author gia.thinh
 */
public class Craftsman {

    public static void main(String[] args) {
        //cutShape();
        sortShapes();
    }

    //cô giáo yêu cầu: sắp xếp các hình tăng dần theo diện tích 
    //dễ vì đã học  
    //muốn sắp xếp thì phải vào mảng thì ta mới sort tự động, vì kích thước hình
    //S hình là chưa biết trước nếu nhập từ bàn phím
    //vì e mới for được
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[3];
        //có 9 biến rectangle, chưa có hình cụ thể nào
        //lớp có 30 chỗ ngồi, chưa có bạn nào đến
        //rectArr[i] = new Rect(..); //[i] cần trỏ vùng new Rectangle() 
        //                                          new cũ, mới, éo quan tâm
        //                                      chỉ quan tâm vùng new clone new Rect
        rectArr[0] = r1;
//        rectArr[0].paint();
//        rectArr[0].setOwner("YEU TIA");
//        r1.paint();
        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("ANH HAI", "BLUE", 3.0, 3.0);
        
        //hình vuông sắp xếp luôn, đưa vào mảng luôn
        rectArr[3] = new Square("G.A.HAI", "BLUE", 5.0);
        //không cùng kiểu, không cùng hệ không cùng data type, éo chung mảng, không sort được
        //Lí thuyết muốn sort được cho vuông và chữ nhật thì 2 thằng này phải cùng mảng của 1 thứ.
        //nào đó, phải là 1 cái mảng gì gì đó. 
        //sort trên cái gì đó
        //nay: 2 khuôn độc lập, 2 mảng đọc lập

        System.out.println("The list of rectangles");
//        for (Rectangle x : rectArr) {
//            x.paint();
//        } //coi chừng null pointer exception
        //chỉ for đến chỗ đã trỏ đã gán của mảng. count trong bài cái tủ đó. 
        System.out.println("Before sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        //sort tăng dần theo diện tích, sort tăng dần theo gpa
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("MA", "PINK", 3.0);
        s1.paint();

        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
        d1.paint();
    }
}
```
 
### Class Retangle
```

public class Rectangle {
    private String owner;
    private String color; 
    private double width;
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
```
### Class Square

```
package data;

/**
 *
 * @author gia.thinh
 */
public class Square {
    private String owner; 
    private String color;
    private double edge; 

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }
    
    public double getArea() {
        //return edge * edge;      
        return Math.pow(this.edge, 2);
    } 
    //re-use ở các chỗ khác
    
    public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f|    |%7.2f|\n", owner, color, edge, getArea());
    }   
}
```
### Class Disk
```
package data;

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
```