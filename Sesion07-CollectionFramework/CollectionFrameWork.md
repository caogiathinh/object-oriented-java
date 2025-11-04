[[OOP]]
Làm sao để lưu trữ, xử lý nhiều object cùng loại ? Làm sao để lưu trữ, xử lí nhiều sinh viên, nhân viên ? thì ta  cần mua túi, balo, thùng, tủ, phòng để đựng nhiều đồ. 
Mua cái túi, mua cái tủ, xây cái phòng, chính là new cái TÚI(), new cái TỦ(), NEW CĂN-PHÒNG().  Phải có một thùng chứa thật được tạo ra để ta bỏ đồ vô. Do đó phải NEW THÙNG-CHỨA LÀ CHẮC CHẮN RỒI

QUAN ĐIỂM LẬP TRÌNH: NEW ĐỂ CÓ VÙNG RAM LƯU TRỮ INFO + HÀM XỬ LÍ INFO THEO ENCAPSUALTION.

Object trong RAM tương đương món đồ thật ngoài đời. Điện thoại trên tay có màu sắc giá tiền, hành động gọi là nghe chụp ảnh, phải mua về , nhà sx phải tạo ra, new ra bạn mới có xài. 

Mình trừu tượng hóa món đồ thật thành object trong lập trình thì cần new để có vùng ram có data + hành động. 

MUA TỦ ĐỰNG NHIỀU ĐỒ THÌ TA CẦN NEW TỦ() CÓ KHÔNG  GIAN DỰNG ĐỒ VÀ HÀNH ĐỘNG TƯƠNG ỨNG.

TỦ tuCuaTui = new TỦ(); //trong RAM sẽ có 1 vùng không gian để đựng đồ, ngoài đời Tủ chiếm 1 góc phòng để ta đựng đồ

cái tủ nó cho mình làm gì thì mình làm đó encapsulation/abstraction đấy. Mua tivi mà nó ko smart, chỉ xem cab thôi, làm sao duyệt web được. Mua cái tivi smart thì mới duyệt web dc. ----> nguyên tắc đóng gói hành động đi kèm object. Mua dog về thì nó giỡn với mình.

tuCuaTui.addDoVao(món đồ đưa vào trong tủ) //tủ cho phép mình bỏ đồ vô, y chang lò nướng cho mình bỏ con Gà vô để nướng, 
LoNuong loCuaTui = new LoNuong(); //mua lò về, chiếm góc bếp
loCuaTui.addDoNuong(con-gà để nướng)

TỦ LÀ OBJECT CHỨA NHIỀU ĐỒ ĐẠC KHÁC
1. MUA TỦ                           TỦ tuCuaTui = new TỦ(); 
2. MUA ĐỒ ADD VÔ TỦ      tuCuaTui.addMonDo(new/mua 1 món đồ thảy vô tủ)

MUA CÁI TÚI, CÁI GIỎ, CÁI THÙNG, NEW CÁI TÚI(), NEW CÁI GIỎ(), NEW CÁI THÙNG(), CÓ khóa dây kéo bỏ món đồ mình muốn cất.
tuCuaTui.addMonDo(mua món đồ bỏ vô túi - new MónĐồ())

Có 2 loại tủ: 
1. TỦ LOẠI 1: FIX CỨNG SỐ ĐỒ ĐỂ VÀO, CHỈ ĐÊ VÔ MỘT GIỚI HẠN MÓN ĐỒ. 
	CHÍNH LÀ MẢNG [SỐ ĐỒ ĐỂ VÔ], MẢNG LÀ KHAI BÁO NHIỀU BIẾN NHIỀU CHỖ CHỨA FIX CHỖ NGỒI Y CHANG Ô TÔ CHỞ KHÁCH 16 CHỖ, RẠP PHIM [100 GHẾ]
		CHỨA TỌA ĐỘ VÙNG NEW MÓN ĐỒ() CỨ THOẢI MÁI NẰM ĐÂU ĐÓ, TA LƯU TẠO ĐỘ
	Student arr[] = new Student[100]; 
	//arr chính là biến má mì, tên gọi tắt của cái tủ có 100 chỗ. 
	//tên mảng chính là tên gọi cho 1 cái tủ fix số chỗ!!
	//vì nó trỏ đến new [số chỗ]

	//bỏ đồ vào mảng, không cần dùng hàm, hành động của tủ, cho SỜ TRỰC TIẾP CHỖ ĐỂ
		arr[0] = món đồ bỏ vô, new món đồ bỏ vô; 
		//~~~~~ tuCuaTui.addMonDo(new món đồ); 
		//tuCuaTui vị trí 0 được cất món đồ new món đồ
		//món đồ new nằm trong HEAP, nằm bên ngoài tủ, tủ chỉ lưu danh sách tham chiếu
		//tủ chứa danh sách bệnh nhân, bệnh nhân vẫn trong phòng điều trị.
		gv giữ danh sách sv, sv ở quê đâu có sao.
DÙ TỦ LOẠI 1 HAY 2 THÌ ĐỀU CHỨA NHIỀU ĐỒ, ĐỒ ĐỂ THẬT SỰ VÀO TRONG TỦ HAY CHỈ GIỮ DANH SÁCH THAM CHIẾU, GG MEET GIỮ DANH SÁCH THAM CHIẾU, DANH SÁCH KÍ TÊN CHỨA THAM CHIẾU.
2. TỦ LOẠI 2: CO GIÃN SỐ ĐỒ ĐỂ VÔ, THOẢI MÁI ĐỂ ĐỒ VÔ, CẦN THÊM CHỖ, CÓ THÊM CHỖ, KO CẦN XIN, CỨ ĐỂ ĐỒ VÔ LÀ THÊM CHỖ, GIỐNG NỒI CƠM THẠCH SANH, GIỐNG GIẾNG KHƠI, MÚC NƯỚC LẠI CÓ NƯỚC
- ArrayList, Vector
- HashSet, TreeSet
- HashMap, TreeMap
các túi này ban đầu ko có chỗ nào cả, ko đáy
cứ nhét đồ vô, tao thêm chỗ
không sờ [i] vào vị trí chỗ
xin qua dây kéo, khóa, ngăn, cánh cửa, mở ra nhét đồ vô. 
tuCuaTui[i] = món đồ bỏ vô -> mảng
tuCuaTui.add(món đồ bỏ vô) bỏ đồ vô qua hành động của tủ, khong sờ trực tiếp ngắn chứa thứ [i]

VẪN CODE NHƯ XƯA NAY: NEW TỦ,   .GỌI HÀM HÀNH ĐỘNG CỦA TỦ NEW RIÊNG MÓN ĐỒ, MUA TỦ -> MUA ĐỒ -> CẤT ĐỒ

NEW 3 LOẠI TỦ GIỐNG NHƯ CÁC THƯƠNG HIỂU TÚI XÁCH BẠN MUA
ADDĐỒ(MÓN ĐỒ KHÁC ĐI MUA) VÀO TỦ Ở NGĂN THỨ [I] NÀO ĐÓ NHÌN THEO KIỂU MẢNG. ĐỀU CHỨA THAM CHIẾU. LINH HOẠT TRONG VIỆC ĐỂ CÁC MÓN ĐỒ.

