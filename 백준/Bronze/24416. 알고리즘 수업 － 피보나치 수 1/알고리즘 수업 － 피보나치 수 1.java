import java.util.Scanner;

public class Main {
	
	static int count = 0;;
	static int count2 = 0;
	static int[] memo;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		memo = new int[N + 1];
		//재귀호출
		fibonacci(N);
		//동적프로그래밍
		fib(N);
		System.out.println(count2+" "+count);
	}
	
	public static int fib(int n) {
		memo[1] = memo[2] = 1;
		for(int i = 3; i <= n; i++) {
			count++;
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			count2++;
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}