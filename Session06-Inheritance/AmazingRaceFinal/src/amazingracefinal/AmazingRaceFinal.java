package amazingracefinal;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gia.thinh
 */

public class AmazingRaceFinal {


    public static void main(String[] args) {
        // TODO code application logic here
        runToDead();
    }
    
    public static void platWithAnonymous() {
        List list = new Vector();
        
        //List là abstract, 20 hàm không có code
        List list2 = new List() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Iterator iterator() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean add(Object e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean addAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object get(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object set(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void add(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object remove(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ListIterator listIterator() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    public static void runToDead() {
        
        //mỹ nhân ngư của châu tinh trì nhảy vào
        //làm on the go cho object vãng lai ghé ngang. 
        
        //object on the go, cần có hàm đua và gáy thành tích  là xong không cần class
        
        //mượn gió bẻ măng, không cso khuôn sẵn thì phải code @Override từ đầu để chơi trò làm biếng tạo Khuôn
        DeathRacer mmnCTT = new DeathRacer(){ //class này sẽ có @Override 2 hàm runToDead(), showHowToDead()
            //vùng không gian rời của class rời mà ta làm biếng làm riêng
            //vùng này chính là phần mở rộng của Cha/CLB
            //ba sẽ là cánh chim (new/super) đưa con extends/implement thật xa thật nhiều @Override
            //ta có quyền làm như truyền thống thêm đặc điểm 
            //đừng lạm dụng, on the go thì nên quan tâm phần đang tham gia
            
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3; 
            }
            
            //anonymous làm biêng tạo class rời cho cả abstract class và interface
            //bên Abstract class thì ta còn có đặc điểm của Cha cho để xài,
            //Anonymous của Interface, đua thì đua đi, hỏi han làm chi, hong có info
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%4s|%5.1f|\n", 
                                    "MERMAID-RACER", "MNN CTT", " ", runToDead());
            }
        };
        
        Dog d1 = new Dog("NGAO DA", 2021, 50.0);
        //chấm full hàn của Con, đủ code hàm Cha, CLB
        Pet d2 = new Dog("VÁNG OI", 1950, 10.0);
        //chấm thì chỉ có full hàm của Cha, chạy cũng không sợ vì đa hình con qua mặt Override
        //tổ lái con trỏ dược, new Dog mà sợ gì ??
        //tao là danh nghĩa Cha thì chỉ xổ của Cha
        DeathRacer d3 = new Dog("NANH TRANG", 1901, 20.0);

        //ngộ nhở dấu chấm thì sao
        //chỉ xổ full CLB, 2 hàm runToDead() và showHowToDead()
        //tao là đua thủ chỉ quan tâm đua thôi, 
        //chạy éo sợ vì Con qua mặt Override, có đủ hàm đã làm rồi, đa hình tiếp
        //ép được con trỏ luôn, new Dog mà sợ gì 
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2, mmnCTT};
        //DeathRacer racer[] = new DeathRacer[5]
        //racer[0] = new Dog(....); 
        //racer[1] = new Motor(..)
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowToDead
        //Con tự lo, motor chạy theo cách của Motor, Dog chạy theo cách của Dog
        System.out.println("The racing record:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
     }
}
