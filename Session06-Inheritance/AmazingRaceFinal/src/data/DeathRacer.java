
package data;

/**
 *
 * @author gia.thinh
 */
//clb của những gã thích đua đến chết, gom những OBJECT CLASS CÓ CHUNG HÀNH ĐỘNG ĐUA
//KHÔNG CARE CHUYỆN KHÁC
//CLB LÀ NƠI TẬP HỢP NHỮNG NGƯỜI CÓ CHUNG TIẾNG NÓI HÀNH ĐỘNG
//CŨNG LÀ HÌNH THỨC GOM KHUÔN, GOM OBJECT PHẦN LOẠI VỀ CÁI NHÓM GÌ ĐÓ
//LỎNG LẺO HƠN KẾ THỪA, KHÔNG DI TRUYỀN ĐẶC ĐIỂM, CHUNG HÀNH ĐỘNG VÀO
//CHƠI CHUNG
//MOTOR, DOG, .... IS A MEMBER O, IS A DEADRACER
//ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SINH VIÊN ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, SÁT THỦ, GAME THỦ
//1 OBEJCT 1 CLASS SẼ HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI 
//HỘI BÀ CON DI TRUYỀN VÀ KẾ THỪA
//HỘI XÃ HỘI: CÙNG NHAU CHIẾN, LÀM GÌ ĐI

//chỉ quan tâm hành động, trong đây chỉ chứa hành động  
//CLB đẻ anh em tự mình hành động theo cách của mình 
//speakEnglish() theo giọng của mình !!!!
//đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe, cà chân chóng té lửa
//Interface CLB để mọi người chơi theo cách của mình - chơi - hành động là abstract
//CHỈ CÓ NỘI QUI CLB THÔI HEN, MỌI NGƯỜI THEO ĐÓ MÀ LÀM TỰ MỖI NGƯỜI
//CHÔT HẠ: INTERFACE CHỨA HÀM ABSTRACT 
//không cần ghi ra từ khóa ABSTRACT ở cả tên clb và tên hàm
//VÌ CLB NGÀM HIỂU LÀ CHỈ CÓ NỘI QUI ĐỂ MỌI NGƯỜI THEO CHO NÊN NỘI QUI LÀ CHUNG CHUNG ĐỂ MỌI NGƯỜI THEO\IMPLEMENT
//NGÀM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG


//JDK SAU CO PHÉP CHỨA HÀM CÓ CODE NHƯNG .. 

public interface DeathRacer {
    
    //phàm ai đã chọn nghề đua thủ, tham gia đua thủ, thì phải đua
    public double runToDead(); //không cần từ abstract
    public void showHowToDead();  //gáy bằng tổ quốc ghi công
    
}
