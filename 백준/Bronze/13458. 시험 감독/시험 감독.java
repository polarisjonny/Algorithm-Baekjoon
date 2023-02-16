import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//시험장의 갯수
		int N = scanner.nextInt();
		
		//각 시험장의 응시자 수
		long[] A = new long[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = scanner.nextLong();
		}
		
		//총감독이 감시할 수 있는 인원 수
		long B = scanner.nextLong();
		
		//부감독이 감시할 수 있는 인원 수
		long C = scanner.nextLong();
		
		
		//필요한 부감독관 수
		long count = 0;
		
		for(int i = 0; i < A.length; i++) {
			long result = 0;
			
			if(A[i] <= B) {
				count++;
				continue;
			}
			
			else {
				count++;
				A[i] -= B;
				
				if(A[i] % C == 0) {
					count += A[i]/C;
				}
				else if(A[i] % C != 0) {
					count += A[i]/C+1;
				}
			}
		}
		System.out.println(count);

	}
}
