[[OOP]]
#INTERFACE #oop 

## Các level trong việc tạo đối tượng OBJECT
0. Tư duy cái Khuôn Class
1. Dùng kế thừa để tạo KHUÔN nhanh hơn
2. TẠO NHIỀU KHUÔN thật nhanh -> KHUÔN TỔ (ABSTRACT)-> nhiều KHUÔN CON 
	- Hình thức phân loại mức cao hơn, phân loại vạn vật trong tự nhiên của loài người.

3. PHÂN LOẠI LỎNG LẺO HƠN, CÁC MÀ CÁC KHUÔN KHÁC NHAU ĐẶC ĐIỂM MÀ VẪN CHƠI CHUNG ĐƯỢC VỚI NHAU - NHÓM LỎNG LẺO HƠN, MIỄN LÀ CHUNG ??? 
## Tập trung vào level 3
- Tập trung vào chung hành vi (is member of )
- HỘI NHÓM LÀ NHỮNG THÀNH VIÊN CÓ CHUNG SỞ THÍCH, CHỈ HƯỚNG **HÀNH ĐỘNG** KHÔNG CARE **NGUỒN GỐC**. 
- **VÍ DỤ**: CLB-ĐI-PHƯỢT, PHƯỢT-THỦ gom những bạn từ khắp nơi, chỉ thích, quan tâm: **ĐI PHƯỢT** bất kể bạn là Student, Worker, Lecture, Freelancer... miễn là sẵn sàng lên đường. BẠN LÀ **MEMBER OF HỘI-PHƯỢT-THỦ**
- IS - A - MEMBER - OF (TẬP TRUNG VÀO HÀNH VI MỤC ĐÍCH) LỎNG LẺO VIỆC KẾT HỢP. 
- KHUÔN NÀY DÍNH KHUÔN KIA MỘT XÍU VỀ HÀNH ĐỘNG ĐỂ CHÚNG CÓ THỂ TƯƠNG TÁC ĐƯỢC VỚI NHAU. TỤ TẬP ĐƯỢC MỘT NHÓM CÙNG HÀNH ĐỘNG. 
====> 2 HÌNH THỨC GOM NHÓM:
- GOM TRÊN ĐẶC ĐIỂM + HÀNH VI - INHERITANCE (HỌ HÀNG BÀ CON)
	- INHERITANCE: TÊN CỦA MỘT DÒNG HỌ
- GOM TRÊN HÀNH VI, TỤ TẬP NHAU LÀM GÌ ĐÓ. - INTERFACE - CHUNG GIAO TIẾP  (HỘI NHÓM) - 
	- INTERFACE: TÊN CỦA 1 HỘI NHÓM ĂN CHƠI HÀNH ĐỘNG.
- **VÍ DỤ:** Bạn là Worker, Student, Lecture, Pupil, ... Employee bạn cần phải cải thiện tiếng Anh. Bạn tham gia vào clb tiếng Anh, bạn dc đòi hỏi chỉ cần Speak English là đủ, kh carre xuất thân từ đâu chỉ cần giao tiếp Tiếng Anh. Workder, Student, Lecture, ... IS A MENBER OF ENGLISH-CLUB => method duy nhất: speakEnglish()
- **VÍ DỤ:** Worker, Student, Lecture, Pupil, ... ra phố Bùi Viện và thuê 1 bình Shisha, cả đám cùng kéo cần - hút Shisha
	- Worker, Student, Lecture, Pupil, ... IS A MEMBER OF SHISHAER.
	- Chúng mình là những gã nghiện ngập Shisha, tham gia hội, phải hút theo cách nào đó. 
- **VÍ DỤ:** Worker, Student, Lecture, Pupil, ...TIẾP TỤC PHÊ SHISHA RỒI, HƯNG PHẤN TAY LÁI, RỦ NHAU ĐI TỐC ĐỘ, LÊN XE ĐUA.. LÊN XE EXCITER, WINNER, RGV, REBEL, CBS,... KÉO TAY GA TĂNG TỐC, chỉ tập trung vào tốc độ. 
	 Worker, Student, Lecture, Pupil, .. IS A MEMBER OF DEATH-RACER
		CLB ĐUA-ĐẾN-CHẾT XUẤT HIỆN VỚI HÀNH ĐỘNG ĐUA GÁC TAY GA, GÁC KIM ĐỒNG HỒ. 
===> Chung hành động chung tiếng nói thì vẫn ở chung được với nhau, gom nhóm theo HÀNH ĐỘNG, **INTERFACE**

tui, CÁC BẠN BÊN YOUTUBE TUI NGỒI CHUNG VỚI NHAU VÌ YÊU THÍCH CODE, KHÔNG CARE VIỆC KHÁC, CHÚNG TA THUỘC CLB YÊU-CODE-ĐẾN-CHẾT --- code()

## TỔNG KẾT

