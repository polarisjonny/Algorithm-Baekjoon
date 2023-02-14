import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] grades = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < grades.length; i++) {
			grades[i] = scanner.nextInt();
			
			if(grades[i] < 40) {
				grades[i] = 40;
			}
			
			sum += grades[i];
		}
		
		int average = sum / 5;
		
		System.out.println(average);
		
		
	}
}