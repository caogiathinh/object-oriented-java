/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thinh.util;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
//đây là khuôn chứa các đặc điềm hành động chứa các món đồ dùng chung
//cho mọi nơi - vì nó ko nhớ cái gì cho riêng tư nó
//LIBRARY/FRAMEWORK - nơi chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau.


public class MyToys {
    //đặc điểm/hành vi là static, cho người ta sờ thêm public
    //ko nhớ cái gì của riêng mình
    //Một class bình thường thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết là static
    //String: vừa non-static, vừa có static
    //System: hầu hết static
    public static final double PI = 3.1415;
    //final ~ const bên C, biến k cho thay đổi value, trừ lần đầu tiên khai báo
    //HẰNG SỐ 
   
    //trong quá trình làm app, việc nhập số là lặp lại nhiều lần
    //nhập 2 của HCN, 3 cạnh TG, nhập sự lựa chọn menu 1...5, điểm tb, điểm thi các môn 
    //mỗi cú pháp biến nhập, kèm theo: trôi lệnh, cà chớn - try-catch - do-while
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ 
    //ta hứng kết quả trả về từ hàm, lấy lại để dùng, MyToys nhớ con số này làm gì
    //Math.sqr(4) -> mình dùng, Math k cần nhớ, kh cần non-static
    //new trả về kết quả cho người ta dùng, không cần nhớ, dùng nhiều ram làm gì, STATIC là thượng sách
    
    public static int getAnInteger() {
        int n;
        Scanner sc = new Scanner(System.in); 
        
        do {
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextInt(); để lại rác 
                n = Integer.parseInt(sc.nextLine()); 
                //if chửi ngoài biên
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer?");
            }
        } while(true); 
    }
}
