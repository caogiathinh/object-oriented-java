[[OOP]]
TRAI BAO - WRAPPER CLASS
## MỌI THỨ TRONG CODE JAVA PHẢI LÀ OBJECT
- Hiện nay trong Java có 2 loại data type: PRIMITIVE vs. OBJECT
	- **PRIMITIVE:** byte, sort, int, long, float, double, char, boolean 8 kiểu dữ liệu nguyên thủy
		- int yob = 2003; //tốn đúng 1 vùng ram 4 ON/OFF TRANS để ra số 2003
	- **OBJECT:** kiểu đối tượng, trông nó phức tạp hơn, ko chỉ lả value lấy ra xài luôn. Tốn 2 vùng RAM, 1 con trỏ/1 biến object = new, lưu tọa độ vùng new (một loạt value khác).
		- **Ví dụ;:** Scanner, Math, String, Dog, Cat, Racer, Cabinet, Shelf, StringTokenizer, File, FileInputStream, ..  bên trong từa lưa các thông tin + hàm.
- TÌM CÁCH BIẾN JAVA THUẦN 100% OBJECT
- Số 1, 2, 3, -5, 10            int
	- Mô tả/đặc điểm
		- Giá trị/đại lượng: 1, 2, .. 
		- nguyên con, trọn vẹn không lẻ miếng nào về giá trị. 
	- Mô tả hành động
		- 1 < 2
		- 3 > 0
		- so sánh các đại lượng của nhau.
- Hóa ra đám ở trên nó có chung đặc điểm là không lẻ miếng nào, mang giá trị còn so sánh lẫn nhau -> CHÚNG THUỘC NHÓM Integer
- Class Integer xuất hiện/Nhóm những thằng không lẻ miếng nào !!  7 đối tượng trên thuộc Nhóm/Class Interger xuất hiện để bao cái value int lại thành Object
- Integer sẽ bao cái int lại, thành 1 object. Mọi thứ trong Java là Object.
```java
public class Integer {
	private int value; 
	
	public Integer(int value) {
		this.value = value;
	}
	
	//get, set
	
	public static int parseInt(String num) {
		//biến chuỗi thành số để đem xài
	}
}
int yob = Integer.parseInt(sc.nextLine());
//khi thiết kê collection framework các loại túi chỉ chơi với OBJECT
List<Integer> arr = new ArrayList(); 
List<int>     arr = new ArrayList(); //đéo cho, bố chỉ đựng object/con trỏ , int vào tao éo chịu
//Giỏ tao chỉ đựng con trỏ/object, in vào tao éo chịu 

```
- Số 0.1, 3.14, 9.8, 10%    float/double
- Tư duy hướng đối tượng: phàm NHỮNG THỨ QUANH TA MÀ **GOM NHÓM ĐƯỢC,** ĐẶT TÊN CHUNG CHO NHÓM ĐƯỢC THÌ SẼ XUẤT HIỆN **NHÓM/KHUÔN/CLASS/PHÂN LOẠI**
- XÀI INTEGER THÌ SAO, CỰC KÌ LINH HOẠT, CÓ NHỀU CÁCH
- CÂN NHẮC KHI XÀI INTEGER, KHI NÀO ĐÒI HỎI OBJECT THÌ MỚI DÙNG, VÌ TỐN RAM. KHÔNG ĐẶC BIỆT GÌ CẢ int cho tiết kiệm ram, nhanh.
```java
int yob = 2003;
Integer yob = new Integer(2003);
Integer yob = 2003; //new ngầm, vẫn new nhưng không viêt ra.
//boxing, đóng hộp thằng PRIMITIVE/LITERAL
int a = yob; //thì sao, 1 thằng là con trỏ, 1 thằng primitive
		     //mở vủng ram bự INTEGER RA, lôi đúng value int ra xài
		     //UNBOXING
```

