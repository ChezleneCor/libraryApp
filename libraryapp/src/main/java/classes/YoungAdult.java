package classes;

import java.time.LocalDate;

public class YoungAdult extends Book {
    protected boolean approvedForSchool;
    protected String genre;


    public YoungAdult (String title, int bookID, String summary, String author, 
    LocalDate publishedYear, boolean available, boolean approvedForSchool, String genre) {
        super(title, bookID, summary, author, publishedYear, available);
        this.approvedForSchool = approvedForSchool;
        this.genre = genre;
    }


    public Boolean getApprovedForSchool() {
        return approvedForSchool;
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
