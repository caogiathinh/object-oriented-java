/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinSo();

    }

    public static void inputProfileXinSo() {
        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //lặp vô tận
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do ku know to input a posoitive number?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("\nHere is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputProfile() {
        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho 1 cơ chế tự xử khi có cà chớn, chuyển quyền giết chóc của mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại, SANDBOX
        try {
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            //lệnh cà chớn nằm đây
        } catch (Exception e) {

            //CPU sẽ chạy đến chỗ này khi có cà chớn xảy ra. 
            //JVM ko giết app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //ko có cà chớn k vào đây
            //e là lá thư/msg màu đỏ JVM gửi cho mình rằng có lỗi cà chớn nè
            //làm gì thì làm
            //EXception e = new Exception(nội dung màu đỏ ở đây là nè...)
            //về lí: e.xem lỗi, xử lí tự mình
            //về toán hóa, mình chỉ tập trung phần xử lí lỗi, biết thừa éo gõ đúng số mình cần 
            //xử lí sao ?? nhiều cách: default value (không hay)
            //                                 hay: bắt nhập lại, member: login/user name
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("\nHere is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
}
