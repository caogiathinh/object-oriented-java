[[OOP]]
## Cuộc đua kì thú 
Cuộc đua giữa các ứng viên: 
- Dog
- Cat
- Hamster
Thông tin các ứng viên bao gồm: tên, năm, sinh cân nặng
- Dog chạy tối đa 40km/h
- Cat chạy tối đa 50km/h
- Hamster: chạy tối đa 10km/h
- Hãy in bảng thành tích của từng ứng viên.
**Hắc não**: SẮP XẾP BẢNG THÀNH TÍCH CHẠY CỦA ỨNG VIÊN
**Phân tích bài toán:
- Chạy tối đa ? tốc độ chạy biến đổi theo những lần chạy, hàm trả vè giá trị biến đổi -> không return giá trị "cứng - hard code" được
	-> hàm random sinh ra số ngẫu nhiên. 
- Chạy thì là hành động: 
- Dog(tên, ns, cân nặng), hành động run() -> abstract implement 
- Mèo(tên, ns, cân nặng),  hành động run()
- Hamster(tên, ns, cn),  hành động run()
- 3 Khuôn vì 3 đứa khác nhau, nếu giống gọi là 1 con xyz nào đó rồi
- Sắp xếp:  vậy chúng phải chung mảng, 
- Dog is a kind of Mèo -> vớ vẫn
- Cat is a Hamster -> vớ vẫn
Dog, Cat, Hamster MUST BE A KIND OF ?? 
câu is a tự nhiên đọc 1 chiều, tìm được -> coi như  SORT ĐÃ XONG. 
Nếu những thứ khác biệt ở chung được với nhau thì sẽ xử lí được data. 
Dog, Cat, Hamster IS A ANIMAL. (KHÔNG SAI NHƯNG KHÔNG HAY)
Dog, Cat, Hamster is a kind of Pet mới là hay !!!!!

HÌNH NHƯ ĐANG NÓI VỀ PHÂN LOẠI MỌI THỨ TRONG CUỘC SỐNG 
Dog Cat Hamster ->> Pet 
Elephan, Zebra, Tiger ->             tất cả đều là ANIMAL
	Person                -> 
	Cây cối              ->                                                         + CEREATURE Sinh vật trên TĐ
LOÀI CHI HỌ LỚP BỘ NGÀNH....
 Xe máy, Xe hơi, Xe tải, Xe đầu kéo, Xe khách, Máy bay, Tàu hỏa, Tàu thủy, Du thuyền -> is a VEHICLE
 Ghim bấm, kẹo giấy, keo gián, chuốt bút chì, bao tập, bìa lá folder, hộp đựng nhựa, mực, giẻ chùi bảng -> VĂN PHÒNG PHẨM
 Cá đông lạnh, tôm đông lạnh, chân gà -> Thực phẩm đông lạnh. 
 
 ĐẶT TÊN VÀ PHÂN LOẠI, CÁCH CON NGƯỜI QUẢN LÍ THÔNG TIN QUANH MÌNH
