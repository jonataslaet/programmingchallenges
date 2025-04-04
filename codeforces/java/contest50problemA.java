import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		Integer m = in.nextInt();
		Integer x = n*m;
		System.out.println(x % 2 == 0 ? x/2:(x-1)/2);
		in.close();
	}

}