- INTERFACE CŨNG LÀ DẠNG CLASS "CHA", VÌ CLASS LÀ GOM NHÓM VÀ ĐẶT TÊN NHÓM "CHA", NÀY CHỈ CÓ HÀNH ĐỘNG (ABSTRACT KHÔNG CODE, JDK 8, 9 CHO PHÉP CÓ CODE ĐẶC BIỆT), ĐÁM "CON", MEMBER CÓ NHIỆM VỤ TRIỂN KHAI/THI HÀNH HÀNH ĐỘNG CỦA "CHA"
	- INTERFACE LÀ CLB CÓ NỘI QUY CHUNG CHUNG, TỔ CHỨC/HIỆP HỘI CUNG CẤP NHỮNG TIÊU CHUẨN/HƯỚNG DẪN CHUNG CHUNG.
	- NHỮNG HỘI VIÊN/CON PHẢI CÓ NHIỆM VỤ IMPLEMENTS TẤT CẢ.
	-  HIỆP HỘI ĐO LƯỜNG TCVN ĐƯA RA TIÊU CHÍ VỀ AN TOÀN THỰC PHẨM (nồng độ/hàm lượng chất bảo quản trong thực phẩm) Các cơ sở sản xuất căn theo tiêu chuẩn này làm sản phẩm HÀNG VIỆT NAM CLC.
	- INTERFACE BỘ QUY TẮC ỨNG XỬ, CAM KẾT AI ĐÓ PHẢI THEO. 
	- CỤ THỂ LÀM THÌ MỖI CÁ NHÂN HỘI VIÊN PHẢI LO/LÀM.
## ỨNG DỤNG CỦA INTERFACE
- Giúp 1 class/object có nhiều cách hành xử khác nhau, tui là member của Hội nào tôi có cách hành xử của Hội đó, giúp cho 1 object một con người có thể có nhiều vai, vai nào cũng có hành động tương ứng. Chính là 1 "hình dạng" của đa kế thừa - multi inheritance. 
- Trong Java, 1 class Con chỉ có tối đa 1 CHA - đơn kế thừa, extends đúng 1 class Cha, single-Inheritance. C++ nhiều Cha, đa kế thừa.
	Cha1 có hàm f().. có code
	Cha 2: hàm z() .... hàm f() có code
	Cha 3: hàm f()...... có code
	Con kế thừa cả Cha1, Cha2, Cha3 Hỏi Con chấm f() lấy hàm của ai??
		Tang gia bối rối, ambigous, gọi ai bi giờ vì ai cũng có hàm f()
	- Java fix bằng cách con chỉ kế thừa duy nhất 1 Cha. 
		Cha hàm f() có code hay ko ko care, Con kế thừa Chỉ Cha, chấm f() thì ?? Cha có f() thì xài luôn abstract f() thì Con phải code, chấm chạy luôn @. 
	- Nhưng C++ đa kế thừa có quyền bị ảnh hưởng bởi nhiều Cha, mỗi Cha cho tí Hàm
	
	- Nay trong Java con 1 Cha, nhưng lại được quyền tham gia nhiều CLB !! INTERFACE. Con 1 Cha nhưng chơi với nhiều CLB, chơi với CLB nào thì có hoạt động của CLB đó, vẫn đảm bảo tiêu chí Con có nhiều hành động từ bên ngoài, giống như Con có  hành động từ nhiều Cha. 
	Interface/CLB C1 hàm abs... f() không code
				C2 hàm abs ... f() không code
				C3 hàm abs ... f() không code
	- Con extends Cha như bình thường, implements/tham gia CLB C1, C2, C3
			Con ơi mày phải có code ngay f(), chỉ duy nhất hàm f() của Con có code. 
			--> không còn bối rối f() vì chỉ có duy nhất một phiên bản CODE F(). 
	
	**Câu hỏi:** tại sao trong java không có đa kế thừa một class kế thừa nhiều class Cha, mà các class Cha có hàm trùng tên với nhau f() class con sẽ không biết thực thi hàm nào của class Cha nào. Nhưng java lại có thêm khái niệm về Interface một class Con có thể thuộc nhiều Interface khác nhau vẫn đảm bảo được tính đa dạng và vì Interface chứa các hàm abstract nên việc trùng nhau là bình thường, các class Con có thể implement theo cách riêng của Class Con đó. -> không gây sự bối rối ambugous. 
	

- CODE VIẾT SAO ?? 
	```
	public class Con/Hội Viên implements CLB1, CLB2, CLB3 {
			@Override tất cả hành động của Cha nếu Cha là abstract class
			@Overrde tất cả các hành động của các CLB, tham gia nhiều thì phải hoạt động nhiều. 
			
		}
	```
	- Con đóng N vai: vai dòng họ, vai CLB


	- CLB ko có đặc điểm, không có phễu constructor - nhưng có hàm Abstract. Khi new Con thì CLB vẫn sẽ được new để "Ba" sẽ là cánh chim đưa Con extends @Override Member/Con vẫn có 1 vùn RAM của CLB - chứa hàm abstract, con trỏ vẫn trỏ lưng chừng CLB vẫn @Override vì Con có hàm trùng tên Cha và có code tự làm. Vẫn theo mô hình ra của abstract class/Cha truyền thống. Con to hơn Cha/CLB về vùng RAM. super() Cha CLB là super() ngầm. 

