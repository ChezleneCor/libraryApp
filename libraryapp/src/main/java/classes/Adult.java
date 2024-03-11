package classes;
import java.time.LocalDate;

public class Adult extends Book {
    protected String genre;

    public Adult(String title, int bookID, String summary, String author, 
    LocalDate publishedYear, boolean available, String genre) {
        super(title, bookID, summary, author, publishedYear, available);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    int getBookID() {
        return bookID;
    }

    @Override
    LocalDate getPublishedYear() {
        return publishedYear;
    }

    @Override
    String getSummary() {
        return summary;
    }

    @Override
    String getAuthor() {
        return author;
    }
}
