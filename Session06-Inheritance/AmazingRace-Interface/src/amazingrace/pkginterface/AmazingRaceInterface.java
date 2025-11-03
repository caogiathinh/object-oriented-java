package amazingrace.pkginterface;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author gia.thinh
 */
public class AmazingRaceInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runToDead();
    }
    
//    public static playAnonymous() {
//        List list = new List() {
//            @Override
//            public int size() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean isEmpty() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Iterator iterator() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Object[] toArray() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Object[] toArray(Object[] a) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean add(Object e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean containsAll(Collection c) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean addAll(Collection c) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean addAll(int index, Collection c) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean removeAll(Collection c) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public boolean retainAll(Collection c) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public void clear() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Object get(int index) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Object set(int index, Object element) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public void add(int index, Object element) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public Object remove(int index) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public ListIterator listIterator() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public ListIterator listIterator(int index) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//
//            @Override
//            public List subList(int fromIndex, int toIndex) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        };
//    }

    public static void runToDead() {

        //có quyền có ai đó chạy ngang nhảy vô
        //mĩ nhân ngư của châu tinh trì nhảy vào!!
        //Người cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm, dụ 
        //thủy thủ đến bắt ăn thịt
        //nếu ta làm class Mermaid rời-concrete, tạo mới clas Mermaid 
        //viết code bình thường, code này có hàm batTuyThuAnThit()
        //bắt Mermaid implement DeathRacer, bắt người cá đi đua là chuyện quá đáng
        //không phù hợp logic, người cá không thích di chuyển đi đua !!
        //Nhưng có 1 nàng người cá thích ăn chay, lên bờ chơi với con người
        //không có logic chung người cá là ăn thịt người thủy thủ
        //Object lẻ không nhập chung đoàn Mermaid truyền thống
        //ko bắt Mermaid implement DeathRacer
        //Mĩ nhân ngư CTT phá đoàn, tham gia đua dướ kênh Nhiêu Lộc cho vui
        //không băt Người Cá ra đua
        //Object đánh lẻ, đánh lẻ đua, chỉ cần đua tốc độ là được rồi
        //Anonymous CLas, không thèm tạo class rời mà vãn tham gia CLB
        //chỉ cần có hoạt động của CLB là oke rồi, ghé ngang thôi thì cũng phải
        //hành động, implements all abstract methods on the go, take-away
        //làm class rời để nhân bản được nhiều Member
        //làm on the go cho vãng lai ghé qua
        //CẨ 2 ĐỀU PHẢI IMPLEMENT, @OVERRIDE VÌ CHA, CLB KHÔNG HOÀN HẢO. 
        //OBJECT ON THE GO, CẦN CÓM HÀM ĐƯA VÀ GÁY LÀ XONG, ÉO LÀM CLASS RIÊNG
        //ÉO LÀM CLASS CÓ SẴN ĐỂ NHÂN BẢN
        //DeathRacer mnnCTT = new DeathRacer(); //class rời này sẽ có @Override
                                                //2 hàm runToDead() và showHowToDead()            @Override
        //mượn gió bẻ măng, éo có khuôn sẵn thì mình phải tư viết @Override từ đầu. 
        //cho mỗi lần làm biếng tạo Khuôn
        //on the go @Override
        DeathRacer mnnCTT = new DeathRacer() {
            //vùng không gian của class rời MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            //VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            //BA SẼ LÀ CÁNH CHIM (new/super() new Death Racer)
            //đưa Con Extends/Implements thật xa thật nhiều @Override
            //ta có quyền làm như truyền thống thêm đắc điểm...
            //đừng lạm dụng, on-the-go nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50;
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }

            //anonymous làm biếng tạo class cho cả abstract class và imterface
            //bên Abstract class còn có đặc điểm của Cha để xài
            //anonymous của Interface, đau thì đua đi hỏi han làm chi, hong có info
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n", 
                                    "MERMAID-RACER", "MNN CTT", runToDead());
            }
        };
                
        Dog d1 = new Dog("NGAO DA", 2021, 50.0);
        //chấm full hàm Con đủ code hàm Cha, hàm CLB; 

        Pet d2 = new Dog("VANG OI", 1950, 10.0);
        //chấm full hàm của Cha, khai Cha, chạy không sợ vì đa hình Con qua mặt Cha
        //tổ lái con trỏ dược, new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì xổ Cha hoi 
        //mày biết bố tao là ai không ?? 

        DeathRacer d3 = new Dog("NANH TRANG", 1901, 20.0);
        //ngộ nhỡ dấu châm thì sao???
        //chám chỉ xổ full CLB, 2 hàm runToDead() và howToDead()
        //tao là đua thủ chỉ quan tâm đua thoi 
        //chạy éo sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, qua mặt tiếp
        //ép kiểu con trỏ luôn, new Dog mà sợ gì
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        //mnn ctt vẫn là 1 Racer, có hành động tương ứng rồi, đua gấp 3 lần giới hạn
        //Con tự lo, Con Motor chạy theo Motor, con Dog chạy theo Dog
        DeathRacer racer[] = {mnnCTT, d1, (Dog) d2, d3, m1, m2};
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        //Con tự lo, con Motor chạy theo Motor, Con Dog chạy theo Dog

        System.out.println("The racing records");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
