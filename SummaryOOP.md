[[OOP]]

## OOP CONCEPTS / OOP PRINCIPLES / FUNDAMENTAL CONCEPTS OF OOP / FOUR PILLARS OF OOP
### 1. ABSTRACTION TRỪU TƯỢNG HÓA MỌI VẬT (ĐỪNG NHẰM LẪN VỚI ABSTRACT CLASS)
- Là tư duy, cách suy nghĩ chuyển đổi, biểu diễn những thứ phức tạp trong cuộc sống thành những thứ đơn giản hơn nhưng vẫn diễn tả đúng ý nghĩa của sự vật ban đầu.
- Là cách nói về những thứ phức tạp trong cuộc sống thông qua 1 thứ khác đơn giản hơn mà không làm mất đi ý nghĩa của thứ phức tạp ban đầu.
- Biểu diễn lại 1 thứ phức tạp ngoài đời để dễ hiểu hơn.
- Cách lấy ra những thông tin quan trọng nhất, tiêu biểu nhất của 1 object phức tạp ngoài đời để biểu diễn cho ai cũng hiểu được thứ phức tạp. 
- Một thứ phức tạp ngoài đời được biểu diễn qua 1 thứ đơn giản nhưng ko làm mất chất. 
- USING A SIMPLE THINGS TO REPRESENT THE COMPLEX THINGS.
- EXTRACT THE SIGNIFICANT FEATURE/CHARACTERISTICS  OF A COMPLEX THINGS TO FORM A SIMPLE/EASY CATCHING THINGS WITHOUT LOSING THE ORIGINAL MEANING OF THE COMPLEX ONES.

- Tư duy nắm bắt thông tin quan trọng của Object ngoài đời, dùng để biểu diễn lại object đó. 
- Ví dụ: Sinh viên ở ngoài đời rất phức tạp về info: tên, tuổi, địa chỉ tt, tạm trú, chích vaccine, lịch trình di chuyển, gia cảnh, ba mẹ, sở thích, chuyên ngành học, học kì, tình trạng học, deadline, điểm thi các môn, mối quan hệ xã hội, ... n thông tin của 1 object, quá complex
- Trường ĐH không cần nắm hết thông tin này nhưng vẫn có thể quản lý được "thứ/object" phức tạp này tìm ra những info đặc trưng đủ quản lý biểu diễn/minh họa / mô tả (represent) một Sinh viên. 
	- **Sinh Viên**(ID, email trường, tên, địa chỉ, phone, chuyên ngành, điểm các môn)
		rút gọn/extract chỉ lấy những info quan trọng nhất, có ý nghĩa nhất để minh họa biểu diễn sinh viên. (một sinh viên bất kì), **RÚT GỌN N INFO Ở TRÊN CÒN VÀI INFO QUAN TRỌNG, BẠN VỪA XONG THAO TÁC TRỪU TƯỢNG HÓA 1 BẠN SV, BIẾN TỪ PHỨC TẠP TỚI ĐƠN GIẢN MÀ VẪN GIỮ NGUYÊN Ý NGHĨA.**
	====> TÌM ĐẶC ĐIỂM QUAN TRỌNG CỦA  1 OBJECT, TÌM ĐẶC ĐIỂM CHO 1 CLASS//KHUÔN -> ABSTRACTION: BIẾN ĐỔI BIỂU DIỄN INFO KO KHIẾN MẤT GỐC BAN ĐẦU, MÔ TẢ LẠI MỘT CÂU CHUYỆN/ 1 THỨ NÀO ĐÓ MÀ AI CŨNG HIỂU ĐƯỢC, TÍNH TRỪU TƯỢNG/MÔ TẢ/NGẮN GỌN. TRỪU TƯỢNG HÓA TỨC LÀ KỂ LẠI CÂU CHUYỆN MÔ TẢ TRONG TRÍ NÃO KỂ LẠI CHO AI ĐÓ NGHE VÀ NGƯỜI TA HIỂU ĐƯỢC.
	- **Bệnh nhân** cũng vậy: mã bn, tên, dị ứng, lịch sử khám, đơn thuốc.
### 2. ENCAPSULATION - (HỆ QUẢ CỦA TRỪU TƯỢNG HÓA) CÔ LẬP ĐÓNG GÓI MỌI THỨ
- Nhận diện một đối tượng qua đặc tính và hành vi, gom chung trong  1 đơn vị là object/class. 
- Hàm (xử lí data)+ biến (data) gom vào 1 đơn vị object/class/code.
- Gom xong giấu/che nó đi bằng thuật ngữ private, show ra nếu muốn theo cách public protected. 
- TẠO CLASS ĐÓNG GÓI MỌI THỨ ĐẶC ĐIỂM + HÀNH VI, CHE VÀ KHÔNG CHE.
- Giống y chang viên thuốc con nhộng - vỏ ngoài là nhựa-sinh học, ta khi uống vào, vặn vặn tách viên thuốc bên trong là bột thuốc.
	- Nhìn bên ngoài vỏ thuốc con nhộng, không thấy thuốc bên trong, ENCAPSULATE (V) GÓI LẠI, CHE GIẤU, CÓ THỂ TRONG SUỐT NẾU MUỐN... NHƯNG TRONG CON NHỘNG, VỎ NHỰA SINH HỌC CHẮC CHẮN CHỈ CÓ THUỐC
