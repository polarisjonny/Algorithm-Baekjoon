import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] mushrooms = new int[10];
		
		int score = 0;
		
		for(int i = 0; i < mushrooms.length; i++) {
			mushrooms[i] = scanner.nextInt();
			
		}
		
		for(int i = 0; i < mushrooms.length; i++) {
			score += mushrooms[i];
			
			if(Math.abs((score-mushrooms[i]) - 100) < score - 100) {
				score  -= mushrooms[i];
				break;
			}
		}
		System.out.println(score);
		
    }		
}