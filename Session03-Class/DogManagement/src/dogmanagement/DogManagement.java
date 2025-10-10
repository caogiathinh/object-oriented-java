package dogmanagement;

import data.Dog;

/**
 *
 * @author gia.thinh
 */
public class DogManagement {
    public static void main(String[] args) {
        //lấy Khuôn Dog ra để bắt đầu đỗ info 
        //y chang làm thẻ căn cước: lấy thông tin, in lên thẻ, đổ mực. 
        //sau khi chờ khô, ta được object thuộc Nhóm vừa đúc 
        //đật tên gọi tắt cho object đế dễ nói chuyện - tham chiếu
        
        int   yob =             2001;
        Dog chiHu =         new Dog("CHI HU HU", 2021, 0.5);
     //Ca Si ChiPu {name: NTC; yob: 1993; hits: Anh ơi}
                            //JSON Javascript
        // biến/tên tắt         object
        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2001, 50.0);
        ngaoDa.bark();
       
        //chiHu sủa trở lại 
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        
        //bark() ?? đứa nào sủa vậy ?? ko biết
        //HÀNH ĐỘNG GẮN VỚI OBJECT THÔNG QUA OBJECT
        System.out.println("After overweight");
        chiHu.setNewWeight(5.0);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        System.out.println("ND YOB: " + ngaoDa.getYob());
    }  
    //new xin 1 vùng ram mới chứa info của 1 bạn Dog sẽ dc đúc, dc đổ data. 
    //có 2 vùng name dành cho 2 object 
    //ND không thể đè CH
}
//ENCAPSULATION: TÍNH ĐÓNG GÓI THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT/THỰC THỂ 

 