package classes;
import java.time.LocalDate;

public class Children extends Book {
    protected String ageGroup;
    protected String learningObjective;

    public Children(String title, int bookID, String summary, String author, 
    LocalDate publishedYear, boolean available, String ageGroup, String learningObjective) {
        super(title, bookID, summary, author, publishedYear, available);
        this.ageGroup = ageGroup;
        this.learningObjective = learningObjective;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getLearningObjective() {
        return learningObjective;
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
