# TÀI LIỆU HƯỚNG DẪN: 4 TRỤ CỘT CỦA LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG (OOP)

## MỤC LỤC
1. [Abstraction - Trừu tượng hóa](#1-abstraction)
2. [Encapsulation - Đóng gói](#2-encapsulation)
3. [Inheritance - Kế thừa](#3-inheritance)
4. [Polymorphism - Đa hình](#4-polymorphism)
5. [SOLID Principles](#5-solid-principles)
6. [Anti-Patterns cần tránh](#6-anti-patterns-cần-tránh)
7. [Bài tập thực hành](#7-bài-tập-thực-hành)

---

## 1. ABSTRACTION - TRỪU TƯỢNG HÓA MỌI VẬT

### 📌 Định nghĩa
> **Abstraction là tư duy chuyển đổi những thứ phức tạp trong cuộc sống thành những thứ đơn giản hơn nhưng vẫn giữ nguyên ý nghĩa ban đầu.**

### 🎯 Bản chất
- **USING A SIMPLE THINGS TO REPRESENT THE COMPLEX THINGS**
- **EXTRACT THE SIGNIFICANT FEATURES/CHARACTERISTICS OF A COMPLEX THINGS TO FORM A SIMPLE/EASY CATCHING THINGS WITHOUT LOSING THE ORIGINAL MEANING**

### 💡 Cách hiểu đơn giản
- Lấy ra những thông tin **QUAN TRỌNG NHẤT**, **TIÊU BIỂU NHẤT** của một object phức tạp
- Biểu diễn lại một thứ phức tạp ngoài đời để dễ hiểu hơn
- Một thứ phức tạp được biểu diễn qua thứ đơn giản nhưng **KHÔNG LÀM MẤT CHẤT**
- Giống như **KỂ LẠI CÂU CHUYỆN** trong trí não cho người khác nghe và họ hiểu được

### 📖 Ví dụ thực tế

#### Ví dụ 1: Sinh viên
**Sinh viên ngoài đời (phức tạp):**
- Tên, tuổi, địa chỉ thường trú, tạm trú
- Lịch sử chích vaccine, lịch trình di chuyển
- Gia cảnh, ba mẹ, sở thích
- Chuyên ngành học, học kỳ, tình trạng học
- Deadline, điểm thi các môn
- Mối quan hệ xã hội
- ... và vô số thông tin khác

**Sinh viên trong hệ thống trường (đơn giản hóa):**
```java
class SinhVien {
    String maSV;          // ID
    String email;         // Email trường
    String hoTen;         // Họ tên
    String diaChi;        // Địa chỉ
    String soDienThoai;   // Phone
    String chuyenNganh;   // Chuyên ngành
    double[] diemMonHoc;  // Điểm các môn
}
```
➡️ **Chỉ giữ lại những info QUAN TRỌNG để quản lý, bỏ đi những info không cần thiết**

#### Ví dụ 2: Bệnh nhân
**Bệnh nhân đơn giản hóa:**
```java
class BenhNhan {
    String maBN;              // Mã bệnh nhân
    String hoTen;             // Họ tên
    String[] diUng;           // Dị ứng
    String[] lichSuKham;      // Lịch sử khám
    String[] donThuoc;        // Đơn thuốc
}
```

### ⚠️ Lưu ý quan trọng
**ĐỪNG NHẦM LẪN ABSTRACTION VỚI ABSTRACT CLASS!**
- **Abstraction** = Tư duy, cách suy nghĩ
- **Abstract Class** = Công cụ, kỹ thuật lập trình

---

## 2. ENCAPSULATION - ĐÓNG GÓI (Hệ quả của Abstraction)

### 📌 Định nghĩa
> **Encapsulation là việc gom info (biến) và xử lý (hàm) vào trong 1 đơn vị (object/class), che giấu và show ra khi cần thiết.**

### 🎯 Bản chất
- **Hàm (xử lý data) + Biến (data) = GOM VÀO 1 ĐƠN VỊ (object/class)**
- **Giấu/che đi bằng `private`**
- **Show ra nếu muốn bằng `public`, `protected`**
- **TẠO CLASS ĐÓNG GÓI MỌI THỨ: ĐẶC ĐIỂM + HÀNH VI, CHE VÀ KHÔNG CHE**

### 💡 Cách hiểu đơn giản
Giống như **VIÊN THUỐC CON NHỘNG**:
- Vỏ ngoài = nhựa sinh học (bạn thấy được)
- Bột thuốc bên trong = che giấu (không thấy được)
- Khi uống vào, vặn tách ra mới thấy bột thuốc
- **ENCAPSULATE = GÓI LẠI, CHE GIẤU, CÓ THỂ TRONG SUỐT NẾU MUỐN**

### 📖 Ví dụ thực tế

#### Ví dụ 1: TIVI
```
┌─────────────────────────────────────┐
│  📺 TIVI (Vỏ nhựa đen/xanh/bạc)    │ ← Public Interface
│  ───────────────────────────────    │
│  🔘 Nút nguồn                       │ ← Public
│  🔘 Remote control                  │ ← Public
│  ───────────────────────────────    │
│  ⚙️  Mạch xử lý                     │ ← Private (che giấu)
│  📡 Bộ thu sóng WiFi                │ ← Private (che giấu)
│  🔌 Bo mạch điện                    │ ← Private (che giấu)
└─────────────────────────────────────┘
```
**→ Người dùng CHỈ tương tác qua remote/nút bấm, KHÔNG thấy bên trong xử lý ra sao**

#### Ví dụ 2: ATM
```
┌─────────────────────────────────────┐
│  💳 MÁY ATM                         │
│  ───────────────────────────────    │
│  🔢 Bàn phím nhập PIN               │ ← Public
│  🖥️  Màn hình hiển thị              │ ← Public
│  🔘 Nút chọn số tiền                │ ← Public
│  ───────────────────────────────    │
│  💰 Khay tiền                       │ ← Private (không thấy)
│  🔒 Cơ chế hút tiền                 │ ← Private (không thấy)
│  🗄️  Két sắt chứa tiền              │ ← Private (không thấy)
└─────────────────────────────────────┘
```
**→ ĐÓNG GÓI cho việc RÚT TIỀN, không làm việc khác**

#### Ví dụ 3: XE MÁY
```
┌─────────────────────────────────────┐
│  🏍️  XE MÁY                         │
│  ───────────────────────────────    │
│  🔑 Khóa xe                         │ ← Public
│  🎮 Tay ga                          │ ← Public
│  🔘 Nút khởi động                   │ ← Public
│  🛑 Phanh                           │ ← Public
│  ───────────────────────────────    │
│  ⚙️  Động cơ                        │ ← Private (che bằng bửng xe)
│  🔧 Dây điện                        │ ← Private (che bằng dàn mủ)
│  🔩 Khung xương                     │ ← Private (che kín)
└─────────────────────────────────────┘
```

### 📝 Code minh họa
```java
class ATM {
    // PRIVATE - Che giấu
    private double soDuTaiKhoan;
    private int soTienTrongKho;
    
    // PRIVATE - Xử lý bên trong
    private boolean kiemTraPIN(String pin) {
        // Logic kiểm tra PIN
        return true;
    }
    
    private void capNhatSoDu(double soTien) {
        this.soDuTaiKhoan -= soTien;
    }
    
    // PUBLIC - Giao diện người dùng tương tác
    public void rutTien(String pin, double soTien) {
        if (kiemTraPIN(pin)) {
            capNhatSoDu(soTien);
            System.out.println("Rút tiền thành công!");
        }
    }
    
    public double xemSoDu(String pin) {
        if (kiemTraPIN(pin)) {
            return soDuTaiKhoan;
        }
        return 0;
    }
}
```

### 🔑 Điểm khác biệt
| **Abstraction** | **Encapsulation** |
|----------------|-------------------|
| LẤY RA ĐẶC TRƯNG | GÓI TRỌN VẸN ĐÚNG THỨ CẦN LÀM |
| Tư duy chọn lọc info | Tạo class với instance variable + method() |

---

## 3. INHERITANCE - KẾ THỪA (Tái sử dụng code)

### 📌 Định nghĩa
> **Inheritance là việc tái sử dụng lại code mà không phải làm lại code, thậm chí không cần copy-paste.**

### 🎯 Bản chất
- **RE-USE lại code** đã làm tốt việc của nó
- **Con kế thừa di sản/tài sản/di truyền/sự thông minh từ ba má**
- **Tăng tốc quá trình viết code** khi muốn mở rộng khả năng của object mới

### 💡 Cách hiểu đơn giản
**TĂNG TỐC LÀM ĂN:**
- Ba má giàu có, có tiền → Mình thuận lợi trong việc có vốn làm ăn
- Ba má cho căn nhà → Mình đỡ lo tiền trọ, chỉ lo tiền ăn
- Ba má cho vốn → Ta làm giàu nhanh hơn, không áp lực trả nợ
- **KẾT QUẢ:** Bật nhanh hơn, hội nhập nhanh hơn, join cuộc sống nhanh hơn

**TRONG LẬP TRÌNH:**
- Có thư viện viết code rồi → Làm app viết code nhanh hơn
- Không làm lại từ đầu
- Có thư viện → Mở rộng thư viện cho nhu cầu riêng
- **ĐA DẠNG SỬ DỤNG, TĂNG TỐC VIẾT CODE**

### 📊 Các dạng kế thừa

#### Dạng 1: Cha cụ thể → Con cụ thể
```java
class DongVat {
    String ten;
    int tuoi;
    
    void an() {
        System.out.println("Đang ăn");
    }
}

class Cho extends DongVat {
    void sua() {
        System.out.println("Gâu gâu!");
    }
}
```

#### Dạng 2: Cha trừu tượng → Con cụ thể
```java
abstract class Hinh {
    abstract double tinhDienTich();
}

class HinhTron extends Hinh {
    double banKinh;
    
    @Override
    double tinhDienTich() {
        return 3.14 * banKinh * banKinh;
    }
}

class HinhVuong extends Hinh {
    double canh;
    
    @Override
    double tinhDienTich() {
        return canh * canh;
    }
}
```

### 📖 Ví dụ thực tế: Thư viện Java
```java
// ArrayList KẾ THỪA từ AbstractList
// Không cần viết lại tất cả, chỉ viết thêm/sửa những gì cần

ArrayList<String> list = new ArrayList<>();
list.add("Java");      // Dùng luôn method có sẵn
list.size();           // Dùng luôn method có sẵn
list.get(0);           // Dùng luôn method có sẵn
```

### 💎 Giá trị cốt lõi
**ABSTRACT CLASS = CÁCH GOM, PHÂN LOẠI ĐỐI TƯỢNG MỨC CAO THẤP**
- Giống như phân loại sự vật ngoài đời
- Gom nhóm nhưng tận dụng kế thừa
- Sử dụng nguyên tắc **ABSTRACTION + ENCAPSULATION**

---

## 4. POLYMORPHISM - ĐA HÌNH (Một ra nhiều)

### 📌 Định nghĩa
> **Polymorphism là khả năng từ 1 hành động có thể được thực hiện bằng N cách khác nhau.**

### 🎯 Bản chất
- **MỘT RA NHIỀU** (One to Many)
- **ĐA DẠNG CÁCH THỰC HIỆN** (Multiple Implementations)
- Từ 1 hàm Cha, có N Con @Override
- **Gọi Cha mà Con chạy**

### 💡 Cách hiểu qua lịch sử

#### Ví dụ 1: Mùa đông 1946 - Bác Hồ kêu gọi toàn quốc kháng chiến
```
Bác Hồ: "Toàn quốc CHIẾN()!"
         ↓
    ┌────┼────┬────┬────┬────┐
    ↓    ↓    ↓    ↓    ↓    ↓
   Súng Dao Kiếm Móc Chông Đuốc
                câu
```

**→ AI CÓ GÌ DÙNG NẤY:**
- Ai có súng dùng súng
- Ai có dao dùng dao
- Ai có móc câu dùng móc câu
- **ĐA DẠNG CÁCH THỰC HIỆN** từ 1 lệnh CHIẾN()

#### Ví dụ 2: Các Vua Hùng
```
"Các Vua Hùng đã có công dựng nước"
Bác Cháu ta phải: GIUNUOC()
         ↓
    ┌────┼────┬────┬────┐
    ↓    ↓    ↓    ↓    ↓
  Học  Làm  Bảo  Đoàn  Tình
  giỏi việc vệ  kết  nguyện
       tốt  đất       
```

**→ Mỗi người có CÁCH GIỮ NƯỚC khác nhau nhưng cùng MỤC ĐÍCH**

#### Ví dụ 3: Đại ca giang hồ
```
Đại ca: "Tối nay giang hồ chợ lớn, đi CHIEN() nhá!"
              ↓
    ┌─────────┼─────────┬─────────┐
    ↓         ↓         ↓         ↓
  Mã tấu    Dao       Côn      Kiếm
```

### 📝 Code minh họa

#### Ví dụ 1: Override Method
```java
abstract class DongVat {
    String ten;
    
    // Method CHA - Trừu tượng
    abstract void keuGoi();
}

class Cho extends DongVat {
    @Override
    void keuGoi() {
        System.out.println("Gâu gâu!");
    }
}

class Meo extends DongVat {
    @Override
    void keuGoi() {
        System.out.println("Meo meo!");
    }
}

class Bo extends DongVat {
    @Override
    void keuGoi() {
        System.out.println("Ummm ummm!");
    }
}

// SỬ DỤNG
public class Main {
    public static void main(String[] args) {
        DongVat[] danhSach = {
            new Cho(),
            new Meo(), 
            new Bo()
        };
        
        // GỌI CHA MÀ CON CHẠY
        for (DongVat dv : danhSach) {
            dv.keuGoi();  // Mỗi con kêu khác nhau
        }
        // Output:
        // Gâu gâu!
        // Meo meo!
        // Ummm ummm!
    }
}
```

#### Ví dụ 2: Interface (Đa kế thừa)
```java
interface ChienDau {
    void chien();
}

class ChienBinhSung implements ChienDau {
    @Override
    public void chien() {
        System.out.println("Bắn súng: PEW PEW!");
    }
}

class ChienBinhDao implements ChienDau {
    @Override
    public void chien() {
        System.out.println("Chém dao: CHÁT CHÁT!");
    }
}

class ChienBinhMocCau implements ChienDau {
    @Override
    public void chien() {
        System.out.println("Đánh móc câu: VUNG VUNG!");
    }
}

// Đại ca kêu gọi
public class DaiCa {
    public static void goiDanEm(ChienDau[] danEm) {
        System.out.println("Đại ca: Tối nay CHIẾN()!");
        for (ChienDau em : danEm) {
            em.chien();  // Mỗi đàn em chiến khác nhau
        }
    }
    
    public static void main(String[] args) {
        ChienDau[] toDoiChienBinh = {
            new ChienBinhSung(),
            new ChienBinhDao(),
            new ChienBinhMocCau()
        };
        
        goiDanEm(toDoiChienBinh);
        // Output:
        // Đại ca: Tối nay CHIẾN()!
        // Bắn súng: PEW PEW!
        // Chém dao: CHÁT CHÁT!
        // Đánh móc câu: VUNG VUNG!
    }
}
```

### 🎭 Các dạng Polymorphism

#### 1. Compile-time Polymorphism (Method Overloading)
```java
class TinhToan {
    // Cùng tên method, khác tham số
    int cong(int a, int b) {
        return a + b;
    }
    
    double cong(double a, double b) {
        return a + b;
    }
    
    int cong(int a, int b, int c) {
        return a + b + c;
    }
}
```

#### 2. Runtime Polymorphism (Method Overriding)
```java
class Hinh {
    void ve() {
        System.out.println("Vẽ hình");
    }
}

class HinhTron extends Hinh {
    @Override
    void ve() {
        System.out.println("Vẽ hình tròn");
    }
}

class HinhVuong extends Hinh {
    @Override
    void ve() {
        System.out.println("Vẽ hình vuông");
    }
}

// Polymorphism in action
Hinh h1 = new HinhTron();   // Gọi Cha
h1.ve();                     // Con chạy: "Vẽ hình tròn"

Hinh h2 = new HinhVuong();  // Gọi Cha
h2.ve();                     // Con chạy: "Vẽ hình vuông"
```

### 🔑 Ý nghĩa cốt lõi
**TỪ 1 HÀNH ĐỘNG CHA → N CÁCH THỰC HIỆN CON**
- Đa dạng cách implements hành động
- Đa dạng cách thực thi
- Đa sắc thái, đa nhân cách
- **TRANSFORMER - BIẾN HÌNH**

---

## 5. SOLID PRINCIPLES (NGUYÊN TẮC NÂNG CAO)

### 📌 Giới thiệu
**SOLID** là 5 nguyên tắc thiết kế OOP giúp code:
- Dễ đọc, dễ hiểu
- Dễ bảo trì, mở rộng
- Giảm bug, tăng tính linh hoạt

### 🔤 S - Single Responsibility Principle (SRP)
> **MỘT CLASS CHỈ NÊN CÓ MỘT LÝ DO DUY NHẤT ĐỂ THAY ĐỔI**

#### 💡 Giải thích bằng đời thường
- **Người bán hàng** chỉ lo bán hàng, không lo kế toán, không lo giao hàng
- **Người lái xe** chỉ lo lái xe, không lo sửa xe, không lo rửa xe
- **MỖI NGƯỜI MỘT VIỆC, LÀM TỐT VIỆC ĐÓ**

#### ❌ SAI - Vi phạm SRP
```java
class NhanVien {
    String ten;
    double luong;
    
    // Tính lương - Việc 1
    void tinhLuong() {
        System.out.println("Tính lương...");
    }
    
    // Lưu database - Việc 2
    void luuDatabase() {
        System.out.println("Lưu vào DB...");
    }
    
    // Gửi email - Việc 3
    void guiEmail() {
        System.out.println("Gửi email...");
    }
}
```
**Vấn đề:** 1 class làm 3 việc → Sửa 1 việc ảnh hưởng các việc khác

#### ✅ ĐÚNG - Tuân thủ SRP
```java
// Mỗi class một nhiệm vụ
class NhanVien {
    String ten;
    double luong;
}

class TinhLuongService {
    void tinhLuong(NhanVien nv) {
        System.out.println("Tính lương cho " + nv.ten);
    }
}

class DatabaseService {
    void luu(NhanVien nv) {
        System.out.println("Lưu vào DB...");
    }
}

class EmailService {
    void guiEmail(NhanVien nv) {
        System.out.println("Gửi email cho " + nv.ten);
    }
}
```

---

### 🔤 O - Open/Closed Principle (OCP)
> **MỞ CHO MỞ RỘNG, ĐÓNG CHO SỬA ĐỔI**

#### 💡 Giải thích bằng đời thường
- **Điện thoại** có sẵn cổng sạc, tai nghe → MỞ cho mở rộng (cắm thêm phụ kiện)
- Không cần **PHÁ VỠ** điện thoại để thêm tính năng → ĐÓNG cho sửa đổi
- **THÊM TÍNH NĂNG MÀ KHÔNG PHÁ CODE CŨ**

#### ❌ SAI - Vi phạm OCP
```java
class TinhTien {
    double tinhGia(String loaiKhach, double giaGoc) {
        if (loaiKhach.equals("VIP")) {
            return giaGoc * 0.8; // Giảm 20%
        } else if (loaiKhach.equals("Member")) {
            return giaGoc * 0.9; // Giảm 10%
        } else {
            return giaGoc;
        }
        // Thêm loại khách mới → Phải SỬA code này
    }
}
```

#### ✅ ĐÚNG - Tuân thủ OCP
```java
// Dùng Polymorphism
abstract class KhachHang {
    abstract double tinhGia(double giaGoc);
}

class KhachVIP extends KhachHang {
    @Override
    double tinhGia(double giaGoc) {
        return giaGoc * 0.8;
    }
}

class KhachMember extends KhachHang {
    @Override
    double tinhGia(double giaGoc) {
        return giaGoc * 0.9;
    }
}

class KhachThuong extends KhachHang {
    @Override
    double tinhGia(double giaGoc) {
        return giaGoc;
    }
}

// Thêm loại mới → CHỈ TẠO CLASS MỚI, KHÔNG SỬA CODE CŨ
class KhachDiamond extends KhachHang {
    @Override
    double tinhGia(double giaGoc) {
        return giaGoc * 0.7;
    }
}
```

---

### 🔤 L - Liskov Substitution Principle (LSP)
> **CON PHẢI THAY THẾ ĐƯỢC CHA MÀ KHÔNG PHÁ VỠ CHƯƠNG TRÌNH**

#### 💡 Giải thích bằng đời thường
- **Thợ điện** bảo anh dùng **bóng đèn LED** thay **bóng đèn sợi đốt**
- Cắm vào → Vẫn sáng bình thường
- **KHÔNG QUAN TÂM LOẠI BÓNG, MIỄN SÁNG LÀ ĐƯỢC**

#### ❌ SAI - Vi phạm LSP
```java
class HinhChuNhat {
    protected int rong;
    protected int cao;
    
    void setRong(int rong) {
        this.rong = rong;
    }
    
    void setCao(int cao) {
        this.cao = cao;
    }
    
    int tinhDienTich() {
        return rong * cao;
    }
}

class HinhVuong extends HinhChuNhat {
    @Override
    void setRong(int rong) {
        this.rong = rong;
        this.cao = rong; // Vuông phải bằng nhau
    }
    
    @Override
    void setCao(int cao) {
        this.rong = cao;
        this.cao = cao; // Vuông phải bằng nhau
    }
}

// Vấn đề:
HinhChuNhat h = new HinhVuong();
h.setRong(5);
h.setCao(10);
System.out.println(h.tinhDienTich()); // Mong đợi 50, thực tế 100
// THAY THẾ CON VÀO CHA → KẾT QUẢ SAI!
```

#### ✅ ĐÚNG - Tuân thủ LSP
```java
interface Hinh {
    int tinhDienTich();
}

class HinhChuNhat implements Hinh {
    private int rong;
    private int cao;
    
    HinhChuNhat(int rong, int cao) {
        this.rong = rong;
        this.cao = cao;
    }
    
    @Override
    public int tinhDienTich() {
        return rong * cao;
    }
}

class HinhVuong implements Hinh {
    private int canh;
    
    HinhVuong(int canh) {
        this.canh = canh;
    }
    
    @Override
    public int tinhDienTich() {
        return canh * canh;
    }
}
```

---

### 🔤 I - Interface Segregation Principle (ISP)
> **KHÔNG ÉP CLASS IMPLEMENT NHỮNG METHOD KHÔNG DÙNG TỚI**

#### 💡 Giải thích bằng đời thường
- **Nhà hàng** có thực đơn buffet và thực đơn món ăn riêng lẻ
- Không bắt khách ăn buffet phải gọi món, không bắt khách gọi món phải lấy buffet
- **CHO KHÁCH QUYỀN CHỌN, KHÔNG ÉP DÙNG THỨ KHÔNG CẦN**

#### ❌ SAI - Vi phạm ISP
```java
interface Worker {
    void code();
    void test();
    void design();
    void quanLy();
}

// Developer không cần quản lý
class Developer implements Worker {
    @Override
    public void code() {
        System.out.println("Viết code");
    }
    
    @Override
    public void test() {
        System.out.println("Test code");
    }
    
    @Override
    public void design() {
        // Không làm việc này nhưng BẮT BUỘC phải implement
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void quanLy() {
        // Không làm việc này nhưng BẮT BUỘC phải implement
        throw new UnsupportedOperationException();
    }
}
```

#### ✅ ĐÚNG - Tuân thủ ISP
```java
// Chia nhỏ interface
interface Coder {
    void code();
}

interface Tester {
    void test();
}

interface Designer {
    void design();
}

interface Manager {
    void quanLy();
}

// Developer chỉ implement những gì cần
class Developer implements Coder, Tester {
    @Override
    public void code() {
        System.out.println("Viết code");
    }
    
    @Override
    public void test() {
        System.out.println("Test code");
    }
}

// Manager chỉ implement những gì cần
class ProjectManager implements Manager {
    @Override
    public void quanLy() {
        System.out.println("Quản lý dự án");
    }
}

// Full-stack làm được nhiều việc
class FullStackDev implements Coder, Tester, Designer {
    @Override
    public void code() {
        System.out.println("Code full-stack");
    }
    
    @Override
    public void test() {
        System.out.println("Test ứng dụng");
    }
    
    @Override
    public void design() {
        System.out.println("Thiết kế UI/UX");
    }
}
```

---

### 🔤 D - Dependency Inversion Principle (DIP)
> **PHỤ THUỘC VÀO ABSTRACTION, KHÔNG PHỤ THUỘC VÀO IMPLEMENTATION CỤ THỂ**

#### 💡 Giải thích bằng đời thường
- **Ổ điện** là chuẩn (abstraction)
- **Tivi, tủ lạnh, quạt** đều cắm vào ổ điện được (implementation)
- Ổ điện không quan tâm thiết bị gì, miễn đúng chuẩn
- **QUAN HỆ QUA CHUẨN CHUNG, KHÔNG QUAN HỆ TRỰC TIẾP**

#### ❌ SAI - Vi phạm DIP
```java
// Class phụ thuộc trực tiếp vào class cụ thể
class MySQL {
    void connect() {
        System.out.println("Kết nối MySQL");
    }
}

class UserService {
    private MySQL database; // Phụ thuộc cứng vào MySQL
    
    UserService() {
        this.database = new MySQL();
    }
    
    void getUser() {
        database.connect();
        // Lấy user...
    }
}

// Vấn đề: Muốn đổi sang PostgreSQL → Phải SỬA code UserService
```

#### ✅ ĐÚNG - Tuân thủ DIP
```java
// Tạo abstraction (interface)
interface Database {
    void connect();
}

// Các implementation cụ thể
class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("Kết nối MySQL");
    }
}

class PostgreSQL implements Database {
    @Override
    public void connect() {
        System.out.println("Kết nối PostgreSQL");
    }
}

class MongoDB implements Database {
    @Override
    public void connect() {
        System.out.println("Kết nối MongoDB");
    }
}

// UserService phụ thuộc vào INTERFACE, không phụ thuộc vào class cụ thể
class UserService {
    private Database database; // Phụ thuộc vào abstraction
    
    // Inject qua constructor
    UserService(Database database) {
        this.database = database;
    }
    
    void getUser() {
        database.connect();
        // Lấy user...
    }
}

// Sử dụng - Dễ dàng thay đổi database
public class Main {
    public static void main(String[] args) {
        // Dùng MySQL
        UserService service1 = new UserService(new MySQL());
        service1.getUser();
        
        // Chuyển sang PostgreSQL - KHÔNG SỬA UserService
        UserService service2 = new UserService(new PostgreSQL());
        service2.getUser();
        
        // Chuyển sang MongoDB - KHÔNG SỬA UserService
        UserService service3 = new UserService(new MongoDB());
        service3.getUser();
    }
}
```

---

### 📊 Tóm tắt SOLID

| **Nguyên tắc** | **Ý nghĩa ngắn gọn** | **Ví dụ đời thường** |
|----------------|---------------------|---------------------|
| **S** - SRP | 1 class = 1 nhiệm vụ | Người bán hàng chỉ lo bán, không lo kế toán |
| **O** - OCP | Mở rộng được, không sửa code cũ | Điện thoại cắm thêm phụ kiện, không phá máy |
| **L** - LSP | Con thay thế Cha không lỗi | Đèn LED thay đèn sợi đốt vẫn sáng |
| **I** - ISP | Không bắt implement thừa | Không bắt khách buffet phải gọi món |
| **D** - DIP | Phụ thuộc vào chuẩn chung | Ổ điện là chuẩn, thiết bị nào cũng cắm được |

---

## 6. ANTI-PATTERNS CẦN TRÁNH

### 🚫 Anti-Pattern là gì?
**Anti-Pattern** = Cách làm SAI phổ biến, trông có vẻ đúng nhưng gây hại về lâu dài.

---

### ❌ 1. GOD OBJECT (Class Thần Thánh)

#### 📌 Mô tả
Một class làm **TẤT CẢ MỌI VIỆC**, biết quá nhiều, làm quá nhiều.

#### 🔴 Ví dụ sai
```java
class HeThong {
    // Quản lý user
    void themUser() {}
    void xoaUser() {}
    void suaUser() {}
    
    // Quản lý sản phẩm
    void themSanPham() {}
    void xoaSanPham() {}
    
    // Quản lý đơn hàng
    void taoGonHang() {}
    void huyDonHang() {}
    
    // Gửi email
    void guiEmail() {}
    
    // Kết nối database
    void connectDB() {}
    
    // In báo cáo
    void inBaoCao() {}
    
    // ... 100 methods khác
}
```

#### ⚠️ Vấn đề
- Code dài hàng nghìn dòng
- Khó đọc, khó hiểu
- Sửa 1 chỗ ảnh hưởng toàn bộ
- Không thể test riêng từng phần

#### ✅ Giải pháp: Tách nhỏ class theo SRP
```java
class UserService {
    void themUser() {}
    void xoaUser() {}
    void suaUser() {}
}

class ProductService {
    void themSanPham() {}
    void xoaSanPham() {}
}

class OrderService {
    void taoDonHang() {}
    void huyDonHang() {}
}

class EmailService {
    void guiEmail() {}
}
```

---

### ❌ 2. SPAGHETTI CODE (Code Mì Ý)

#### 📌 Mô tả
Code rối như mớ mì, logic nhảy lung tung, khó theo dõi.

#### 🔴 Ví dụ sai
```java
void xuLyDonHang(DonHang dh) {
    if (dh.trangThai == 1) {
        if (dh.soTien > 1000) {
            if (dh.khachHang.loai == "VIP") {
                // Logic phức tạp
                for (SanPham sp : dh.danhSach) {
                    if (sp.ton > 0) {
                        if (sp.giamGia > 0) {
                            // Tính toán phức tạp
                            if (dh.khachHang.diem > 100) {
                                // Lại thêm logic
                            }
                        }
                    }
                }
            }
        }
    }
    // ... 200 dòng if lồng nhau
}
```

#### ⚠️ Vấn đề
- If lồng nhau nhiều tầng
- Không biết logic đang ở đâu
- Debug khó khăn
- Sửa code dễ gây lỗi

#### ✅ Giải pháp: Tách hàm nhỏ, đặt tên rõ ràng
```java
void xuLyDonHang(DonHang dh) {
    if (!kiemTraDonHangHopLe(dh)) return;
    
    double tongTien = tinhTongTien(dh);
    double giamGia = tinhGiamGia(dh);
    double thanhToan = tongTien - giamGia;
    
    capNhatTonKho(dh);
    luuDonHang(dh);
    guiEmailXacNhan(dh);
}

boolean kiemTraDonHangHopLe(DonHang dh) {
    return dh.trangThai == 1 && dh.soTien > 0;
}

double tinhTongTien(DonHang dh) {
    // Logic rõ ràng
    return dh.danhSach.stream()
        .mapToDouble(sp -> sp.gia * sp.soLuong)
        .sum();
}
```

---

### ❌ 3. COPY-PASTE CODE (Code Trùng Lặp)

#### 📌 Mô tả
Copy code từ chỗ này sang chỗ khác thay vì tái sử dụng.

#### 🔴 Ví dụ sai
```java
class TinhToanA {
    double tinhGiamGia(double gia) {
        if (gia > 1000) {
            return gia * 0.1;
        }
        return 0;
    }
}

class TinhToanB {
    double tinhGiamGia(double gia) {
        if (gia > 1000) {
            return gia * 0.1;
        }
        return 0;
    }
}

class TinhToanC {
    double tinhGiamGia(double gia) {
        if (gia > 1000) {
            return gia * 0.1;
        }
        return 0;
    }
}
```

#### ⚠️ Vấn đề
- Sửa logic → Phải sửa ở 3 chỗ
- Dễ quên sửa → Gây bug
- Code dài vô ích

#### ✅ Giải pháp: DRY (Don't Repeat Yourself)
```java
class GiamGiaService {
    static double tinhGiamGia(double gia) {
        if (gia > 1000) {
            return gia * 0.1;
        }
        return 0;
    }
}

// Các class khác dùng chung
class TinhToanA {
    double tinhGia(double gia) {
        return gia - GiamGiaService.tinhGiamGia(gia);
    }
}
```

---

### ❌ 4. MAGIC NUMBERS (Số Ma Thuật)

#### 📌 Mô tả
Dùng số trực tiếp trong code mà không giải thích.

#### 🔴 Ví dụ sai
```java
void tinhLuong(NhanVien nv) {
    if (nv.loai == 1) {
        nv.luong = nv.luongCoBan * 1.5;
    } else if (nv.loai == 2) {
        nv.luong = nv.luongCoBan * 2.0;
    } else if (nv.loai == 3) {
        nv.luong = nv.luongCoBan * 2.5;
    }
    
    if (nv.soNgayLam > 22) {
        nv.thuong = 500000;
    }
}
// 1, 2, 3, 1.5, 2.0, 22, 500000 là gì?
```

#### ⚠️ Vấn đề
- Không hiểu số có nghĩa gì
- Sửa đổi khó khăn
- Dễ nhầm lẫn

#### ✅ Giải pháp: Dùng hằng số có tên rõ ràng
```java
class LoaiNhanVien {
    static final int NHAN_VIEN_THUONG = 1;
    static final int TRUONG_PHONG = 2;
    static final int GIAM_DOC = 3;
}

class HeSoLuong {
    static final double NHAN_VIEN_THUONG = 1.5;
    static final double TRUONG_PHONG = 2.0;
    static final double GIAM_DOC = 2.5;
}

static final int SO_NGAY_CHUAN = 22;
static final double THUONG_FULL_ATTENDANCE = 500000;

void tinhLuong(NhanVien nv) {
    if (nv.loai == LoaiNhanVien.NHAN_VIEN_THUONG) {
        nv.luong = nv.luongCoBan * HeSoLuong.NHAN_VIEN_THUONG;
    } else if (nv.loai == LoaiNhanVien.TRUONG_PHONG) {
        nv.luong = nv.luongCoBan * HeSoLuong.TRUONG_PHONG;
    } else if (nv.loai == LoaiNhanVien.GIAM_DOC) {
        nv.luong = nv.luongCoBan * HeSoLuong.GIAM_DOC;
    }
    
    if (nv.soNgayLam > SO_NGAY_CHUAN) {
        nv.thuong = THUONG_FULL_ATTENDANCE;
    }
}
```

---

### ❌ 5. INAPPROPRIATE INTIMACY (Thân mật không đúng chỗ)

#### 📌 Mô tả
Class A biết quá nhiều về nội bộ class B, truy cập trực tiếp vào bên trong.

#### 🔴 Ví dụ sai
```java
class KhachHang {
    public double soDu; // Public - Ai cũng sửa được
}

class DonHang {
    void thanhToan(KhachHang kh, double soTien) {
        // Truy cập trực tiếp vào soDu
        kh.soDu -= soTien; // Nguy hiểm!
    }
}

// Ở chỗ khác
kh.soDu = -1000000; // Có thể làm sai!
```

#### ⚠️ Vấn đề
- Vi phạm Encapsulation
- Dữ liệu không an toàn
- Khó kiểm soát thay đổi

#### ✅ Giải pháp: Dùng getter/setter, che giấu implementation
```java
class KhachHang {
    private double soDu; // Private
    
    public double getSoDu() {
        return soDu;
    }
    
    public boolean truTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            return true;
        }
        return false;
    }
    
    public void congTien(double soTien) {
        soDu += soTien;
    }
}

class DonHang {
    void thanhToan(KhachHang kh, double soTien) {
        if (kh.truTien(soTien)) {
            System.out.println("Thanh toán thành công");
        } else {
            System.out.println("Số dư không đủ");
        }
    }
}
```

---

### 📊 Tóm tắt Anti-Patterns

| **Anti-Pattern** | **Vấn đề** | **Giải pháp** |
|------------------|-----------|--------------|
| **God Object** | 1 class làm tất cả | Tách nhỏ theo SRP |
| **Spaghetti Code** | If lồng nhau, rối rắm | Tách hàm nhỏ, logic rõ ràng |
| **Copy-Paste Code** | Code trùng lặp | DRY - Don't Repeat Yourself |
| **Magic Numbers** | Số không rõ nghĩa | Dùng hằng số có tên |
| **Inappropriate Intimacy** | Truy cập trực tiếp nội bộ | Encapsulation, getter/setter |

---

## 7. BÀI TẬP THỰC HÀNH

### 🎯 Bài 1: Hệ thống quản lý thư viện

**Yêu cầu:**
1. Tạo class `Sach` với các thuộc tính: mã sách, tên, tác giả, năm xuất bản, số lượng
2. Tạo class `DocGia` với các thuộc tính: mã độc giả, tên, email, số sách đang mượn
3. Tạo class `PhieuMuon` để quản lý việc mượn/trả sách
4. Áp dụng 4 trụ cột OOP

**Gợi ý:**
- Abstraction: Chọn thuộc tính quan trọng nhất
- Encapsulation: Dùng private/public hợp lý
- Inheritance: Tạo các loại sách khác nhau (SachGiaoKhoa, SachThamKhao...)
- Polymorphism: Override method `hienThiThongTin()`

---

### 🎯 Bài 2: Hệ thống thanh toán đa hình

**Yêu cầu:**
1. Tạo interface `ThanhToan` với method `thanhToan(double soTien)`
2. Implement các class: `ThanhToanTienMat`, `ThanhToanTheATM`, `ThanhToanMomo`, `ThanhToanVNPay`
3. Tạo class `DonHang` sử dụng Polymorphism để thanh toán

**Code khởi đầu:**
```java
interface ThanhToan {
    boolean thanhToan(double soTien);
    String layTenPhuongThuc();
}

class DonHang {
    private double tongTien;
    private ThanhToan phuongThucThanhToan;
    
    // Constructor, getter, setter
    
    void xuLyThanhToan() {
        // TODO: Implement
    }
}
```

---

### 🎯 Bài 3: Áp dụng SOLID - Hệ thống gửi thông báo

**Yêu cầu:**
1. Tạo hệ thống gửi thông báo qua Email, SMS, Push Notification
2. Áp dụng DIP: Class `NotificationService` không phụ thuộc vào implementation cụ thể
3. Áp dụng OCP: Dễ dàng thêm phương thức gửi mới (Telegram, Zalo...)
4. Áp dụng ISP: Không bắt buộc implement method không cần thiết

**Code khởi đầu:**
```java
interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO: Implement gửi email
    }
}

// TODO: Implement SMSNotification, PushNotification

class NotificationService {
    private Notification notification;
    
    public NotificationService(Notification notification) {
        this.notification = notification;
    }
    
    public void guiThongBao(String message) {
        notification.send(message);
    }
}
```

---

### 🎯 Bài 4: Sửa Anti-Pattern

**Cho code sau (vi phạm nhiều nguyên tắc):**
```java
class QuanLy {
    void xuLy(String loai, double gia, int soLuong) {
        if (loai.equals("A")) {
            if (gia > 1000) {
                double giam = gia * 0.1;
                double tong = (gia - giam) * soLuong;
                System.out.println("Tổng: " + tong);
            } else {
                double tong = gia * soLuong;
                System.out.println("Tổng: " + tong);
            }
        } else if (loai.equals("B")) {
            if (gia > 2000) {
                double giam = gia * 0.15;
                double tong = (gia - giam) * soLuong;
                System.out.println("Tổng: " + tong);
            } else {
                double tong = gia * soLuong;
                System.out.println("Tổng: " + tong);
            }
        }
    }
}
```

**Nhiệm vụ:** Refactor code trên để:
1. Tuân thủ SRP
2. Loại bỏ code trùng lặp
3. Loại bỏ magic string/number
4. Áp dụng Polymorphism

---

### 🎯 Bài 5: Thiết kế hệ thống hoàn chỉnh

**Đề bài:** Thiết kế hệ thống quản lý cửa hàng bán điện thoại

**Yêu cầu chức năng:**
- Quản lý sản phẩm (điện thoại, phụ kiện)
- Quản lý khách hàng (thường, VIP, Diamond)
- Quản lý đơn hàng
- Tính giá có giảm giá theo loại khách hàng
- Thanh toán đa hình (tiền mặt, thẻ, ví điện tử)
- Xuất hóa đơn

**Yêu cầu kỹ thuật:**
1. Áp dụng đầy đủ 4 trụ cột OOP
2. Tuân thủ 5 nguyên tắc SOLID
3. Tránh các Anti-Patterns
4. Có class diagram (vẽ tay cũng được)

**Gợi ý cấu trúc:**
```
- SanPham (abstract)
  - DienThoai
  - PhuKien
- KhachHang (abstract)
  - KhachThuong
  - KhachVIP
  - KhachDiamond
- DonHang
- ThanhToan (interface)
  - ThanhToanTienMat
  - ThanhToanThe
  - ThanhToanViDienTu
- HoaDon
- CuaHangService
```

---

## 📊 TỔNG KẾT 4 TRỤ CỘT OOP

| **Trụ cột** | **Bản chất** | **Ví dụ đời thực** | **Trong code** |
|-------------|--------------|-------------------|----------------|
| **Abstraction** | Rút gọn phức tạp thành đơn giản | Sinh viên có N info → Chỉ lấy vài info quan trọng | Tạo class với các thuộc tính cốt lõi |
| **Encapsulation** | Gom + Che giấu | Tivi che mạch điện, chỉ show nút bấm | Dùng private/public |
| **Inheritance** | Tái sử dụng code | Con thừa hưởng tài sản ba má | extends, implements |
| **Polymorphism** | Một ra nhiều | Bác Hồ kêu CHIẾN() → N cách đánh | @Override, Overload |

---

## 🎯 MỐI QUAN HỆ GIỮA 4 TRỤ CỘT

```
ABSTRACTION (Tư duy rút gọn)
        ↓
ENCAPSULATION (Đóng gói class)
        ↓
INHERITANCE (Tái sử dụng)
        ↓
POLYMORPHISM (Đa dạng hóa)
```

**Giải thích:**
1. **Trước tiên** phải biết **TRỪU TƯỢNG HÓA** → Chọn info quan trọng
2. **Sau đó** phải **ĐÓNG GÓI** → Tạo class, che giấu, show ra
3. **Tiếp theo** có thể **KẾ THỪA** → Tái sử dụng class đã có
4. **Cuối cùng** đạt được **ĐA HÌNH** → N cách thực hiện từ 1 hành động

---

## 💡 LỜI KẾT

**4 TRỤ CỘT OOP** không phải 4 thứ riêng biệt mà là **1 CHU TRÌNH HOÀN CHỈNH**:
- Bắt đầu từ **TƯ DUY** (Abstraction)
- Chuyển thành **HÀNH ĐỘNG** (Encapsulation)
- **TÁI SỬ DỤNG** hiệu quả (Inheritance)
- Tạo ra **SỰ ĐA DẠNG** (Polymorphism)

**Nhớ:** OOP không chỉ là cú pháp, mà là **CÁCH TƯ DUY** để giải quyết vấn đề!

### 🚀 Lộ trình học tiếp
1. ✅ Nắm vững 4 trụ cột OOP
2. ✅ Hiểu và áp dụng SOLID
3. ✅ Tránh Anti-Patterns
4. 📚 Học Design Patterns (23 mẫu thiết kế cổ điển)
5. 🏗️ Thực hành dự án thực tế
6. 🧪 Test-Driven Development (TDD)
7. 🏛️ Clean Architecture

**Chúc bạn học tốt! 💪**