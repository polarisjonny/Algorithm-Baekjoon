import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//가지고 있는 바구니의 갯수
		int N = scanner.nextInt();
		
        int[] baskets = new int[N];
        
        
		//M번 공을 넣으려고 함
		int M = scanner.nextInt();
		
		for(int i = 0; i < M; i++) {
            int I = scanner.nextInt();
            
            int j = scanner.nextInt();
            
            int k = scanner.nextInt();
            
            for(int x = I-1; x < j; x++) {
                baskets[x] = k;
            }
        }
        
        for(int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i]+" ");
        }
	}
}