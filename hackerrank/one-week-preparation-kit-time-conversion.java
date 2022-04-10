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

    public static String timeConversion(String s) {
        String hh1 = s.substring(0,2);
        String t = s.substring(8,10);
        
        Integer intHH1 = Integer.valueOf(hh1);
        
        if (t.equalsIgnoreCase("AM")){
            if (intHH1 == 12) {
                return "00:" + s.substring(3,8);
            }
            else {
                return s.substring(0,8);
            }
        } else {
            if (intHH1 == 12) {
                return s.substring(0,8);
            }
            else {
                return String.valueOf(intHH1+12) +":" + s.substring(3,8);
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
