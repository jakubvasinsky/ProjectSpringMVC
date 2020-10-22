package sk.kosickaakademia.vasinsky.projectSpringMVC;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String eMail;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private String[] operatingSystems;


    public Student(){

        countryOptions = new LinkedHashMap<>();
        countryOptions.put("SVK", "Slovakia");
        countryOptions.put("CZE", "Czechia");
        countryOptions.put("HUN", "Hungary");
        countryOptions.put("ROM", "Romania");
        countryOptions.put("SLO", "Slovenia");

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

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
