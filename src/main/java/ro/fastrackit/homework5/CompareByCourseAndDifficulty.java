package ro.fastrackit.homework5;

import java.util.Comparator;
import java.util.Arrays;

public class CompareByCourseAndDifficulty implements Comparator<Assignment> {
    public Integer returnDifficultyLevel(String level) {
        Integer a = new Integer(Arrays.asList("easy", "medium", "hard").indexOf(level));
        return a;
    }

    @Override
    public int compare(Assignment object1, Assignment object2) {
        int theCourseNumber = object1.getCourseNumber().compareTo(object2.getCourseNumber());
        if (theCourseNumber == 0) {
            // Strings are equal, sort by date
            return returnDifficultyLevel(object1.getDifficultyLevel()).compareTo(returnDifficultyLevel(object2.getDifficultyLevel()));
        }
        else {
            return theCourseNumber;
        }
    }
}
