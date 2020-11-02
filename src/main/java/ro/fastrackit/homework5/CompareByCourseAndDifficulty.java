package ro.fastrackit.homework5;

import java.util.Comparator;

public class CompareByCourseAndDifficulty implements Comparator<Assignment> {

    @Override
    public int compare(Assignment object1, Assignment object2) {
        int theCourseNumber = object1.getCourseNumber().compareTo(object2.getCourseNumber());
        if (theCourseNumber == 0) {
            // Strings are equal, sort by date
            return object1.getDifficultyLevel().compareTo(object2.getDifficultyLevel());
        }
        else {
            return theCourseNumber;
        }
    }
}