## Sumary
 CÓ 2 LOẠI KHUÔN/CLASS: 
 3. KHUÔN/CLASS HOÀN CHỈNH, KHÔNG CHỨA HÀM ABSTRACT, CONCRETE CỤ THỂ/RỜI RẠC/RÕ RÀNG
 - Các hành động có đủ code. 
 - Nếu nó có Con, Con không cần implement gì cả, Cha đã đủ code rồi. con thích thì @Override
 2. KHUÔN/CLASS KHÔNG HOÀN CHỈNH/CHỨA HÀM ABSTRACT CHỨA HÀM KHÔNG CODE
 - Bản thân nó không hoàn chỉnh, vì chỉ có tên hàm mà không có code, nó vẫn có quyền có hàm khác có code. 
 - Vè mặt lí thuyết khi new abstract class thì khi chấm thì hàm ko code, KO CÓ CODE ĐỂ CHẠY
 - new Cha abstract thì không có code để chạy !!
 - new Shape(....), new Pet(...), .run(), .paint(), .getArea() éo có code lấy gì chạy.
 - KO NEW CLASS CÓ HÀM ABSTRACT VÌ KHÔNG ĐỦ CODE/HOÀN THIỆN ĐỂ CHẠY.
 TRỪ PHI ..NẾU VẪN NGOAN CỐ NEW ABSTRACT CLASS THÌ ... 
 - Nếu nó có con thì con có 2 phương án mình đã học (vô sinh luôn, không cho new hoặc phái implement viết code cho hàm Cha).
 - Giả bộ ta chỉ tập trung vào phần IMPLEMENT HÀM CHA, CHA NÓI CHA LÀM.
 - Con @Override hết phần abs của Cha, COn có quyền làm thêm dị biệt.
 - VÙNG NHỚ CỦA CON, VÙNG NEW CỦA CON SẼ CHIẾM THỆ NÀO TRONG RAM (ko care con kế thừa Cha nào cụ thể hay trừu tượng)
	 - Vùng new của Cha, SUPER() ĐÓ, KO CARE CHA CỤ THỂ /HAY ABSTRACT. BA SẼ LÀ CÁNH CHIM ĐƯA CON BAY/EXTENDS MỞ RỘNG THÊM. VÙNG NHỚ CON BAO VÙNG NHỚ CHA, ĐỂ CON ĐƯỢC KẾ THỪA, CÓ SẴN MÀ DÙNG ĐỒ CHA.
	 - PHẦN MỞ RỘNG / EXTENDS, TRONG ĐÂY CHỨA: 
		 - DỊ BIỆT HOÀN TOÀN TỪ CON, HÀM, BIẾN ĐẶC TÍNH RIÊNG CON, EX: HCN CÓ THÊM 2 CẠNH 
		 - PHẦN @OVERRIDE/CON TRÙNG TÊN HÀM VỚI CHA - KHÔNG BẮT BUỘC NẾU CHA CỤ THỂ !!! THÍCH THÌ LÀM!! VÌ ĐẰNG NÀO CŨNG CÓ CHA ĐỂ XÀI .
		 - PHẦN @OVERRIDE / CON TRÙNG TÊN HÀM CHA BẮT BUỘC PHẢI CÓ NẾU CHA LÀ ABSTRACT, CHA KHÔNG HOÀN THIỆN, CON BẮT BUỘC PHẢI CODE. 
## CÔNG THỨC
- Dành cho trường hợp Con chơi với Cha trừu tượng
	- CON = NEW CHA() / SUPER() CHA ++++++ @OVERRIDE CHO TẤT CẢ  CÁC HÀM CỦA CHA.
## LÀM SAO ĐỂ CÓ ĐƯỢC MỘT OBJECT??? - ANONYMOUS CLASS
1. Ta cần 1 Khuôn/Class
2. Gọi new + phễu để xin vùng ram/clone vủng ram từ Khuôn + gọi phễu đổ vật liệu vào
	new xong là có object, tọa độ object luôn
3. Đặt tên cho object, biến object trỏ vùng new
- NẾU TA MUỐN CÓ HCN: 
1. Ta cần khuôn Rectangle --khuôn phải đủ code mới chạy được
2. new Rectangle (???)
3. Retangle x = new Rectangle(???)

NHỮNG OBJECT QUÁ ĐẶC BIỆT THÌ SAO ? ANONYMOUS CLASS
KHAI CHA NEW CHA, NẾU CHA ABSTRACT, MƯỢN GIÓ BẺ MĂNG, CHA NEW ĐỠ CHO CON MỞ RỘNG RA ĐI CON, VIẾT CODE ON THE GO, NHỚ ĐỪNG QUÊN CHẤM PHẨY, LÀM BIẾNG TẠO CLASS CON ĐỂ CLONE CHO NHANH, MÀY CHƠI TRÒ NEW TAO NGAY, TAO HỖ TRỢ EXTENDS HOÀN THIỆN CODE OVERRIDE CHO TAO., BA SẼ LÀ CÁNH CHIM, CHO CON ON THE GO -> ANONYMOUS CLASS, VÙNG RAM VẪN BỰ NHƯ LÀM CLASS RỜI, LÀM BIẾNG ĐẶT TÊN VÙNG RAM BỰ, VÙNG RAM ANONYMOUS.