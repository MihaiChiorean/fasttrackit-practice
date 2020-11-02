package ro.fastrackit.homework4;

public class Homework4 {
    public static void main(String[] args) {
        MethodsHandler factorial = new MethodsHandler(6, 0, Methods.FACTORIAL);
        MethodsHandler prime = new MethodsHandler(6, 0, Methods.PRIME);
        MethodsHandler palindrome = new MethodsHandler(1221, 0, Methods.PALINDROME);
        MethodsHandler allPrime = new MethodsHandler(10, 0, Methods.ALLPRIME);
        MethodsHandler allDays = new MethodsHandler(10, 1989, Methods.ALLDAYS);

        System.out.println("factorial:" + factorial.calculate());
        System.out.println("----");

        System.out.println("prime:" + prime.calculateAndReturnBoolean());
        System.out.println("----");

        System.out.println("palindrome:" + palindrome.calculate());
        System.out.println("----");

        System.out.println("allPrime:" + allPrime.calculateAndReturnString());
        System.out.println("----");

        System.out.println(allDays.calculateDaysOfAMont());
        System.out.println("----");
    }
}
