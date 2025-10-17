[[OOP]]
- Chơi với Object (ôn lại cách tạo khuôn, new object)
- Chơi với Array Object 
	- Phân biệt new ngoặc vuông (array) hay new ngoặc tròn (new mới đối tượng) 
	- Các đối tượng trong array không trỏ đến vùng new (chưa có thông tin) thì biến đó sẽ tham chiếu tới cuối RAM (vùng null) -> nếu . tới sẽ bị Null Pointer Exception.
	- Câu chuyện length, cần có count để tránh null pointer khi duyệt hết mảng khi chưa new hết giá trị. 
## Code 
```
public static void playWithStudentArray() {
        //lưu hồ sơ sinh viên cả lớp
        //10 biến + 10 tên tắt + 10 value phức tạp ~ 10 nhát new()
        //lưu 10 só tự nhiên 
        //10 biến/tên tắt + 10 value đơn

        int arr[] = new int[10];

        //Student s1, s2, s3, s4, .... s12, s13; //LẺ
        //      x[0] x[1] x[2] x[3] 
        //      s1. ra gì ra public của s1 (propertise + method) 
        //      x[0]. ra public.
        Student list[] = new Student[3]; //đừng nhằm lẫn khi new, 2 loại ngoặc
        //() gọi phễu tạo object
        //[] tao cần nhiều biến đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt                                 
        list[0] = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        list[1] = new Student("SE123457", "BINH LE", 2000, 5.7);
        list[2] = new Student("SE123458", "CUONG VO", 1999, 5.8);

        list[0].showProfile();
        list[1].showProfile();
        //mấy biến Student chưa gáng mang giá trị gì ?? 
        //list[3] .. list[9] ?? 0 là DEFAULT
        //                      TRỎ VÀO ĐỊA CHỈ 0 CỦA RAM, ĐỊA CHỈ CỦA RAM
        //                      BYTE ĐẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ OFF OFF OFFF
        //tức là byte đầu tiên của ram chứa toàn số 0 
        //byte NULL BYTE KHÔNG CÓ GÌ CẢ, TOÀN 0, 
        //IN MẢNG CÁI COI 
        System.out.println("The list of students");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chỉ là 1 biến sinh viên thôi mà
        }
        
        //s1 = null; //tao trỏ xuống đáy ram, null hen, làm biếng new, 
        
        //s1.showProfile(); //không có để show, NullPointerException
                
        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE TỚI ĐÂU, FOR TỚI ĐÓ, KHÔNG FOR ĐẾN LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
         
    }

    public static void playWithStudentObject() {
        Student x;
        x = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        x.showProfile();
    }
```