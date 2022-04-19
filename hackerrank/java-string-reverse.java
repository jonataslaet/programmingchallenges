import java.util.*;

public class Solution {
    public static String isPalindrome(String A) {
        int size = A.length();
        String isPalindromeResult = "Yes";
        int x = 0;
        for (int i = size-1; i >= 0; i--) {
            if (A.charAt(i) != A.charAt(x)){
                isPalindromeResult = "No";
                break;
            }
            
            x++;
        }
        return isPalindromeResult;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        System.out.println(isPalindrome(A));
        sc.close();
    }
}