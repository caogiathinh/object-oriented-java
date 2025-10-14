package thinh.util;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
//khuôn chứa đặc điểm, hành động 
//hàm xài chung
//library - chứa các hàm/biến dùng chung cho các công việc khác nhau
public class MyToys {

    public static final double PI = 3.1415;
    //final ~ const - HẰNG SỐ 
    //đẩy Scanner ra ngoài xài chung cho tất cả các hàm
    private static Scanner sc = new Scanner(System.in); //để tránh trùng lại, nhưng private dùng nội bộ bên trong

    public static int getAInteger(String inputMsg) {
        int n; //biến trung gian, hứng từ bàn phím gõ gì ?? 

        //Scanner sc = new Scanner(System.in); //khai báo đối tượng sc

        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                //kiểm tra nhập ngoài biên
                return n;

            } catch (Exception e) {
                System.out.println("Do ku know input an integer??");

            }
        } while (true);
    }
    
    //trong quá trình làm app, việc nhập số gặp lại nhiều lần. 
    //mỗi cú nhập, biến nhập , kèm thêm trôi lệnh, cà chớn try-catch - do while 
    //tách việc nhập số nguyên thành 1 hàm gói việc chửi bới, trôi lệnh, nhập lại một chỗ 
    //static để cung cấp dịch vụ cho object khác. 
    public static int getAInteger() {
        int n; //biến trung gian

        Scanner sc = new Scanner(System.in); //khai báo đối tượng sc

        do {
            try {
                System.out.print("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                //kiểm tra nhập ngoài biên
                return n;

            } catch (Exception e) {
                System.out.println("Do ku know input an integer??");

            }
        } while (true);
    }
    
    
    
    

}
