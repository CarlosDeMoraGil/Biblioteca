import java.util.ArrayList;

public class Users {

    private String dni;

    private String name;

    private String surname;

    private String phone;

    private String homeAdress;

    private String placeOfLiving;

    private ArrayList<Loan> loan;

    public String getFullData() {
        return dni + name + surname + phone + homeAdress + placeOfLiving;
    }
    public String getDni(){
        return dni;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPhone(){
        return phone;
    }
    public String getHomeAdress(){
        return homeAdress;
    }
    public String getPlaceOfLiving(){
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public ArrayList<Loan> getLoan() {
        return loan;
    }
    public void setLoan(ArrayList<Loan> loan) {
        this.loan = loan;
    }
}
