package ro.fastrackit.homework11;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Number: 248
        String romanNumber = "CCXLVII";
        System.out.println(romanToInt(romanNumber));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int theNumber = 0;
        int strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                System.out.println("Litera: " + s.charAt(i) + "  cu valoarea: " + map.get(s.charAt(i)));
                System.out.println(" - ");
                System.out.println("Minus de 2 ori Litera precedenta: " + s.charAt(i-1) + "   adica: -" + 2 * map.get(s.charAt(i-1)));

                theNumber += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));

                System.out.println(" + ");
            } else {
                theNumber += map.get(s.charAt(i));

                System.out.println("Litera: " + s.charAt(i) + "  cu valoarea: " + map.get(s.charAt(i)));
                System.out.println("+");
            }
        }
        System.out.println("===========");
        return theNumber;
    };
}
