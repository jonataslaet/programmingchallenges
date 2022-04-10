import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if ((isOdd(N)) || (!isOdd(N) && isBetween(N, 6, 20))){
            System.out.println("Weird");
        }
        
        if ((!isOdd(N) && isBetween(N, 2, 5)) || (!isOdd(N) && N > 20)){
            System.out.println("Not Weird");
        }
        
        scanner.close();
    }
    
    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    
    private static boolean isBetween(int number, int l, int r){
        return number >= l && number <= r;
    }
}
