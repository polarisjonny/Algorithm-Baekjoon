import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextLong();
		
		long B = scanner.nextLong();
		
		long result = (A+B)*(A-B);
		
		System.out.println(result);
	}
}
