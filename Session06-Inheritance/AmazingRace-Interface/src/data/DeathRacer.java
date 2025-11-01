package data;

/**
 *
 * @author gia.thinh
 */
//câu lạc bộ của những gã thích đua đến chết, gom những class, object có chung 
//hành động đua, không care gì khác
//clb là nơi tập hợp những người có chung tiếng nói hành động giao tiếp
//là 1 hình thức gom khuôn gom object phần loại về 1 cái gì đó
//lỏng lẻo hơn kế thừa không care đặc điểm
//chơi chung
//MOTOR VÀ DOG, ... IS A MEMBER OF DEADRACER
//ANH EM MÌNH SINH RA LÀ SINH VIÊN
//ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, SÁT THỦ, GAME THỦ, ... 
//ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM. 
//1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: BÀ CON, HỘI NHÓM XÃ HỘI
//HỘI BÀ CON DI TRUYỀN KẾ THỪA
//HỘI XÃ HỘI, CÙNG NHAU LÀM GÌ ĐI 
//CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động
//CLB để anh em tự hành động theo cách của mình
//vào CLB TIẾNG ANH mình speakEnglish theo giọng của mình
//đua thì đua theo cách của mình
//Interface CLB để mọi người tự chơi theo cách của mình - chơi - hành dộng là abstarct
//CHỈ NÓI NỘI QUY THÔI, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI 
//CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT
//ko cần ghi ra từ khóa ABSTRACT ở cả tên clb và tên hàm
//VÌ CLB HÀM Ý/NGẦM HIỂU LÀ CHỈ CÓ NỘI QUI ĐỂ MỌI NGƯỜI THEO, NỘI QUI LÀ CHUNG CHUNG
//ĐẺ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG
//JDK SAU CHO PHÉP INTERFACE CÓ HÀM NHƯNG 
public interface DeathRacer {

    //phàm ai đã chọn nghề đua thủ, thì phải đua
    //public abstract double runToDead(); //ko cần từ abstract

    public double runToDead(); //ko cần từ abstract
    public void showHowToDead();
}
