
package data;

/**
 *
 * @author gia.thinh
 */
//1.  1. IS  A xuất hiện 1 chiều extends, chuẩn bị xài lại, không có tự làm
//2. Khai báo các đặc điểm, lưu ý:
//  2.1. Nếu con trùng hết với Cha, không cần làm lại, Cha sẽ làm cho
//          giả sử con cũng chỉ làm 2 tài sản, không cần khai báo gì cả.

//  2.2. Con có đồ riêng, làm riêng, giấu Ba, liệu Ba có biết không ? 
//      biến dị
//3. Làm phễu giữ bản sắc cho Con, thỏa hiệp nếu cần 


public class Child extends Parent {

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override //con có hàm trùng tên với Cha + vượt mặt Cha (lúc chạy ưu tiên hơn)
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    //hàm mới hành động mới của con khác cha hoàn toàn 
    //ngoài đời: con vào sài gòn đi làm thêm, đánh game, đá banh, ... 
    //tập thể thao mạo hiểm
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
    }
}
        

