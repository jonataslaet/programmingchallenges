import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String substring = s.substring(0, k);
        int size = s.length();
        
        if (size > k){
            size -= (k-1);
            int i = 0;
            while(substring.length() == k && i < size) {
                substring = s.substring(i, k+i);
                if (substring.compareTo(smallest) < 0){
                    smallest = substring;
                }
                if (substring.compareTo(largest) > 0){
                    largest = substring;
                }
                i++;
            }
        }
        
        return smallest + "\n" + largest;
    }

