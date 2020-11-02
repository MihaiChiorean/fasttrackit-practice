package ro.fastrackit.homework5;

import java.util.Comparator;

public class CompareByCourseAndAssignment implements Comparator<Assignment> {
    @Override
    public int compare(Assignment object1, Assignment object2) {
        int theCourseNumber = object1.getCourseNumber().compareTo(object2.getCourseNumber());
        if (theCourseNumber == 0) {
            // Strings are equal, sort by date
            return object1.getAssignmentTitle().compareTo(object2.getAssignmentTitle());
        }
        else {
            return theCourseNumber;
        }
    }
}
