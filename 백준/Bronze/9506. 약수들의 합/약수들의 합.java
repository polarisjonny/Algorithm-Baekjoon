import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int N = scanner.nextInt();
			
			if(N == -1) break;
			
			ArrayList<Integer> measure = new ArrayList<>();
			
			for(int i = 1; i <= N; i++) {
				if(N % i == 0) {
					if(i == N) {
						break;
					}
					measure.add(i);
					
				}
			}
			
			Collections.sort(measure);
			
			int sum = 0;
			
			for(int i = 0; i < measure.size(); i++) {
				sum += measure.get(i);
			}
			
			if(sum == N) {
				System.out.print(N+" = 1");
				for(int i = 1; i < measure.size(); i++) {
					System.out.print(" + "+measure.get(i));
				}
				System.out.println();
			}
			else {
				System.out.printf("%d is NOT perfect.\n", N);
			}
		}
	}
}