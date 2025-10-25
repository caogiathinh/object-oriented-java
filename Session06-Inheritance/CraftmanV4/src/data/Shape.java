
package data;

/**
 *
 * @author gia.thinh
 */
//KHUÔN TỔ SINH RA N KHUÔN KHÁC CHO NHANH 
//GIÚP CHO KHUÔN TRÒN CHỮ NHẬT BÌNH HÀNH TAM GIÁ, .. Ở CHUNG MỚI SORT ĐƯỢC
//
public abstract class Shape {
    
    protected String owner;
    protected String color; 
    protected String borderColor;
    //cạnh thì sao??
    //protected double a, b, c, radius; //còn nữa thì sao, có nên không ?? 
    //khong được đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa các cạnh, hình vuông sẽ có cạnh, nhiều nữa là đằng khác, bk 
    //tròn thừa kế luôn cả cạnh 
    //bk, cạnh là của riêng từng đứa con, dị biệt thì phải ở từng đứa con không thể ở chung
   
    //cha sẽ là nhân tư chung cho các con, ngoài đời y chang. 
    //đám con có di truyền từ ba má: owner, color, đường bo
    //nhưng còn giữ lại những khác biệt: Tròn: bán kính, Vuông: cạnh.,
    //anh em trong nhà thừa kế từ ba má nhiều thứ, tài sản riêng Con tạo dựng 
    //người đó giữ
    
    
    //diện tích chu vi là derived field được tính từ thằng khác không nên đưa vào đây

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
    
    //1 Khuôn vẫn theo nguyên tắc chung vẫn chế tạo theo nguyên tắc chung 
    public void paint() {
        
    }
    
    //XÓA KHÔNG CHO VÌ CẦN KHÁI NIỆM NÀY ĐỂ DIÊN TẢ RÕ Ý NGHĨA HH
    //ĐỂ KHÔNG ĐƯỢC VIẾT CODE, VÌ KHÔNG CỤ THỂ KÍCH THƯỚC
    //VẪN TỒN TẠI NHƯNG KHÔNG CHẠM ĐƯỢC, VẪN TỒN TẠI VỚI NGHĨA TINH THẦN MÔ TẢ HOI, NÓI VỀ HOI NHƯNG CHƯA CỤ THẺ
    //NÓI NHƯNG LÀM, KHÁI NIỆM THOI. 
    //HÀM TRỪU TƯỢNG, VẤN ĐỀ TRỪU TƯỢNG, THỨ VÔ HÌNH VÀ VẪN HỮU HÌNH
    //ĐỂ VÀO CHO ĐỦ BỘ HOÀN THIỆN 1 THỨ GÌ ĐÓ, LÃNH ĐẠO TINH THẦN, KO QUYỀN LỰC CỤ THỂ.
    //MA, QUỶ VÔ HÌNH, MÌNH VẪN SỢ, KHÁI NIỆM THÔI, ABSTRACT
    public abstract double getArea();  //chỉ nói thoi mà không có code
    public abstract double getPerimeter(); 
    //tao chỉ nói rằng HH có thứ này, còn mỗi đưa V T CN.. tự lo đi
    
    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOI, CHƯA CẦN CỤ THỂ. 
    //ABSTRACT CLASS: LÀ PHÂN LOẠI TRONG CUỘC SÔNG TỰ NHIÊN
    //                ĐỂ DỄ DÀNG NÓI VỀ CÁC OBJECT, XẢY RA CỰC NHIỀU TRONG CUỘC SỐNG

//        //return 50; //không chơi default vô nghĩa
//        //cạnh đâu để sửa lại S, công thức đâu mà tính
//        
//                           //không có kích thước sao tính được
//                           //không xóa hình được vì HH thì phải có S
//        //Hình học cần có diện tích là khái niệm, nói rằng thằng nào chiếm bề mặt, có số đo S
//        //đại diện cho 1 nhóm/series các đồ vật khác đều có S, P 
//        //để đây như là ý nghĩa tinh thần, đảm bảo để mô tả 1 thứ nào đó. 
//        //HH có S, P
//    }
    
    //diện tích chu vi không được xem là đặc tính mà phải xem là hành vi
    //2 hàm tính diện tích, chu vi để ở đâu??? Con hay cha, hay cả 2 ?? 
    //cả 2, vừa là di truyền vừa là dị biệt (@Override)
    //ĐÃ NÓI VỀ HÌNH HỌC, LÀ PHẢI NÓI VỀ CHU VI DIỆN TÍCH
    
    //HÌNH CỤ THỂ V TR TG HBH CHẮC CHẮN LÀ TÍNH ĐƯỢC, CŨNG LÀ ĐĐ CỦA TỪNG HÌNH  
    //mỗi loại hình sẽ dị biệt trong tính toán nói chung là có S và P
    
}
