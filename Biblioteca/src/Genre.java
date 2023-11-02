import java.util.ArrayList;

public class Genre {

    private String code;
    private String name;
    private String description;

    private ArrayList<Genre> genre;

    public String getFullData() {
        return name + description;
    }

    public String getName() {
        return name;
    }
    public String getDescription(){
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public ArrayList<Genre> getGenre() {
        return genre;
    }
    public void setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
    }
}
