package ro.fastrackit.homework4;

public class Homework4 {
    public static void main(String[] args) {
        MethodsHandler factorial = new MethodsHandler(6, Methods.FACTORIAL);
        MethodsHandler prime = new MethodsHandler(6, Methods.PRIME);
        MethodsHandler palindrome = new MethodsHandler(5, Methods.PALINDROME);
        MethodsHandler allPrime = new MethodsHandler(5, Methods.ALLPRIME);

        System.out.printf("factorial:" + factorial.calculate());
        System.out.printf("prime:" + prime.calculateAndReturnBoolean());
    }
}
