[[OOP]]

## TỔNG KẾT CHUNG CHO KẾ THỪA - THỪA HƯỞNG ĐẶC ĐIỂM & HÀNH VI
- LIÊN QUAN ĐẾN CÂY PHÂN LOẠI, PHÂN LOẠI OBJECT TRONG CUỘC SỐNG CỦA CON NGƯỜI.
	- LOÀI CHI HỌ LỚP BỘ NGÀNH,  VECHICLE, PET, ANIMAL, VĂN PHÒNG PHẨM, ... 
- IS A KIND OF, ĐỌC 1 CHIỀU
	- CON LÀ 1 PHIÊN BẢN CỦA CHA - HV LÀ 1 PHIÊN BẢN CỦA HCN, MÈO LÀ MỘT THÚ CỨNG. CON THỪA HƯỞNG ĐẶC ĐIỂM VÀ HÀNH VI CỦA CHA.
- CÁC LOẠI KẾ THỪA:
	- CHA CỤ THỂ - CON CỤ THỂ (đủ code cho cả 2): 
		- Con có thể @Override nếu muốn không ép. 
		- Con có thêm dị biệt nếu muốn, không ép. (hàm của riêng Con hành động của riêng Con)
		- Thực ra đã có đủ từ Cha hoàn hảo rồi. 
		- Khai Cha new Cha - dùng Cha luôn vì Cha hoàn hảo
		- Khai Cha new Con, đa hình xảy ra, @Override
		- Khai Con new Con 
		- Khai Con new Cha (tuyệt đối không đươc)
	- CHA TRỪU TƯỢNG  - CON CỤ THỂ HOẶC TRỪU TƯỢNG (vô sinh không new được Object)
		- Đời Cha không làm đời Con phải làm, Con bắt buộc phải @Override cho Cha. 
		- Phải hoàn tất giấc mơ của Cha. 
		- Con có thể có dị biệt nếu muốn.
		- Khai Cha new Cha {....@Override}; //anonymous do làm biếng tạo Con sẵn
		- Khai Cha new Con, đa hình xảy ra, Con qua mặt hàm @Cha.
		- Khai Con new Con.
