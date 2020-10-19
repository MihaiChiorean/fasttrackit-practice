package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Professor implements Human {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    private Boolean isPhd;
    private ProfessorType type;

    public Professor(String lastName, String firstName, LocalDate dateOfBirth, Boolean isPhd) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.isPhd = isPhd;
    }

    public static void main(String[] args) {

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }

    public void isPhd() {
        System.out.println("isPhd from Professor class");
    }

    @Override
    public ProfessorType getType(){
        return type;
    }
}
