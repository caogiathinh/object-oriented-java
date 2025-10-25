
package data;

/**
 *
 * @author gia.thinh
 */
//KHUÔN TỔ SINH RA N KHUÔN KHÁC CHO NHANH 
//GIÚP CHO KHUÔN TRÒN CHỮ NHẬT BÌNH HÀNH TAM GIÁ, .. Ở CHUNG MỚI SORT ĐƯỢC
//
public class Shape {
    
    protected String owner;
    protected String color; 
    protected String borderColor;
    //cạnh thì sao??
    protected double a, b, c, radius; //còn nữa thì sao, có nên không ?? 
    //khong được đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa các cạnh, hình vuông sẽ có cạnh, nhiều nữa là đằng khác, bk 
    //tròn thừa kế luôn cả cạnh 
    //bk, cạnh là của riêng từng đứa con, dị biệt thì phải ở từng đứa con không thể ở chung
   
    //cha sẽ là nhân tư chung cho các con, ngoài đời y chang. 
    //đám con có di truyền từ ba má: owner, color, đường bo
    //nhưng còn giữ lại những khác biệt: Tròn: bán kính, Vuông: cạnh.,
    //anh em trong nhà thừa kế từ ba má nhiều thứ, tài sản riêng Con tạo dựng 
    //người đó giữ
    
    
    //diện tích chu vi là derived field được tính từ thằng khác không nên đưa vào đây
    
}
