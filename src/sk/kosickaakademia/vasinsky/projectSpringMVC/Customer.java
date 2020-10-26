package sk.kosickaakademia.vasinsky.projectSpringMVC;

import sk.kosickaakademia.vasinsky.projectSpringMVC.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message="Is required")
    @Size(min=1, message="Is required")
    private String lastName;

    @NotNull(message="Is required")
    @Min(value = 0, message = "Must be greater or equal to 0")
    @Max(value = 10, message = "Must be less or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 characters/digits")
    private String postalCode;

    @CourseCode   //na upravu overovaneho slova ... (value="SLOVO", message="must start with SLOVO")
    private String courseCode;


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
