//Fonte: https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        String xstring = String.valueOf(x);
        String reverseXString = reverse(xstring); 
        
        return xstring.equalsIgnoreCase(reverseXString);
    }
    
    public static String reverse(String input){
    char[] in = input.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
    }
    return new String(in);
    }
}