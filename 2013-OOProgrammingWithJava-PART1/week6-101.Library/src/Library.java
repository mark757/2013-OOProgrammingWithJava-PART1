import java.util.ArrayList;

/**
 * Created by Mark on 12/11/2016.
 */
public class Library {
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        library.add(newBook);
    }

    public void printBooks() {
        for (Book books : library) {
            System.out.println(books);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : library) {

            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : library) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : library) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }

}


