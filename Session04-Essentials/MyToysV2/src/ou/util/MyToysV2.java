package ou.util;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
//khuôn chứa các thư viện, dặc điểm, hành động / chứa các món đồ chơi dùng chung
//cho mọi nơi - vì nó không nhớ cái gì cho riêng tư của nó. 
//LIBRARY - chứa các hàm/biến (data) dùng chung cho nhiều công việc khác nhau. 
//của các dự án khác nhau 
public class MyToysV2 {

    //đặc điểm hành vi static, cho người ta sờ thì thêm public 
    //không nhớ cái gì của riêng mình
    //Một class bình thường vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết static 
    //String: vừa non-stati, vừa có static 
    //System: hầu hết static 
    public static final double PI = 3.1415;

    //quá trình làm app, việc nhập số lặp lại nhiều lần
    //nhập 2 của 1 hcn, 3 cạnh của tg, nhập sự lựa chọn menu 1..5, điểm trung bình, điểm thi các môn 
    //mỗi cú nhập, biến nhập, kèm theo trôi lệnh, cà chớn ~ try-catch - do-while.
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới trôi lệnh, nhập lại  vào 1 chỗ 
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqr(4) -> mình dùng Math không cần nhớ, dùng nhiều ram làm gì.
    public static int getAInteger() {
        int n; //
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextLine() để lại rác
                n = Integer.parseInt(sc.nextLine()); 
                //if chửi nếu ngoài range, ngoài biên: 1..6
                return n;
                
            } catch (Exception e) {
                System.out.println("Do ku know to input an integer?");
            }
        } while (true);
    }

}
