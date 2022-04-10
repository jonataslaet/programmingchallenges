import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        Long maxSumLastFour = 0L;
        Long maxSumFirstFour = 0L;
        
        Integer arrLength = arr.size();
        Integer j = arrLength - 4;
        for (int i = 0; i < arrLength; i++) {
            if (i < 4) {
                maxSumFirstFour += arr.get(i);
            }
            if (j < arrLength){
                maxSumLastFour += arr.get(j);
            }
            j++;
        }
        
        System.out.println(maxSumFirstFour + " " + maxSumLastFour);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