- Gom info và xử lí vào trong 1 đơn vị, che giấu show ra khi cần thiết.
- TIVI: che bằng cái vỏ nhựa đen/xanh/bạc/màn hình, ta chi tương tác qua remote/nút bấm không thấy bên trong tivi ra sao, xử lí info + quét data bộ phim wifi/vô tuyến, éo quan tâm đừng ngoài tivi giao tiếp qua public nút bấm. tivi chính encapsulate
- ATM cũng vậy, không thấy khay tiền private, không thấy cục hút tiền, không thấy hành xử bên trong chỉ thấy hành động bấm nút rút tiền.. đóng gói cho việc rút tiền, không làm việc khác.
- Tivi duyệt web, xem phim, chấm hết. 
- Xe máy che hết những dây, nhợ, khung, xấu xí qua bửng xe, dàn mủ, public ra được cái nút, tay gas. Xe máy éo quan tâm Wifi tiền điện... 
- ABSTRACTION LÀ LẤY RA ĐẶC TRƯNG, ENCAPSULATION LÀ GÓI TRỌN VẸN ĐÚNG THỨ CẦN LÀM (tạo class instance variable + method())

### 3.  INHERITANCE - TÁI SỬ DỤNG, CÓ XÀI LUÔN KHÔNG THAO TÁC GÌ THÊM / KO PHẢI COPY PASTE
- Re-use lại code mà không phải làm lai code thậm chí không cần copy and paste. 
- Con kế thừa di sản tài sản di truyền sự thông minh từ ba má.
- Tăng tốc quá trình viết code khi có đoạn code, object đã làm tốt việc của nó rồi, ta muốn tận dụng để mở rộng thêm khả năng của object mới, dùng lại đồ object cũ + dị biệt ta làm thêm
	- TĂNG TỐC LÀM: BA MÁ GIÀU CÓ, CÓ TIỀN, MÌNH THUẬN LỢI TRONG VIỆC CÓ VỐN LÀM ĂN, NẾU BA MÁ CHO CĂN NHÀ, MÌNH ĐỠ LO TIỀN TRỌ, TA CHỈ LO TIỀN ĂN, BA MÁ CHO VỐN, TA LÀM GIÀU NHANH HƠN, KHÔNG ÁP LỰC TRẢ NỢ, THAY VÌ BÒN RÚT KIỂU BẤT HIẾU, XÀI MÀ KHÔNG CHỊU LÀM THÊM.  NAY TA BẬT NHANH HƠN, HỘI NHẬP NHANH HƠN, JOIN CUỘC SÔNG NHANH HƠN.
	- CÓ THƯ VIỆN VIẾT CODE RỒI, LÀM APP VIẾT CODE NHANH HƠN, KHÔNG LÀM LẠI TỪ ĐẦU. 
	- CÓ THƯ VIỆN, MỞ RỘNG THƯ VIỆN CHO NHU CẦU RIÊNG, ĐA DẠNG SỬ DỤNG, TĂNG TỐC VIẾT CODE
		- CHA CỤ THỂ, CON CỤ THỂ.
		- CHA TRỪU TƯỢNG, CON  CỤ THỂ.
		- ABSTRACT CLASS CHẲNG QUA LÀ CÁCH GOM, PHÂN LOẠI ĐỐI TƯỢNG MỨC CAO THẤP. GIỐNG NHƯ PHÂN LOẠI SỰ VẬT NGOÀI ĐỜI, GOM NHÓM NHƯNG TẬN DỤNG KẾ THỪA THÀNH QUẢ OBJECT CÓ CÁI GÌ ?? DÙNG LẠI NGUYÊN TĂC TRỪU TƯỢNG HÓA + ENCAP.
### 4. POLYMOPHISM - ĐA HÌNH, ĐA XẠ - MỘT RA NHIỀU 
- Mùa đông 1946, Bác hồ kêu gọi toàn quốc kháng chiến, ai có súng dùng súng, ai có dao dùng dao... 
	- Chỉ là 1 câu kêu gọi của Bác: CHIẾN()
		- Nhân dân quật khởi đứng lên: dao, kiếm, móc câu, hàm chông, súng, đốt,.. 
			- Đa dạng cách giết giặc, đa dạng cách implements hành động. 
			- Từ 1 chữ CHIẾN() CÓ N CÁCH LÀM KHÁC NHAU, TÍNH ĐA DẠNG, BIẾN HÌNH, TRANSFORMER, ĐA SẮC THÁI, ĐA NHÂN CÁCH, ĐA HÌNH POLYMOPHISM. 
	- Đại ca kêu tối nay giang hồ chợ lớn. đi chiến nha() 
		- Đàn em đem hàng: mã tấu, dao, côn, ...
	- Các Vua Hùng đã có công dựng nước, bác Cháu ta phải implements/Override
	- Từ 1 hàm Cha, có n Con @Override qua mặt, chính là tính đa hình. Gọi Cha mà Con chạy. Đảm bảo tính đa dạng của các hành động vẫn chơi chung và thống nhất hành động qua tên gọi @Override hiện thực cho tính đa hình
### SOLID (ADVANCE)



