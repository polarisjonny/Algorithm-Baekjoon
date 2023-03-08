import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		
		String answer = "";
		
		
		for(char c : word.toCharArray()) {
			answer += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
		}
		
		System.out.println(answer);
	}

}
