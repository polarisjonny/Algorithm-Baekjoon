
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String emoji = scanner.next();
		
		int result = 0;
		int colon = 0;
		int underbar = 0;
		
		for(int i = 0; i < emoji.length(); i++) {
			if(emoji.charAt(i) == ':') {
				colon++;
			}
			else if(emoji.charAt(i) == '_') {
				underbar++;
			}
		}
		
		result = emoji.length() + colon + (underbar * 5);
		
		System.out.println(result);
	}

}