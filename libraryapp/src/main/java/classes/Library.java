package classes;
// import needed libraries
import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // mutators
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    //accessors

    public static ArrayList<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    
}
