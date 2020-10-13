package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Professor {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    private Boolean isPhd;

    public Professor(String lastName, String firstName, LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    public static void main(String[] args) {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }
}
