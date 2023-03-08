import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//N개의 바구니
		int N = scanner.nextInt();
		
		//M번 반복
		int M = scanner.nextInt();
		
		int[] baskets = new int[N+1];
		
		int temp = 0;
		
		for(int i = 1; i <= N; i++) {
			baskets[i] = i;
		}
		
		for(int k = 0; k < M; k++) {
			int i = scanner.nextInt();
			
			int j = scanner.nextInt();
			
			temp = baskets[i];
			
			
			baskets[i] = baskets[j];
			
			baskets[j] = temp;
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.print(baskets[i]+" ");
		}
	}
}    