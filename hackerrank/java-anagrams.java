import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        int[] v = new int[50];
        int aSize = a.length();
        int bSize = b.length();
        int y = 0, x = 0;
        if (aSize != bSize) return false;
       
         
        for(int i = 0; i < aSize; i++){
            x = 0;
            for (int j = 0; j < bSize; j++) {
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j) && v[j] == 0){
                    x++;
                    v[j] = 1;
                    break;
                }
            }
            if (x > 0) y++;
        }
        
        return y == bSize;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
