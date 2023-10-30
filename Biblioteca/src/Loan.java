public class Loan {

    private String id;
    private String date;

    public Users users;
    public Book book;


    public String getFullData() {
        return id + date;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
