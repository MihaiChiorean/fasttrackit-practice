package ro.fastrackit.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(ArrayList<Integer> a) {
        AtomicInteger longestArray = new AtomicInteger(0);
        int result = longestArray.intValue();
        // Write your code here
        a.forEach(eachNumber -> {
            List<Integer> x = a.stream().filter(each -> eachNumber - each <= 1).collect(Collectors.toList());
            if(x.size() > result) {
                longestArray.set(x.size());
            }
        });
        return longestArray.intValue();
    };
}
