import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int A = scanner.nextInt();
			
			int B = scanner.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			
			//약수의 관계일 때
			if(B % A == 0) {
				System.out.println("factor");
			}
			//배수의 관계일 때
			else if(A % B == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
	}

}
