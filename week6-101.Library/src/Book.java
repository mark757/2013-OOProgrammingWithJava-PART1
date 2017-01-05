/**
 * Created by Mark on 12/11/2016.
 */
public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book() {

    }

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;

    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return title + ", " + publisher + ", " + year;
    }

}
