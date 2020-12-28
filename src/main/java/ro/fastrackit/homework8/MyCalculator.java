package ro.fastrackit.homework8;

public class MyCalculator{
    public static double power(int a, int b) throws Exception {
        if(a < 0 || b < 0) {
            throw new Exception("Numbers should not be negative");
        }
        if(a == 0 || b == 0) {
            throw new Exception("Numbers should not be 0");
        }
        return Math.pow(a,b);
    };
}
