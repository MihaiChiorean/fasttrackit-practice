package ro.fastrackit.homework10;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList();

        // Array list with integer values
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);

        // Print the array
        System.out.println("The array: "+ a);
        int result = Result.pickingNumbers(a);
        System.out.println("Maximum length: " + result);

    }
}
