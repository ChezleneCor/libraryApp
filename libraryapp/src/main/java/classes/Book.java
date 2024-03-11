package classes;
import java.time.LocalDate;

public abstract class Book {

    // declaring variables
    protected String title;
    protected int bookID;
    protected String summary;
    protected String author;
    protected LocalDate publishedYear;
    protected boolean available;

    public Book(String title, int bookID, String summary, String author, LocalDate publishedYear, boolean available) {
        this.title = title;
        this.bookID = bookID;
        this.summary = summary;
        this.author = author;
        this.publishedYear = publishedYear;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    abstract int getBookID();

    abstract String getSummary();

    abstract String getAuthor();

    abstract LocalDate getPublishedYear();

    // accessors

    public boolean getAvailable() {
        return available;
    }

    // mutators
    public void setAvailable(boolean available) {
        this.available = available;
    }


}
