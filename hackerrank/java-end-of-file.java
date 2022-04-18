import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int i = 0;
            while(in.ready()) {
                String phrase = in.readLine().trim();
                System.out.println((++i) + " " + phrase);
            }
        } catch(Exception e) {
            
        }
    }
}