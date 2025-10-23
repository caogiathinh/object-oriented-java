[[OOP]]
### Cách tiếp cận khác trong đúc Object
Từ các object trong cuộc sống, trong bài toán cần tin học hóa -> tìm ra dc cái Khuôn/Class: 1 mức nhận thức, thiết kế ta đạt được rồi
Level 2 của nhận thức về class: 
-> Khuôn A, khuôn B, khuôn C thấy chúng có tưng đồng
TA MUỐN TẠO MỘT MÓN MỚI, TA BẮT ĐẦU TỪ ĐÂU - từ cái có sẵn. 
Món đồ tức là object, muốn chế tạo nhiều đồ ta cần Khuôn (nhân bản object) 
--> làm sao được cái Khuôn: chế từ đầu, hay "độ" lại từ 1 cái khuôn khác kế thừa lại INHERIT / INHERITANCE. 
	- Chế từ đầu: những thứ độc lập: xếp cạnh nhau chõi nhau, không chung mảng. 
	- Độ lại khuôn có sẵn cho nhanh -> seri các object có vẻ tương đồng nhau, bày cạnh nhau không chỏi nhau, không loại trừ nhau, tương hợp nhau nhiều hơn.
		-**Ví dụ:** dòng S Samsung, Notes Samsung. 
### Đa dạng sản phẩm nhưng lại nhanh trong chế tạo
- Đứng trên vai người khổng lồ: có sẵn rồi, làm thêm cho hay, phát huy thêm, ai đó dọn đường ta đi tiếp. 
- Đừng làm lại cái bánh xe: kế thừa cái có sẵn, làm tiếp cái mới -> phiên bản limited, phiên bản đặc biệt, bản "độ" từ xe máy kỉ niệm 20 năm thành lập, thay tem.
- Ngầm hiểu 1 câu chuyện: từ cái có sẵn, ta làm ra cái mới - phiên bản mới từ cái cũ, cần có cái có sẵn, để ta đi tiếp. 
- Chế tạo món mới từ món cũ, độ, điều chỉnh một chút ít, để ta có sản phẩm nhanh. 
- Muốn object ta cần Khuôn X -> khuôn X làm từ đầu thì mất công, ta độ từ Khuôn Y nào đó. 
	- Khuôn X là bản điều chỉnh từ Khuôn Y.
		- Có nguồn gốc dính dáng từ ..
		- Dùng lại những ưu thế, thứ có sẵn từ Y. 
