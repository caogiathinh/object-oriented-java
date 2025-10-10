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
    
    //chủ động đưa nhiều info của ta ra
    public void bark() {
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //một object bất kì có nhiều info mô tả, ví dụ: xem đtdđ trên thế giới di dộng, đập hợp có sách
    //ghi thông số luôn. Nhìn 1 cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã số, ... 
    //gặp chú ảnh sách giao thông, show ra các info mình có: CCCD, Driver lic, cà-vẹt.. 
    //việc show info của 1 object là tự nhiên, FB profile 
    //đó là 1 hành động nên có của 1 object, mô tả đặc về object 
    //hành động có thể do ta chủ động tự đưa ra hoặc tự generate theo template có sẵn.
    //template có sẵn, java giúp mình, mình không cần code. 

    
    @Override //khác overload đó nhen, dính đến kế thừa
    //nhưng cả 2 thằng đều có liên quan đến 1 khái niệm là POLYMORPHISM - 50 sắc thái, đa nhân cách
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại dc quyền, vì chỉ cần trả chuỗi info của mình. 
        //y chang làm card visit
        //String tmpMsg = String.format("|%-10s|%4d|%4.1f|", name, yob, weight); //trả chuỗi thô, không xuống hàng.
        //return tmpMsg;
        return String.format("|%-10s|%4d|%4.1f|", name, yob, weight); 
    }
    
    //hàm gắn với việc xử lí thông tin object. Ai giàu info gã đó nên xử lý
    public int getAge() {
        return 2021 - this.yob; 
    }
    //viết code thế này gọi là hard-code không hay, fix-valua, năm sau phải sửa code thì tuổi mới đúng
    //chuẩn: lấy giờ hệ thống Windows - yob; 
    
    
    
}
  

