package sk.kosickaakademia.vasinsky.projectSpringMVC;

public class Student {

    private String firstName;
    private String eMail;
    private String country;

    public Student(){
        //prazdny konstruktor
    }

    public String getStudentName() {
        return firstName;
    }

    public void setStudentName(String studentName) {
        this.firstName = studentName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
