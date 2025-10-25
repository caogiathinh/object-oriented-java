
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author gia.thinh
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithParentChild();
    }
    
    public static void playWithParentChild() {
        Parent p = new Parent("BIET THU", "100BTC"); 
        p.showProfile();
        //KHAI CHA NEW CHA, xổ ra gì ? xổ cái gì đó của Cha.
        
        
        Child c1 = new Child("NHA PHO", "100ETH");
        c1.showProfile(); //nếu không làm đồ riêng, đó là xài lại của Cha
        //mà sài của Cha thì phải nguyên tắc của Cha
        //nếu muốn qua mặt hãy tự làm đi @Override
        //KHAI CON - NEW CON, chấm xổ ra gì 
        //xổ tất cả những cha cho và của chính con 
        
        //KHAI GI NEW NÁY, XỞ CÁI NÁY, XỔ TẤT CẢ CỦA KHUÔN MÀ TA KHÁI BÁO 
        c1.sayHi();
        
        //cú chót, KHAI CHA NEW CON, ĐỌC THEO KIỂU KẾ THỪA
        //MÀY BIẾT TAO LÀ AI KO, BA TAO K VỪA ĐÂU, DANH NGHĨA DÒNG HỌ
        //KHẨU KHÍ DÒNG HỌ, CHA, CHỨ KHÔNG PHẢI MÌNH
        Parent c2 = new Child("CAN HO CAO CAP", "DOGECOIN"); 
        c2.sayHi(); 
        //CHỈ XỔ RA NHỮNG GÌ CỦA CHA, KHỒNG XỔ CỦA RIÊNG CON 
        //riêng Con có 2 thứ: Override và khác biệt hoàn toàn 
        //nếu con có trùng với Cha tên hàm, vẫn gọi cha nhưng chạy Con
        
        //đang dùng danh nghĩa Cha, thì cư xử như Cha, Cha éo có hàm sayHi() lấy
        //gi mà xổ, trong RAM vẫn có sayHi(), vì new Child() có sayHi()
        //clone Khuôn Child như nhau, quan trọng con trỏ
        
        //List<Student> list = new ArrayList(); 
        //cha                       con
        
        //kỹ thuật chạm vào đồ riêng tư của con
        //Ba biết trong Sài Gòn Con làm gì, vậy làm sao ba có thể biết?? 
        //DÙNG KĨ THUẬT DRIFT CON TRỎ. 
        
    }
}
