
package data;

/**
 *
 * @author gia.thinh
 */
public class Book {
    private String bookName; 
    private String authorName;
    private double price; 

    public Book(String bookName, String authorName, double price) {
        this.bookName = bookName; 
        this.authorName = authorName; 
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void show() {
        System.out.printf("|%-10s|%-20s|%4.1f|\n", bookName, authorName, price);
    }
}


