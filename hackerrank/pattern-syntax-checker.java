import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    static void isValidRegex(String regex) {
        PatternSyntaxException patternSyntaxException = null;
        try {
            Pattern.compile(regex);
        } catch (PatternSyntaxException exception) {
            patternSyntaxException = exception;
        }
        if (patternSyntaxException != null) System.out.println("Invalid");
        else System.out.println("Valid");
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0 && in.hasNextLine()){
			String pattern = in.nextLine();
          	isValidRegex(pattern);
		}
        in.close();
	}
}
