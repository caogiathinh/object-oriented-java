# Hướng Dẫn Kỹ Thuật: Lưu Trữ & Xử Lý Dữ Liệu Trong OOP

## 1. Khái Niệm Cơ Bản

### 1.1. Object và Vùng Nhớ RAM
Trong lập trình hướng đối tượng, việc tạo object giống như việc mua một món đồ thực tế:

- **Thực tế**: Mua điện thoại → Có món đồ vật lý với đặc điểm (màu sắc, giá tiền) và chức năng (gọi, chụp ảnh)
- **Lập trình**: `new Phone()` → Tạo vùng RAM chứa dữ liệu (thuộc tính) và hành động (phương thức)

**Nguyên tắc quan trọng**: Muốn sử dụng object, bắt buộc phải `new` để cấp phát vùng nhớ.

```java
// Tạo object trong RAM
Phone myPhone = new Phone();
Dog myDog = new Dog();
```

### 1.2. Encapsulation và Abstraction
Mỗi object đóng gói:
- **Dữ liệu** (attributes/properties)
- **Hành động** (methods/functions)

Ví dụ:
- Tivi thường: Chỉ có chức năng xem truyền hình
- Smart TV: Có thêm chức năng duyệt web, xem YouTube

```java
// Smart TV có nhiều chức năng hơn
SmartTV tv = new SmartTV();
tv.watchCableTV();
tv.browseWeb();
tv.playYouTube();
```

## 2. Cấu Trúc Lưu Trữ Nhiều Object

### 2.1. Khái Niệm "Thùng Chứa" (Container)
Để quản lý nhiều object, ta cần các cấu trúc dữ liệu (thùng chứa):
- **Túi, giỏ, thùng, tủ** trong đời thực
- **Array, ArrayList, HashSet, HashMap** trong lập trình

**Quy trình chung**:
1. **Tạo thùng chứa**: `new Container()`
2. **Thêm object vào**: `container.add(new Object())`

```java
// Ví dụ: Tủ chứa đồ
Cabinet cabinet = new Cabinet();           // Bước 1: Mua tủ
cabinet.addItem(new Book());              // Bước 2: Thêm sách vào tủ
cabinet.addItem(new Clothes());           // Thêm quần áo vào tủ
```

### 2.2. Cơ Chế Lưu Trữ: Tham Chiếu vs Giá Trị
**Lưu ý quan trọng**: Thùng chứa object thường lưu **tham chiếu** (địa chỉ), không phải object thật.

**Ví dụ minh họa**:
- **Tủ hồ sơ bệnh nhân**: Chứa danh sách địa chỉ, bệnh nhân nằm ở phòng điều trị
- **Danh sách sinh viên**: Giáo viên giữ danh sách, sinh viên ở quê nhà
- **Google Meet**: Lưu danh sách người tham gia, người thật ở nhà riêng

```java
// Object thật nằm trong HEAP
// Container chỉ lưu địa chỉ tham chiếu
Student[] classList = new Student[50];
classList[0] = new Student("Nguyen Van A");  // Lưu địa chỉ của object Student
```

## 3. Loại 1: Array - Mảng Tĩnh (Kích Thước Cố Định)

### 3.1. Đặc Điểm
- **Kích thước cố định**: Phải khai báo trước số lượng phần tử
- **Truy cập trực tiếp**: Sử dụng chỉ số `[i]`
- **Ví dụ thực tế**: Rạp chiếu phim 100 ghế, xe bus 16 chỗ ngồi

### 3.2. Cú Pháp Khai Báo

```java
// Khai báo mảng với kích thước cố định
DataType[] arrayName = new DataType[size];

// Ví dụ cụ thể
Student[] students = new Student[100];     // 100 chỗ cho sinh viên
Dog[] dogs = new Dog[10];                  // 10 chỗ cho chó
int[] numbers = new int[50];               // 50 số nguyên
```

### 3.3. Thêm Phần Tử Vào Mảng

```java
// Tạo mảng
Student[] students = new Student[100];

// Thêm phần tử tại vị trí cụ thể
students[0] = new Student("Nguyen Van A", 20);
students[1] = new Student("Tran Thi B", 21);
students[2] = new Student("Le Van C", 19);

// Truy cập phần tử
System.out.println(students[0].getName());  // Output: Nguyen Van A
```

### 3.4. Ưu và Nhược Điểm

**Ưu điểm**:
- Truy cập nhanh theo chỉ số O(1)
- Đơn giản, dễ hiểu
- Hiệu suất cao với dữ liệu primitive

