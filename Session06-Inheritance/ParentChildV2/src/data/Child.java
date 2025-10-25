
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
//      Con làm thêm được 1 loại tài sản 

//3. Làm phễu giữ bản sắc cho Con, thỏa hiệp nếu cần 


public class Child extends Parent {
    
    private String assetThree; 
    
    //lí thuyết, Con có đến 3 thứ: a1, a2, a3, phễu phải đổ cả 3, kế thừa Cha giữ 2
    //new Con chính là new Cha

    public Child(String assetThree, String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
        //phải có Cha thì mới có không gian cho con mở rộng 
        //BẮT BUỘC PHẢI CÓ BASE TRƯỚC, EXTENDS SAU
        //ĐỂ LƯU THÊM PHẦN KHÁC BIỆT
        //BỐ TRÍ RAM CHO BA TRƯỚC SAU ĐÓ MỞ RỘNG CHO CON 
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
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
//CON CÓ QUYỀN KHÁC TRÊN ĐẶC ĐIỂM HÀNH VI CỦA CHA (NGOÀI KẾ THỪA OVERRIDE)
//DẤU CHÁM THÌ SAO?
//KHAI CHA NEW CON CHỈ XỔ CỦA CHA, KHÔNG CHỊU XỔ PHẦN KHÁC BIỆT, DÙNG DANH NGHĨA
//NGƯỜI LỚN, PHẢI HÀNH XỬ NHƯ NGƯỜI LỚN
//muốn xổ tắt kỹ thuật tổ lái con trỏ
        

