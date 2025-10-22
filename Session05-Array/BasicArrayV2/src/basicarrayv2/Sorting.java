
package basicarrayv2;

/**
 *
 * @author gia.thinh
 */
public class Sorting {
    ///thêm 1 main khác ngoài main ban đầu, main phải mở lên shift + f6
    //f6 đứng main nào cũng được, ưu liên default chạy main() đầu tiên tạo ra
    //có đổi main default dc nếu muốn
    //phải chuột properties /run/.. 
     
    public static void main(String[] args) {
        System.out.println("Ahihi");
        //sortPrimitiveArray();
        sortStudentList();
    }
    
    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHIN", 19, 9), 
                                      new Student("SE5", "NAM", 15, 5),
                                      new Student("SE7", "BAY", 17, 7),
                                      new Student("SE3", "BA", 19, 3),
                                      new Student("SE8", "TAM", 18, 8)
                                     };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = t; 
                }
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void sortPrimitiveArray() {
        int arr[] = new int[]{1000, -1000, 1000, 5, 10, -15, -20}; 
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //i trước j mày đứng trước tao mà lại lớn hơn tao đổi
                    int t = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = t; 
                }
            }
        }

        System.out.println("\nAfter sorting ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
            
}