**Nhược điểm**:
- Kích thước cố định, không linh hoạt
- Lãng phí bộ nhớ nếu không sử dụng hết
- Phải biết trước số lượng phần tử

## 4. Loại 2: Collection Framework - Thùng Chứa Động (Co Giãn)

### 4.1. Đặc Điểm Chung
- **Kích thước linh hoạt**: Tự động mở rộng khi thêm phần tử
- **Không truy cập trực tiếp qua `[i]`**: Sử dụng phương thức của class
- **Ví dụ thực tế**: Nồi cơm Thạch Sanh, giếng nước không đáy

### 4.2. Ba Nhóm Collection Chính

#### A. Nhóm List (Danh Sách Có Thứ Tự)
**ArrayList, Vector, LinkedList**

**Đặc điểm**:
- Có thứ tự và cho phép trùng lặp
- Truy cập theo chỉ số (nhưng qua phương thức)

```java
// ArrayList - Phổ biến nhất
ArrayList<Student> students = new ArrayList<>();

// Thêm phần tử
students.add(new Student("Nguyen Van A", 20));
students.add(new Student("Tran Thi B", 21));
students.add(new Student("Le Van C", 19));

// Truy cập phần tử
Student firstStudent = students.get(0);

// Số lượng phần tử
int size = students.size();

// Xóa phần tử
students.remove(0);

// Duyệt qua các phần tử
for (Student s : students) {
    System.out.println(s.getName());
}
```

**So sánh ArrayList vs Vector**:
- **ArrayList**: Không thread-safe, nhanh hơn
- **Vector**: Thread-safe, chậm hơn do synchronization

#### B. Nhóm Set (Tập Hợp Không Trùng)
**HashSet, TreeSet, LinkedHashSet**

**Đặc điểm**:
- Không cho phép phần tử trùng lặp
- Không đảm bảo thứ tự (trừ TreeSet và LinkedHashSet)

```java
// HashSet - Không thứ tự, nhanh nhất
HashSet<String> emails = new HashSet<>();
emails.add("student1@email.com");
emails.add("student2@email.com");
emails.add("student1@email.com");  // Bị bỏ qua vì trùng

// TreeSet - Tự động sắp xếp
TreeSet<Integer> scores = new TreeSet<>();
scores.add(85);
scores.add(92);
scores.add(78);
// Tự động sắp xếp: 78, 85, 92

// Kiểm tra tồn tại
boolean exists = emails.contains("student1@email.com");

// Duyệt phần tử
for (String email : emails) {
    System.out.println(email);
}
```

#### C. Nhóm Map (Cặp Khóa-Giá Trị)
**HashMap, TreeMap, LinkedHashMap**

**Đặc điểm**:
- Lưu trữ theo cặp key-value
- Key không trùng lặp, value có thể trùng

```java
// HashMap - Tra cứu nhanh
HashMap<String, Student> studentMap = new HashMap<>();

// Thêm phần tử (key-value)
studentMap.put("SV001", new Student("Nguyen Van A", 20));
studentMap.put("SV002", new Student("Tran Thi B", 21));
studentMap.put("SV003", new Student("Le Van C", 19));

// Lấy giá trị theo key
Student student = studentMap.get("SV001");

// Kiểm tra key tồn tại
boolean hasKey = studentMap.containsKey("SV001");

// Kiểm tra value tồn tại
boolean hasValue = studentMap.containsValue(student);

// Duyệt qua các cặp
for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
    System.out.println("Key: " + entry.getKey());
    System.out.println("Value: " + entry.getValue().getName());
}
```

### 4.3. So Sánh Các Loại Collection

| Loại | Thứ Tự | Trùng Lặp | Tốc Độ Truy Cập | Sử Dụng Khi |
|------|---------|-----------|-----------------|-------------|
| **ArrayList** | Có | Có | O(1) theo index | Cần truy cập nhanh, ít thêm/xóa |
| **LinkedList** | Có | Có | O(n) | Thêm/xóa nhiều ở đầu/cuối |
| **HashSet** | Không | Không | O(1) | Kiểm tra tồn tại nhanh |
| **TreeSet** | Có (sắp xếp) | Không | O(log n) | Cần dữ liệu sắp xếp |
| **HashMap** | Không | Key không, Value có | O(1) | Tra cứu theo key |
| **TreeMap** | Có (theo key) | Key không, Value có | O(log n) | Map có thứ tự |

