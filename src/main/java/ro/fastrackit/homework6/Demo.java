package ro.fastrackit.homework6;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        ArrayList<Assignment> coursesList = new ArrayList<>();
        coursesList.add(homework1);
        coursesList.add(homework2);
        coursesList.add(homework3);
        coursesList.add(homework4);
        coursesList.add(homework5);


        System.out.println("Print 6.1.1");
        List<UUID> listOfAssignments= coursesList
                .stream()
                .map(each -> each.getUniqueId())
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Print 6.1.2");
        List<Assignment> filteredList = coursesList
        .stream()
        .filter(each -> each.getDifficultyLevel().equals("easy") || each.getDifficultyLevel().equals("medium"))
        .peek(System.out::println)
        .collect(Collectors.toList());

//        System.out.println("Print 6.1.3");
//        List<Assignment> theList = coursesList
//                .stream()
//                .map(Function.identity())
//                .collect(Collectors.toMap(Function.identity()));
//
//        for (Map.Entry<UUID, Assignment> i : theList.entrySet()) {
//            System.out.println(i.getKey(), i.getValue());
//        }


        System.out.println("Print 6.3");
        WordCount theSentence = new WordCount("The quick brown fox jumps over the lazy dog .");
        System.out.println("Number of words in the sentence: " + theSentence.wordNumber());

        System.out.println("Print 6.4");
        PascalSolution numberOfRows = new PascalSolution(5);
        numberOfRows.displayTheTriangle();
    }
}
