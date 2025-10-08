[[OOP]]

## Bài tập Hàm 
```

package ws1;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */

public class WS1 {

    public static void main(String[] args) {
//        int n;
//        
//        System.out.println("Input a positive number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        
//        if(isPrime(n))
//            System.out.println(n + " is prime number");
//        else
//            System.out.println(n + " isn't prime number");
//        printPrimeList();
//        print1000FirstPrimes();
        int a, b; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input positive integer a: ");
        a = sc.nextInt();
        System.out.print("Input positive integer b: ");
        b = sc.nextInt();
        
        solve(a, b);
        
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) 
            return false; 
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
    public static void printPrimeList() {
        System.out.println("The list of primes from 1...1000");
        for(int i = 1; i <= 1000; i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
       
    public static void print1000FirstPrimes() {
        int count = 0, i = 1;
        //sử dụng lại hàm isPrime()
        while(count <= 1000) {
            if(isPrime(i)) { 
                System.out.println(i);
                count++;
            }
            i++; 
        }
    }     

    public static void solve(int a, int b) {
        if(a == 0) 
            if(b == 0)
                System.out.println("Underdetermined");
            else
                System.out.println("inconsistent");
        else
            System.out.println("Have a unique solution: " + (-b/(double)a));
    }
}
```
## I. Giá trị phức tạp - object/composite/complex value

| Tên gọi              | Giá trị - Object                                                                                                                                  |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| sếp, sky             | {<br>tên             = "Nguyễn Thanh Tùng"<br>nghệDanh = Sơn tùng MTP<br>yob            = 1994<br>bàiHat        = Chúng ta của hiện tại.....<br>} |
| miDu                 | {<br>tên             = "Đặng Thị Mỹ Dung"<br>nghệDanh = Midu<br>yob            = 1989<br>phim          = Thiên mệnh anh hùng.....<br>}            |
| mình/ta/tao/tui/this | {<br>tên             = "Hoàng Ngọc Trinh"<br>nghệDanh = giáo làng<br>yob            = 2001<br>môn           = Đa cấp dám thành công.....<br>}     |
Object là: gôm n value phức tạp, là 1 thực thể, thứ gì đó, thing mà có những đặc điểm, hành vi. 
							là những thứ ta có thể đếm, sờ, phân biệt được			

## II.  Class - phân nhóm
- Nhóm/Phân nhóm/Phân loại/Group/Class(classify): tên gọi chung cho 1 nhóm các Object theo tiêu chí nào đó.
	- Tiêu chí diễn: Diễn Viên -> class DienVien
	- Tiêu chí hát: Ca Sĩ -> class CaSi
	- Học Sinh
	- Sinh Viên
	- Tội Phạm
## III. Làm sao lưu trữ, quản lí thông tin, xử lí các đối tượng này ??
--->>> **Nhân bản/đúc/construct đối tượng.** 
- Khuôn Đúc/Mold/Blueprint/Prototype/Template/Form
- thing/object/instance - vật thể/đối tượng/thể hiện/hiện thân/phiên bản/nhân bản/bức tượng từ Khuôn. 
1. Khuôn (kèm phễu)
2. Đúc - tạo vật thể / object - construct()
3. Xem sản phẩm - getInfo()
4. Chỉnh sửa - setInfo()
## IV. OOP
- Giống y chang kĩ thuật đúc tượng, muốn làm object nào, ta tạo Khuôn cho nhóm Object đó/class. 
- **Ví dụ**: khuôn đúc ra cúp gọi là Class Cup, khuôn CaSi lưu được info các CaSi -> class Singer. 
	 Từ object tạo khuôn, sau này đúc trở lại các Object.
	![[Pasted image 20251008102912.png]]
## V. Code
Class Dog lưu bên trong package data 
- Package: giống như nơi chứa cái khuôn. 
- DogManagement.java: giống như sảnh chính trình bày mọi thứ.
```
package data;

/**
 *
 * @author gia.thinh
 */
//khuôn dùng để đút ra các object, đối tượng cần lưu trữ info, thứ
//làm ra để bán
//khuôn phải kín, có phễu để rót/hứng/đỏ vào cái data, nguyên liệu
public class Dog {
    //chứa các đặc điểm chi tiết mà cái Khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thế
    private String name;
    private int yob; 
    private double weight; 
    
    //có Khuôn thì phải có phễu/miệng để hứng vật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String iName, int iYob, double iWeight) {
        name = iName; 
        yob = iYob; 
        weight = iWeight; 
    }
}

//code bên ngoài giống như cái khuôn bị lủng

```
---
## Tóm tắt
Lập trình viên hay nghệ nhân chế tác: hoàn toàn giống nhau. Từ thực thể ngoài đời cần lưu những thông tin gì ? -> phân loại theo từng nhóm đối tượng -> tạo khuôn mẫu cho từng nhóm đối tượng -> đúc hoàn loạt các đối tượng