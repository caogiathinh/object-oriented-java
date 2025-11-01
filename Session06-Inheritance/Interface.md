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

