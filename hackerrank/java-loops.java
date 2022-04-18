import java.util.*;

class Solution{
    
    public static void showResult(int a, int b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
               sum += (1 << j);
            }
            System.out.print((a + b * sum) + " ");
            sum = 0;
        }
        System.out.println();
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            showResult(a, b, n);
        }
        in.close();
    }
}