package dogmanagement;

import data.Dog;

/**
 *
 * @author gia.thinh
 */
public class DogManagement {
    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
     
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2001, 50.0);
        ngaoDa.bark();
       
      
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        
        //tui muốn show toàn bộ info của tui, theo cách toString() 
        //object có nhiều hành động
        System.out.println("Show info by using toString() - a new bahavior");
        
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails); 
        System.out.println("ND details " + ngaoDa.toString());
        
        System.out.println("Play with toString - GOI THAM BEN EM");
        System.out.println(chiHu); //chiHu là biến object lưu tạo độ vùng new
                                   //lí thuyết in ra địa chỉ, thực tế java thì gọi toString()
                                   
        System.out.println(ngaoDa); //gọi thầm tên em toString()
        
        //nếu khuôn không có hàm toString() thì mặc nhiên khi nó được gọi (gọi thầm hay gọi trực tiếp)
        //JVM SẼ TỰ ĐỘNG BĂNG CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
        //ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256
        
        //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        System.out.println("ND age: " + ngaoDa.getAge());        
        
        //hàm toString rất đặc biệt, @override
        //mục tiêu là show ra all of info đã đổ vào, hoặc chỉnh sửa
        //y chang mở setting trong phone xem phần info của điện thoại 
        
        //int a = 100; 
        //printf("a: %d\n", a) -> vùng ram có primitive mấy value mấy
        //printf("a address: %u\n", &a); -> tọa độ địa chỉ 
        //int* p = &a; //p lưu tọa độ a, gọi là con trỏ, vì tao nhắm tới tọa độ nhà mày
        //printf("p has value of %u\n", p) -> địa chỉ a, 6M
        //printf("a has value of %d\n", *p); ->100  
        
    }  
}


 