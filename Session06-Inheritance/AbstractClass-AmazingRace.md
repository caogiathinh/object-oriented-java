[[OOP]]
#oop #abstractClass #Inheritance

## Yêu cầu bài toán

Cuộc đua kì thú giữa các ứng viên Dog, Cat, Hamster, .. 
- Thông tin các ứng viên bao gồm: tên, năm sinh, cân nặng 
- Dog: chạy tối đa 40km/h. 
- Cat: chạy tối đa 50km/h
- Hamster: chạy tối đa 10km/h. 
- Hãy in bảng thành tích của từng ứng viên
- Sắp xếp bảng thành tích chạy của các ứng viên. 
## Phân tích xử lý bài toán
- Chạy tối đa ? tốc độ chạy là biến đổi theo những lần chạy, hàm trả về giá trị sau những lần chạy -> không return giá trị cứng được "hard-code" 
-> hàm Random() trong toán học sinh ra được số ngẫu nhiên. 
- Chạy thì là hành động

- Dog(tên, ns., cân nặng), hành động Run() -> abstract và implement.
- Cat(tên, ns., cân nặng), hành động Run()
- Hamster(tên, ns., cân nặng), hành động Run()
->> 3 khuôn 3 đứa khác nhau hoàn toàn, nếu giống gọi là 1 con xyz nào đó rồi
- Sắp xếp vậy chúng phải chung mảng,
	- Dog is a kind of Cat: vớ vẫn
	- Cat is a kind of Hamster: vớ vẩn
	- Vớ vẫn khi quanh quẩn 3 thứ. 
Dog, Cat, Hamster MUST BE A KIND OF ?? 
Câu is a tự nhiên đọc 1 chiều, tìm được coi như sort xong. Nếu những khác biệt ở chung được với nhau, thì sẽ xử lí được data. 
- Dog, Cat, Hamster IS A ANIMAL, ỔN KHÔNG SAI NHƯNG KHÔNG HAY
- Dog, Cat, Hamster is a kind of Pet mới là hay. 
=>**** PHÂN LOẠI MỌI THỨ TRONG CUỘC SỐNG 
- Dog, Cat, Hamster ...     -> Pet
- Elephan, Zebra, Tiger, . ->                     ANIMAL
	 Person
	 Cây cối                                                +                     CREATURE (sinh vật trên Trái Đất)
- LOÀI CHI HỌ BỘ LỚP NGÀNH ... 
- Xe  máy, Xe hơi, Xe tải, Xe kéo, Xe khách, Máy bay, Tàu hỏa, Tàu thủy, Du thuyền -> is a VEHICLE
- Ghim bấm, kẹp giấy, keo gián, chuốt bút chì, bao tập
	bìa lá, folder, hộp nhựa đựng, mực, giẻ chùi bảng  -> VĂN PHÒNG PHẨM
- Cá đông lạnh, Tôm đông lạnh, Chân gà, Thịt gà, vịt,.. -> Thực phẩm đông lạnh.

=> ĐẶT TÊN PHÂN LOẠI CÁCH CON NGƯỜI QUẢN LÝ THÔNG TIN QUANH MÌNH. 
F&B, HORECA (hotel, restaurant, cafe) vẫn là phân nhóm, phân loại. 
## Code
