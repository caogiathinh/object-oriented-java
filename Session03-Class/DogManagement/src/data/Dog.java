package data;

/**
 *
 * @author gia.thinh
 */
//khuôn dùng để đút ra các object, đối tượng cần lưu trữ info, thứ
//làm ra để bán
//khuôn phải kín, có phễu để rót/hứng/đỏ vào cái data, nguyên liệu
public class Dog {
    //chứa các đặc điểm chi tiết mà cái Khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thế
    private String name; //biến toàn cục 
    private int yob;     //biến toàn cục 
    private double weight; 
    
    //có Khuôn thì phải có phễu/miệng để hứng vật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String iName, int iYob, double iWeight) {
        this.name = iName; 
        this.yob = iYob;   
        this.weight = iWeight; 
    }
    //phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng 
    //ra object vì thông qua nó như cái phễu vật liệu được chảy vào trong 
    //vật liệu thô ra object/bức tượng 
    //constructor, PHỄU là hàm cực kì đặc biệt, vì nó dùng để tạo ra object 
    //cứ mỗi lần sai nó phải đưa nguyên liệu vào, tức là có 1 object mới
    //phễu là HÀM ĐẶC BIỆT KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG VOID LUÔN, TRẢ VỀ NGUYÊN BỨC TƯỢNG ĐANG ĐÚC
    //tên 100% giống tên class
    
    //viết các hàm xử lí data, ví dụ giao tiếp với nhau hỏi năm sinh
    //object thì sẽ gọi là hành động behaivour, xử lí tính toán trên các 
    //biến đã được đổ value từ lúc đúc ra 
    
    //hàm gọi n lần tương đương các hành động mà các object nào đó lặp đi lặp lại
    //hành động của object được gọi n lần trên object đó, 
    public void bark() {
//      System.out.println("Gogogogo...... my name is " + name);
//      System.out.println("Gogogogo...... my yob is " + yob);
//      System.out.println("Gogogogo...... my weight is " + weight);
        
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //mình đi xăm mình, nhuộm tóc 
    //thay đổi info ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight) {
        weight = newWeight; 
    }
    
    
}

//code bên ngoài giống như cái khuôn bị lủng
