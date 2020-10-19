package ro.fastrackit.classroom;

import java.time.LocalDate;

public class PhdProfessor extends Professor {


    public PhdProfessor(String lastName, String firstName, LocalDate dateOfBirth, Boolean isPhd) {
        super(lastName, firstName, dateOfBirth, isPhd);
    }


    public static void main(String args[]) {
        LocalDate theDate = LocalDate.of(1989, 8, 1);
        PhdProfessor profuDeMecanica = new PhdProfessor("Ioan", "Veselie", theDate ,true);
        profuDeMecanica.isPhd();
    }

    @Override
    public void isPhd() {
        System.out.println("isPhd from PhdProfessor class");
    }
}

