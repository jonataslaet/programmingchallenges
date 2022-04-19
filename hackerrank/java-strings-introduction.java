import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String formatedA = A.substring(0, 1).toUpperCase()+A.substring(1);
        String formatedB = B.substring(0, 1).toUpperCase()+B.substring(1);
        Integer sumOfAndBLengths = A.length() + B.length();
        String aGreaterThanb = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(sumOfAndBLengths);
        System.out.println(aGreaterThanb);
        System.out.println(formatedA + " " + formatedB);
        sc.close();
    }
}



