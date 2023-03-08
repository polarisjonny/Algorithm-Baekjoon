import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double nD = (double)n;
		
		double revolution = (double)(nD / 4);
		
		System.out.println(revolution);
	}

}
