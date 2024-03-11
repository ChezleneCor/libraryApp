package classes;
import java.time.LocalDate;

public class Nonfiction extends Book {
    protected String topic;

    public Nonfiction(String title, int bookID, String summary, String author, 
    LocalDate publishedYear, boolean available, String topic){
        super(title, bookID, summary, author, publishedYear, available);
    }

    public String getTopic() {
        return topic;
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
