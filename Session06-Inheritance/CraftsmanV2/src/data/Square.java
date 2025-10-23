
package data;

/**
 *
 * @author gia.thinh
 */
//hình vuông là phiên bản của hcn, độ lại, độ lại 2 cạnh kề bằng nhau
//không mất đi bản sắc hình chữ nhật 4 gốc vuông
//hình vuông là sự mở rộng, nâng cấp, đặc biệt hóa, phiên bản mới có sự điều chỉnh
//thay đổi nhỏ từ hcn 
//cách chế tạo cái khuôn mới từ khuôn cũ, kế thừa lại, đứng trên vai .. 
//không phải là COPY/PASTE
//phiên bản cũ là mình làm các Khuôn từ đầu, không kế thừa, sp chỏi nhau 
//không cùng 1 nhà được 

//1. mới A Extends cũ B
//2.                   HCN Khuôn gốc để độ: Class Cha, parent, super, base
//      HV              kế thừa từ HCN:     Class Con, child, sub, derived
                                                       //biến hình, chế ra 
                                                       //xuất phát từ
//2. Đặc điểm của con là gì ?
//              vì HV là phiên bản của HCN, nên nó sẽ có tất cả mọi thứ từ HCN
//                  tao là HCN, phải có những gì của HCN     
//KHÔNG CẦN LÀM LẠI FIELD/INTANCE VARS

//3. cần phễu để đúc phiên bản mới, cần vật liệu đưa vào, gửi vào Cha giữ, đổ lên
//  Cha, vì có mọi thứ từ Cha phiên bản gốc
//  tôn trọng bản sắc của Con, Con HV. 
//  code tự sinh ra sẽ căn theo phễu của Cha, 4 tham số, để đổ được 4 tham số 
//                              phễu con phải 4, CHẾT, MẤT BẢN SẮC 

public class Square extends Rectangle {
                                                //trade-off
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    } //~~~  new Rectangle(o, c, w, l);
    //       new hình vuông chính là new hình chữ nhật
    //       new HV chính là new 1 phiên bản HCN 
    //              có color, own, cạnh -> HCN dưới dạng hình vuông cũng là thế mà
    
    //VỀ LÍ ĐÃ XONG KHUÔN VUÔNG, VÌ DATA NHƯ TRUYỀN THỐNG, DÙNG LẠI HẾT CỦA CN
    //KO CẦN VIẾT LẠI CODE, KHÔNG COPY PASTE
    //KHÔNG CHỈNH SỬA DÂY CHUYỀN QUÁ NHIỀU, TẤT NHIÊN ĐANG DÙNG SP, SERIES
    
    //hiện tượng hàm con trùng 100% với tên hàm cha
    @Override //dính khái niệm gọi là tính đa hình, đa xạ, đa kế thừa
    //đa nhân cách, đa sắc thái, 5 sắc thái, biến hình, TRANSFORMER 
    //POLYMOPHISM
    //HIỆN TƯỢNG CON QUA MẶT CHA, THỂ HIỆN BẢN SẮC CỦA CON, CHA NGỒI IM ĐẾ CON
    //LÀM CHO, ĐỂ CON LÊN TIẾNG, CHA ĐỂ ĐÓ CON, VỜ NHƯ KO THẤY CHA
    public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|  -  |%4.1f|%7.2f|\n", 
                                owner, color, width, getArea());
    }
}
