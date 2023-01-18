import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//문자를 받는다...
		String dial = scanner.nextLine();
		
		//시간을 표시할 변수
		int time = 0;
		
		
		for(int i = 0; i < dial.length();i++) {
			//문자에 따라 케이스를 입력받는다
			switch(dial.charAt(i)) {
			case 'A' : case 'B' : case 'C' : 
				time += 3;
				break;
			case 'D' : case 'E' : case 'F' :
				time += 4;
				break;
			case 'G' : case 'H' : case 'I' : 
				time += 5;
				break;
			case 'J' : case 'K' : case 'L' : 
				time += 6;
				break;
			case 'M' : case 'N' : case 'O' : 
				time += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' : 
				time += 8;
				break;
			case 'T' : case 'U' : case 'V' :
				time += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' : 
				time += 10;
				break;
			}
		}
		
		System.out.println(time);
	}

}
