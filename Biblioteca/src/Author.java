public class Author {

    private String name;
    private String surname;
    private String birthDate;
    private String birthCity;

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


}