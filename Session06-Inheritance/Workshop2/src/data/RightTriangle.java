package data;

/**
 *
 * @author gia.thinh
 */
//1. Đọc được câu, TGV là phiên bản đặc biệt của 1 tg
//  extends

//2. Đặc tính của Class Con. Nếu Con trùng hết đặc tính của Cha, khồn cần làm gì
//3. Tạo phễu cho Con, giữ bản sắc
//4. Thích thì độ con 

public class RightTriangle extends Triangle {

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color, firstSide, secondSide, Math.sqrt(firstSide * firstSide + secondSide * secondSide));
    } //new Con chính là new 1 phiên bản Cha 
      //cắt TGV là cắt 1 TG
      //super() chính là new TG
      //cứ new TGV thì chính là new 1 phiên bản TG, new này gọi new kia 
    

    //in theo cách của mình, thì phải tự làm, nếu không thì xài thừa kế ba má 
    //thì phải theo quy tắc ba má 
    @Override
    public void paint() {
        System.out.printf("|R.TRIANGLE|%-10s|%4.1f|%4.1f|%4.1f|%4.1f|\n", color, firstSide, secondSide, thirdSide, getArea());
    }
    
}
