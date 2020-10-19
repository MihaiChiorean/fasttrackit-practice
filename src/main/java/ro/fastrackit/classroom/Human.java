package ro.fastrackit.classroom;

import java.time.LocalDate;

public interface Human {

     String getLastName();

     String getFirstName();

     String getEmailAddress();

     LocalDate getDateOfBirth();

     ScholarType getType();
}
