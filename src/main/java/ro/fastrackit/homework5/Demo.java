package ro.fastrackit.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        Assignment homework1 = new Assignment(
                2,
                "Homework1",
                "Basic IT Concepts",
                "medium"
        );

        Assignment homework2 = new Assignment(
                2,
                "Homework2",
                "Everything is an Object",
                "easy"
        );

        Assignment homework3 = new Assignment(
                3,
                "Homework3",
                "Scope, Abstraction, Inheritance, Polymorphism, Operators",
                "medium"
        );

        Assignment homework4 = new Assignment(
                5,
                "Homework4",
                "Class types, Operators, Loops",
                "hard"
        );

        Assignment homework5 = new Assignment(
                5,
                "Homework5",
                "Default methods, Collections, Maps, Comparing",
                "medium"
        );

        // 2
        ArrayList<Assignment> coursesList = new ArrayList<>();
        coursesList.add(homework1);
        coursesList.add(homework2);
        coursesList.add(homework3);
        coursesList.add(homework4);
        coursesList.add(homework5);
//        System.out.println(coursesList);


        //3
        CompareByCourseAndDifficulty comparator1 = new CompareByCourseAndDifficulty();
        TreeSet<Assignment> byDifficulty = new TreeSet<>(comparator1);

        byDifficulty.add(homework1);
        byDifficulty.add(homework2);
        byDifficulty.add(homework3);
        byDifficulty.add(homework4);
        byDifficulty.add(homework5);
//        System.out.println(byDifficulty);


        //4
        CompareByCourseAndAssignment comparator2 = new CompareByCourseAndAssignment();
        TreeSet<Assignment> byAssignment = new TreeSet<>(comparator2);

        byAssignment.add(homework1);
        byAssignment.add(homework2);
        byAssignment.add(homework3);
        byAssignment.add(homework4);
        byAssignment.add(homework5);
//        System.out.println(byAssignment);

        //5
        HashMap<String, Assignment> newCollection = new HashMap<>();
        newCollection.put(homework1.getCourseNumber() + homework1.getDifficultyLevel(), homework1);
        newCollection.put(homework2.getCourseNumber() + homework2.getDifficultyLevel(), homework2);
        newCollection.put(homework3.getCourseNumber() + homework3.getDifficultyLevel(), homework3);
        newCollection.put(homework4.getCourseNumber() + homework4.getDifficultyLevel(), homework4);
        newCollection.put(homework5.getCourseNumber() + homework5.getDifficultyLevel(), homework5);
//        System.out.println(newCollection);

    }

}
