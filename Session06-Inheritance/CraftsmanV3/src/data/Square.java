package data;

/**
 *
 * @author gia.thinh
 */
//hình vuông là phiên bản đặc biệt của hcn
//không mất đi bản sắc hcn là 4 góc vuông
//hv là sự mở rộng, nâng cấp, đặc biệt hóa, phiên bản mới 
//chỉnh/thay đổi nhỏ từ hcn 
//cách chế tạo khuôn từ khuôn cũ 
//chế tạo khuôn mới từ khuôn cũ, kế thừa, dùng lại
//không phải là copy/paste
//phiên bản cũ làm các Khuôn từ đầu, không kế thừa, sản phầm chỏi nhau. 
//không cùng 1 nhà được 
//1. mới A extends cũ B
//                      HCN Khuôn gốc để đổ: Class Super, Class parent, base
//                           kế thừa từ hcn: Class Con, Class child, sub, derived  
//2. Đặc điểm của con là gì??
//              Vì HV là phiên bản HCN, nên nó sẽ có tất cả mọi thứ từ hình chữ nhật
//                tao là HCN, tao phải có những gì HCN đang có
//3. Cần phễu để đúc phiên bản mới, vật liệu đưa vào, gửi lên Cha, đổ lên 
//     Cha, vì có mọi thứ từ Cha, phiên bản gốc
// tôn trọng bản sắc Con, Con HV, o, c, edge only edge
//code tự sinh ra nó sẽ căn theo phễu của Cha, 4 tham số, để đổ được 4 tham số 
//                               phễu con phải 4, mất bản sắc
public class Square extends Rectangle {

    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }  //~~~~ new Rectangle(owner, color, width, length); 
    //     new hv chính là new hcn 
    //     new hv chính là new phiên bản hcn
    //     cắt hv bản chất là cất hình chữ nhật. 
    //     có color, owner, cạnh -> HCN dưới dạng hình cũng thế mà 
//   private String owner;
//   private String color; 
//   private double edge; 
    @Override //dính đến khái niệm đa hình, tính đa hình, đa xạ, đa kế thừa
              //đa nhân cách, 50 sắc thái, biến hình, TRANSFOMER
              //POLYMOPHISM
              //HIỆN TƯỢNG CON QUA MẶT CHA, THỂ HIỆN BẢN SẮC CỦA RIÊNG CON, CHA NGỒI IM CON 
              //LÀM CHO, ĐÊ CON LÊN TIẾNG, VỜ NHƯ KHÔNG THẤY CHA
    public void paint() {
        System.out.printf("|SQUARE  |%-15s|%-10s|%4.1f|  - |%7.2f|\n", owner, color, width, getArea());
    }
    //VÌ LÝ ĐỔ XONG KHUÔN DÙNG LẠI, VÌ ĐỔ DATA NHƯ TRUYỀN THỐNG, DÙNG LẠI HẾT CỦA CHỮ NHẤT
    //KHÔNG CẦN VIẾT LẠI CODE KHONG COPY/PASTE
    //KHÔNG CHỈNH SỬA DÂY CHUYỀN SẢN XUẤT QUÁ NHIỀU, TÁT NHIÊN ĐANG CÙNG DÒNG SP, SERIES
}
