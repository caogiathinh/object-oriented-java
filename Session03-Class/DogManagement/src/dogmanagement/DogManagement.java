package dogmanagement;

import data.Dog;

/**
 *
 * @author gia.thinh
 */
public class DogManagement {
    public static void main(String[] args) {
        //lấy Khuôn Dog ra để bắt đầu đổ info 
        //y chang làm thả căn cước: lấy thông tin, in lên thẻ, đổ mực 
        //sau khi chờ khô, ta được Object thuộc Nhóm vừa đúc
        //đặt tên gọi tắt cho Object để dễ dàng tham chiếu
        int  yob  =           2001;
        Dog chiHu =          new Dog("CHI HUHU", 2021, 0.5);
        //  biến/tên tắt          object
        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
        ngaoDa.bark();
        
        chiHu.bark();
        
        //bark() ?? đứa nào sửa vậy ?? không biết
        //HÀNH ĐỘNG GẮN VỚI OBJECT THÔNG QUA DẤU CHẤM
        System.out.println("After overweight");
        chiHu.setNewWeight(5);
        chiHu.bark();
    }
    //new xin 1 vùng ram mới chứa info của 1 bạn Dog sẽ dc đúc, dc đổ data. 
    //có 2 vùng name dành cho 2 object 
    //ND không thể đè CH
}

//ENCAPSULATION: TÍNH ĐÓNG GÓI GIỮA THÔNG TIN VÀ HÀNH ĐỘNG. 
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ
