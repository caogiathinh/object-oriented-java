
package data;

/**
 *
 * @author gia.thinh
 */
public abstract class Pet {
    
    //chứa nhân tử chung của đám Con
    protected String name;
    protected int yob;
    protected double weight; 
    protected double speed; //biên lưu tốc độ sau khi chạy
    
    //giải quyết vấn đề ngẫu nhiên speed

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.speed = -1; //-1 nghĩa là chưa chạy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //getter cho speed
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //hành động của mỗi con cụ thể
    //hành động chạy của mỗi Con: hoàn toàn khác nhau, khác nhau về tốc độ
    //dáng chạy -> ngầm hiểu là xử lí khác nhau!!
    //vây chạy là ý tưởng chung chung mà loài Pet cần có. 
    //chạy là 1 thứ đi kèm Pet, cụ thể thế nào là tùy từng đứa
    //abstract methods, cái gì không cụ thể khi đề cập về nó -> SURE CHUNG CHUNG
    //              ABSTRACT
    public abstract double run(); 
    
    //Method mới: chạy và lưu tốc độ (chỉ chạy 1 lần)
    public void performRun() {
        if (speed == -1) //chỉ chạy nếu chưa có tốc độ 
            speed = run(); 
    }
    
    //mỗi đứa gáy sủa thành tích theo kiểu khác nhau 
    public abstract void showProfile();  
}
