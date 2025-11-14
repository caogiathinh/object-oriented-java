
package data;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class Cabinet {
    //tủ sẽ có nhiều ngăn chứa được nhiều món đồ. ta xài mảng ArrayList, Collection 
    //để lưu nhiều đồ 
    //từ từ các bạn sv đến nhập học, nộp hồ sơ, và ta cất vào tủ arr

    private List<Student> arr = new ArrayList();

    //làm biếng làm phễu luôn, mọi thứ sẽ là default, tủ từ từ được add() vô
    //mình không chơi trò mua Tủ có sẵn luôn 1 cái Túi, trong túi có sẵn hồ sơ
    //nếu muốn làm, thì new sẵn túi bên ngoài, có sẵn sv đưa vào trong tủ, okie.

    private Scanner sc = new Scanner(System.in);


    //default constructor. ko làm gì cả
    public Cabinet() {
    }

    //hành động của cái Tủ là: thêm hồ sơ, tìm hồ sơ, sắp xếp hồ sơ, xóa hồ sơ, udpate hồ sơ
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");

        //dùng lại hàm search ĐỂ KIỂM TRA COI ID HỒ SƠ SINH VIÊN LIỆU RẰNG CÓ CHƯA
        //CẤM TRÙNG ID, database gọi là primary key - cấm trùng khóa chính
        //tương đương đăng kí member, login name, account name chửi trùng éo cho đi tiếp

        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase(); //cắt trăng dư. đổi qua HOA
            Student xxx = searchAStudent(id); //id vừa gỗ kiểm tra liền
            if (xxx == null) //id éo tồn tại trong giỏ, thoát, đi tiếp
                break;
            else
                System.out.println("Duplicated id. Try with another one!!!");
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added sucessfully");
    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    //ta làm cái Hàm tìm kiếm sinh viên với 2 mục đích
    // 1. Phực vụ tính năng tìm 1 sv theo id
    // 2. Phục vụ thêm cho cái việc kiểm tra id có trùng hay không khi tạo mới hồ sơ  mới
    //      1 hồ sơ mới
    //hàm search có 2 cách trả về: trả về vị trí tìm thấy trong túi/int position
    //                             trả về 1 object/tọa độ của object/tham chiếu
    public Student searchAStudent(String id) {
        if (arr.isEmpty())
            return null;

        for (Student x : arr)
            if (x.getId().equalsIgnoreCase(id))
                return x;  //nếu thấy sinh viên trả ngay về thẻ thứ i tham chiếu vùng new có chứa id tìm thấy

        return null;
    }

    //hàm bao hàm search ở trên
    public void searchAStudent() {
        String keyword;
        System.out.print("Input id to search: ");
        keyword = sc.nextLine().trim().toUpperCase();
        Student xxx = searchAStudent(keyword);
        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else {
            System.out.println("FOUND. Here she/he is");
            xxx.showProfile();
        }
    }

    public int searchAStudentById(String id) {
        if (arr.isEmpty())
            return -1;
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return i;
        return -1;
    }

    public void removeAStudent() {
        String id;

        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to remove");
            return;
        }

        System.out.print("Input id student you want to remove: ");
        id = sc.nextLine().trim().toUpperCase();

        Student xxx =  searchAStudent(id);

        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else {
            System.out.println("FOUND. Here she/he is");
            xxx.showProfile();

            int xPosition = searchAStudentById(id);
            arr.remove(xPosition);
            System.out.println("The student has been removed");

            System.out.println("The student list after removing");
            printStudentList();
        }
    }

    public void updateAStudent(Student x, double newGpa) {
        x.setGpa(newGpa);
    }

    public void updateAStudent(String id, double newGpa) {
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND!!! Nothing to update");
            return;
        }
        //xxx.setGpa(newGpa);
        updateAStudent(xxx, newGpa);
    }

    public void updateAStudent() {
        String keyword;
        double newGpa = 0;

        System.out.print("Input id you want to update info: ");
        keyword = sc.nextLine().trim().toUpperCase();
        Student xxx = searchAStudent(keyword);

        if (xxx == null)
            System.out.println("NOT FOUND!! Nothing to update");
        else {
            System.out.print("Input a new gpa of student: ");
            newGpa = Double.parseDouble(sc.nextLine());

            updateAStudent(xxx, newGpa);

            System.out.println("FOUND. Here she/he is after updating new gpa");
            xxx.showProfile();
        }
    }

//    public void updateAStudent() {
//        String keyword;
//        double newGpa = 0;
//        System.out.print("Input id you want to update info: ");
//        keyword = sc.nextLine().trim().toUpperCase();
//        Student xxx = searchAStudent(keyword);
//        if (xxx == null)
//            System.out.println("NOT FOUND!! Nothing to update");
//        else {
//            System.out.println("FOUND. Here she/he is before updating");
//            xxx.showProfile();
//
//            System.out.print("Input a new gpa of student: ");
//            newGpa = Double.parseDouble(sc.nextLine());
//            xxx.setGpa(newGpa); //set lại gpa
//
//            System.out.println("FOUND. Here she/he is after updating new gpa");
//            xxx.showProfile();
//        }
//    }
}
