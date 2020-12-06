package ro.fastrackit.homework7;

import ro.fastrackit.classroom.Human;
import ro.fastrackit.classroom.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {
        List<? extends Human> theHumans = createStudentList();
        System.out.println(theHumans);
    }


    static List<Student> createStudentList () {
        ArrayList<Student> theList = new ArrayList<>();
        Student first = new Student("Razvan", "Matei", LocalDate.of(1986,07,23));
        Student second = new Student("Sfat", "Andrei", LocalDate.of(1989,12,31));
        Student third = new Student("Rares", "Roman", LocalDate.of(1953,03,14));
        theList.add(first);
        theList.add(second);
        theList.add(third);

        return theList;
    }
}
