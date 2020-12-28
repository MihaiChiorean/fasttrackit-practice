package ro.fastrackit.homework8;

import java.util.Scanner;

public class CalculatorSolution {
    public static MyCalculator my_calculator = new MyCalculator();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int p = scan.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
