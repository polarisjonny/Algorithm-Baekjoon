
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] sticks = new int[N];
		
		
		for(int i = 0; i < sticks.length; i++) {
			sticks[i] = scanner.nextInt();
		}
		
		int count = 1;
		
		int maxStick = sticks[sticks.length - 1];
		
		for(int i = sticks.length - 2; i >= 0; i--) {
			if(sticks[i] > maxStick) {
				count++;
				maxStick = sticks[i];
			}
		}
		
		System.out.println(count);
		
		scanner.close();
		
		
		
	}

}