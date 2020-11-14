package ro.fastrackit.homework6;

public class WordCount {
    private static String theValue;

    WordCount(String theValue) {
        this.theValue = theValue;
    }

    public static int wordNumber() {
        int wordNumber = 0;
        String[] words = theValue.split(" ");
        for (String word : words) {
            if(word.length() > 1) {
                wordNumber++;
            }
        }
        return wordNumber;
    }
}