## 5. Ví Dụ Thực Tế Tổng Hợp

### 5.1. Quản Lý Danh Sách Sinh Viên

```java
public class StudentManagement {
    public static void main(String[] args) {
        // Cách 1: Dùng Array (kích thước cố định)
        Student[] arrayStudents = new Student[100];
        arrayStudents[0] = new Student("SV001", "Nguyen Van A", 8.5);
        arrayStudents[1] = new Student("SV002", "Tran Thi B", 9.0);
        
        // Cách 2: Dùng ArrayList (linh hoạt)
        ArrayList<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("SV001", "Nguyen Van A", 8.5));
        listStudents.add(new Student("SV002", "Tran Thi B", 9.0));
        listStudents.add(new Student("SV003", "Le Van C", 7.5));
        
        // Cách 3: Dùng HashMap (tra cứu nhanh theo mã SV)
        HashMap<String, Student> mapStudents = new HashMap<>();
        mapStudents.put("SV001", new Student("SV001", "Nguyen Van A", 8.5));
        mapStudents.put("SV002", new Student("SV002", "Tran Thi B", 9.0));
        
        // Tra cứu sinh viên theo mã
        Student s = mapStudents.get("SV001");
        System.out.println("Tìm thấy: " + s.getName());
    }
}
```

### 5.2. Quản Lý Sản Phẩm Trong Cửa Hàng

```java
public class StoreManagement {
    private ArrayList<Product> products;
    private HashMap<String, Product> productMap;
    private HashSet<String> categories;
    
    public StoreManagement() {
        products = new ArrayList<>();
        productMap = new HashMap<>();
        categories = new HashSet<>();
    }
    
    // Thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);                          // Lưu vào list
        productMap.put(product.getId(), product);       // Lưu vào map
        categories.add(product.getCategory());          // Lưu danh mục
    }
    
    // Tìm sản phẩm theo ID (nhanh)
    public Product findById(String id) {
        return productMap.get(id);
    }
    
    // Lấy tất cả danh mục (không trùng)
    public HashSet<String> getAllCategories() {
        return categories;
    }
    
    // Lấy sản phẩm theo thứ tự
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
```

## 6. Best Practices

### 6.1. Khi Nào Dùng Array
- Biết chính xác số lượng phần tử
- Cần hiệu suất cao nhất
- Làm việc với primitive types (int, double, char...)

### 6.2. Khi Nào Dùng ArrayList
- Không biết trước số lượng phần tử
- Cần thêm/xóa phần tử linh hoạt
- Cần duy trì thứ tự

### 6.3. Khi Nào Dùng HashSet
- Cần đảm bảo không trùng lặp
- Kiểm tra sự tồn tại nhanh
- Không quan tâm thứ tự

### 6.4. Khi Nào Dùng HashMap
- Cần tra cứu nhanh theo key
- Dữ liệu dạng cặp (ID - Object)
- Cần ánh xạ 1-1

## 7. Lưu Ý Quan Trọng

### 7.1. Về Generic Types
```java
// Luôn khai báo kiểu dữ liệu cụ thể
ArrayList<Student> students = new ArrayList<>();  // ✅ Tốt
ArrayList students = new ArrayList();             // ❌ Tránh (raw type)
```

### 7.2. Về Memory Management
- Array cấp phát bộ nhớ liên tục
- ArrayList cấp phát bộ nhớ động, có thể resize
- HashMap sử dụng hash table, chiếm nhiều bộ nhớ hơn

### 7.3. Về Thread Safety
- ArrayList, HashMap: Không thread-safe
- Vector, Hashtable: Thread-safe nhưng chậm
- Dùng Collections.synchronizedList() khi cần thread-safe

```java
List<Student> syncList = Collections.synchronizedList(new ArrayList<>());
```

## 8. Tổng Kết

| Yêu Cầu | Giải Pháp Khuyến Nghị |
|---------|----------------------|
| Kích thước cố định, truy cập nhanh | **Array** |
| Danh sách linh hoạt, có thứ tự | **ArrayList** |
| Không trùng lặp | **HashSet** |
| Không trùng lặp + sắp xếp | **TreeSet** |
| Tra cứu theo khóa | **HashMap** |
| Tra cứu theo khóa + sắp xếp | **TreeMap** |

**Nguyên tắc vàng**: Chọn cấu trúc dữ liệu phù hợp với nghiệp vụ cụ thể để tối ưu hiệu suất và dễ bảo trì code.