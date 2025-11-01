
package data;

/**
 *
 * @author gia.thinh
 */
//mua con Pet đi không cụ thể hỏi thêm con gì

public abstract class Pet {
    protected String name;
    protected int yob;
    protected double gpa;

    public Pet(String name, int yob, double gpa) {
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
    }
    
    public abstract double run();
    public abstract void showRecord(); 
}
