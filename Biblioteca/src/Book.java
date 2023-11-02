import java.util.ArrayList;

public class Book {

    private String isbn;
    private String title;
    private ArrayList<Author> author;
    private ArrayList<Genre>  genre;
    private String publicDate;

    private Loan loan;

    private String getFullData(){
        return  isbn + "" + title + " " + author + " " + genre + " " + publicDate;
    }

    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<Author> getAuthor(){
        return author;
    }
    public ArrayList<Genre> getGenre(){
        return genre;
    }
    public String getPublicDate(){
        return publicDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
