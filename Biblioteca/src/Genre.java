public class Genre {

    private String name;

    private String description;

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
}
