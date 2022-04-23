import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String regex = "\\s*[ !,?._'@]+";
        String[] tokens = s.trim().split(regex);
        System.out.println(s.trim().length() > 0 ? tokens.length : 0);
        for (String string : tokens) {
            System.out.println(string);
        }
        scan.close();
    }
}

