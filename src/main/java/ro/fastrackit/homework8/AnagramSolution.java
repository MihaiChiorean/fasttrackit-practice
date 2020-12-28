package ro.fastrackit.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramSolution {

    static boolean isAnagram (String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

        char string1Chars[] = str1.toCharArray();
        char string2Chars[] = str2.toCharArray();

        Arrays.sort(string1Chars);
        Arrays.sort(string2Chars);

        int str1Length = str1.length();


        // Compare sorted strings
        for (int i = 0; i < str1Length; i++)
            if (string1Chars[i] != string2Chars[i])
                return false;

        return true;
    }

    public static void main(String[] args) throws InvalidAnagramException  {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : new InvalidAnagramException("Not Anagrams") );
    }
}
