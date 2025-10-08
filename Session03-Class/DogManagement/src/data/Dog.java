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
    //phễu còn gọn là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    //ra object vì thông qua nó vật liệu được chảy vào trong Khuôn
    //vật liệu khô ra được object, cmnd của ai, hồ sơ được tạo ra
    
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT. VÌ DÙNG NÓ TẠO RA OBJECT 
    //CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VẬT LIỆU VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
    //PHỄU LÀ HÀM ĐẶC BIỆT KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG CÓ VOID LUÔN, TRẢ VỀ
    //NGUYÊN CÁI OBJECT - bức tượng đang đúc.
    //tên 100% giống tên class
    
    //viết các hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
    //vì ba má đã fill yob = 2001; 
    //object thì gọi là hành động, behaviour, xử lí tính toán trên 
    //các biến đã được đổ value từ lúc đúc ra
    
    //hành vi trên data (propertises)
    //hàm gọi n lần tương đương các hành động mà object nào đó lặp đi lặp lại. 
    //hành động của obj gọi n lần trên obj đó.
    public void bark() {
        //System.out.println("Gogogogo... my name is: " + name);
        //System.out.println("Gogogogo... my yob is: " + yob);
        //System.out.println("Gogogogo... my weight is: " + weight);
        
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //mình đi xăm mình, nhuộm tóc 
    //thay đổi info ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight) {
        weight = newWeight; 
    }
    
    
}

//code bên ngoài giống như cái khuôn bị lủng
