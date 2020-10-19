package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Student implements Human{
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private Float grade;
    private Boolean finishedClass;
    private StudentType type;

    public Student(String lastName, String firstName, LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
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

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Boolean getFinishedClass() {
        return finishedClass;
    }

    public void setFinishedClass(Boolean finishedClass) {
        this.finishedClass = finishedClass;
    }

    @Override
    public StudentType getType(){
        return type;
    }

}
