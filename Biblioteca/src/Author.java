import java.util.ArrayList;

public class Author {

    private String name;
    private String surname;
    private String birthDate;
    private String birthCity;

    public String getBirthCity() {
        return birthCity;
    }
    public ArrayList<Book> getBook() {
        return book;
    }
    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    private ArrayList<Book> book;

    public String getFullData() {
        return name + surname + birthDate + birthCity;
    }
    private String getName(){
        return name;
    }
    private String getSurname(){
        return surname;
    }
    private String getBirthDate(){
        return birthDate;
    }
    private String birthCity(){
        return birthCity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }
}
