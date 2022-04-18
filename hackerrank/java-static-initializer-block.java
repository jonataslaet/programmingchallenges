import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B, H;
static boolean flag = initializeClassVariable();
        
static boolean initializeClassVariable() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
        B = Integer.parseInt(bufferedReader.readLine().trim());
        H = Integer.parseInt(bufferedReader.readLine().trim());
        boolean r = B > 0 && H > 0;
        if (!r) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            throw new Exception();
        }
    } catch(Exception e) {
        e.printStackTrace();
    }
    return B > 0 && H > 0;
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

