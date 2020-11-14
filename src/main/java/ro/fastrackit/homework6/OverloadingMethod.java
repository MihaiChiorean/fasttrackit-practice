package ro.fastrackit.homework6;

public class OverloadingMethod {

    public static void main(String[] args) {
        printAnything(5);
        printAnything(123123L);
        printAnything(new Long(43242L));
        printAnything("some string");
        printAnything(1.0);
        printAnything(new Object());
        printAnything(new int[] {1, 8, 1989});
        printAnything(new long[] {1L, 8L, 1989L});
    }

    static void printAnything(int intValue) {
        System.out.println("This is int: " + intValue);
    }

    static void printAnything(long longValue) {
        System.out.println("This is long: " + longValue);
    }

    static void printAnything(Long longWrapperValue) {
        System.out.println("This is Long wrapper class: " + longWrapperValue);
    }

    static void printAnything(String stringValue) {
        System.out.println("This is String: " + stringValue);
    }

    static void printAnything(Double doubleValue) {
        System.out.println("This is Double: " + doubleValue);
    }

    static void printAnything(Object objectValue) {
        System.out.println("This is Object: " + objectValue);
    }

    static void printAnything(int[] arrayValue) {
        System.out.println("This is int[] values: " + arrayValue);
        for (int i : arrayValue) {
            System.out.println(i);
        }
    }

    static void printAnything(long[] longArrayValue) {
        System.out.println("This is long[] values: " + longArrayValue);
        for (long i : longArrayValue) {
            System.out.println(i);
        }
    }
}
