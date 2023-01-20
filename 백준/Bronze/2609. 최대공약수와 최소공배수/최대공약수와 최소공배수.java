import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		int B = scanner.nextInt();
		
		//최대공약수 구하기
		int max = 0;
		
		for(int i = 1; i <= A && i <= B; i++) {
			if(A % i == 0 && B % i == 0) {
				max = i;
			}
		}
		
		int min = (A * B)/max;
		
		//최대공약수 출력
		System.out.println(max);
		
		//최소공배수 출력
		System.out.println(min);
		
	}

}
