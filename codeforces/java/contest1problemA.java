import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double n = in.nextDouble();
		Double m = in.nextDouble();
		Double a = in.nextDouble();
		System.out.printf("%.0f\n", (Math.ceil(n/a)*Math.ceil(m/a)));
		in.close();
	}

}
