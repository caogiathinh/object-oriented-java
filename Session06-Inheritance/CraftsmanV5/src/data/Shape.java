
package data;

/**
 *
 * @author gia.thinh
 */
//KHUÔN TỔ, SINH RA N KHUÔN KHÁC CHO NHANH.
//GIÚP V, CN, TR,...  Ở CHUNG MẢNG, MỚI SORT ĐƯỢC

public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    
    //các cạnh thì sao ??
    //không thể 
    //protected double a, b, c, radius; // ... còn nữa thì sao có nên không? 
    //không được đưa các cạnh vào đâu, vì chúng sẽ kế thừa hết, hình vuông lại có bán kinh ... 
    //bán kính, cạnh là của riêng từng đứa: cạnh của hình vuông, bán kính cho hình tròn
    //dị biệt là phải ở từng đứa con 
    
    
    //Cha sẽ là nhân tư chung cho các ngoài đời y chang 
    //đám con có di truyền từ ba má: COLOR, OWNER,.. 
    //NHƯNG CÒN GIỮ LẠI NHỮNG KHÁC BIỆT: VUÔNG - CẠNH, TRÒN - BÁN KÍNH, ... 
    //anh em trong nhà thừa kế từ ba má nhiều thứ, tài sản riêng mỗi Con tự tạo dựng
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

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //khuôn vẫn chế tạo theo nguyên tắc chung
    //VẪN TỒN TẠI NHƯNG KHÔNG NẮM ĐƯỢC, TỒN TẠI VỚI NGHĨA MÔ TẢ THÔI. 
    //KHÔNG CỤ THỂ, NÓI NHƯNG CHƯA LÀM
    //HÀM TRỪU TƯỢNG, VẤN ĐỀ TRỪU TƯỢNG, THỨ VÔ HÌNH MÀ VẪN HỮU HÌNH.
    //ĐỂ VÀO CHO HOÀN THIỆN 1 THỨ GÌ ĐÓ, LÃNH DẠO TINH THẦN KHÔNG CÓ QUYỀN LỰC
    
    //ABSTRACT: KHÁI NIỆM NÓI THÔI CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG ĐỂ DỄ DÀNG NÓI VỀ CÁC ĐỐI TƯỢNG.
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    //việc vẽ và in ra thông tin cũng là chung chung vì mỗi hình mỗi khác
    public abstract void paint();
//    public double getArea() {
//        //tính thế nào?? éo có kích thước vì dị biệt ở từng Con 
//                        //không có kích thước sao tính
//                        //không xóa được, vì HH phải có S, P
//        //return 50; //kh được default, vô nghĩa khi new 
//        //tất cả diện tích đều bằng 50 à. 
//        //HH cần có S như là khái niệm, nói rằng thứ nào chiếm bề mặt, có số đo S
//        //đại diện cho 1 nhóm các đồ vật cụ thể khác đều có S, P 
//        //để đấy như ý nghĩa tinh thần đảm bảo đủ để mô tả 1 thứ nào đó.
//        //HH có S, P 
//        
//    }
    
//    public double getPerimeter() {
//        //tính thế nào
//    }
//    
    //diện tích, chu vi không được xem là đặc tính, xem là hành vi 
    //2 hàm tính diện tích chu vi để ở đâu ??? Con hay Cha, hay cả 2 ?? 
    //cả 2, VỪA LÀ DI TRUYỀN VỪA LÀ DỊ BIỆT - OVERRIDE
    //ĐÃ NÓI HÌNH HỌC LÀ PHẢI NÓI S, P 
    
    //HÌNH CỤ THỂ V, TR, HBH CHẮC CHẮN LÀ TÍNH ĐC, CŨNG LÀ ĐẶC ĐIỂM CỦA TỪNG HÌNH
    //mỗi con sẽ dị biệt trong tính toán, nhưng nói chung có S, P thừa kế từ Shape
}

//ABSTRACT LÀ KHÁI NIỆM, Ý TƯỞNG 1 THỨ GÌ ĐÓ
//VỚI HÌNH HỌC THÌ getS(). getP() là 2 khái niệm phải có 
//cần có khi mô tả về hình học

//tivi phải nói về dò kênh, kết nối  

//điện thoại nói về bắt sống, nhận cuộc gọi, gửi sms, ... 
//nhưng mô tả này có thể là cụ thể, nhưng cũng có thể là ý tưởng, 
//chung chung 
//chung chung gọi là ABSTRACT
//còn cụ thể là      CONCRETE

