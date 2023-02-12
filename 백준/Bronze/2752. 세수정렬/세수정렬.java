import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers [i] = scanner.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.printf("%d %d %d", numbers[0], numbers[1], numbers[2]);
	}

}
