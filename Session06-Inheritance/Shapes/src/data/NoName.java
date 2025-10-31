
package data;

/**
 *
 * @author gia.thinh
 */
public class NoName extends Shape {

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        //hình cắt ở bên word là hình duy nhất, S không thể có công thức được, mà
        //là con số đo được = thước + tích phân
        //đảm bảo S là con số, còn theo công thức hay đo đạc ko ảnh hưởng
        //nếu chế tạo khuôn sẽ là công thực nhân bản 
        //hình mình đang cắt là unique
        return 50; //giả bộ cho cái hình WORD
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

//NẾU TA LÀM RIÊNG MỘT CÁI KHUÔN CHO MỘT CÁI HÌNH CỤ THỂ KHÔNG HÌNH DẠNG SAU NÀY
//TA NHÂN BẢN THÌ HÌNH NÀO CŨNG 50, VÔ LÍ, CẮT NGẪU NHIÊN DIỆN TÍCH
//CÔNG THƯC TÍNH KHÔNG CÓ LUÔN
//NÊU CHỦ ĐỘNG LÀM CLASS CON THÊ NÀY, THÌ NÓ LẶP LẠI GIỐNG V, TR, CN
//CẦN CÓ CÔNG THỨC CHUNG CHO S, P ĐỂ CON CLONE CÁC HÌNH

//BÊN WORD HÌNH ĐỘC ĐÁO, DUY NHẤT, KHÔNG THỂ DÙNG KHUÔN RỜI  NONAME ĐANG LÀM. 
//TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP
//TRẢ RA DIỆN TÍCH VÀ CHU VI HARDCODE, ĐÚNG NGHĨA LÀ 1 HÌNH DUY NHẤT
//CHẾ KHUÔN LÀ DÀNH CHO NHÂN BẢN

