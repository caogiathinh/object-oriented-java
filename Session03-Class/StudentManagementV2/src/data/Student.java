package data;

/**
 *
 * @author gia.thinh
 */
public class Student {
    private static String id; //nằm ở vùng nhớ riêng, mà object nào cũng xài ké, chung
    public static String name; //vùng nhớ xài chung cho các object cùng nhóm/Class 
                               //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng
    //CHỐT:  KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐĐ/ HÀM CỦA RIÊNG TỪNG OBJECT
    //tui có mã số, bạn có mã số,  bạn kia có mã số, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm, khác value, vậy phải có biến clone riêng (non-static)
    public int yob; //non static
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    
    //hàm tự tui 
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
        
        System.out.println("yob: " + yob);
        //NON-STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJ, VÀ STATIC LUÔN, ĐỒ RIÊNG THÀNH CỦA CHUNG
    }
     
    public int getAge() {
        return 2021 - yob; 
    }     
    
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
        //System.out.println("By the way, my yob is: " + yob); 
        //Static chỉ chơi với static vì cùng khu vực, không chơi với non
        //         có quá trời yob được clone biết lấy ai bỏ ai
        
    }
}
