import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		String[] A_ = s.split(" ");
		
		int[] A = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(A_[i]);
		}
		
		Arrays.sort(A);
		
		
		int M = Integer.parseInt(br.readLine());
		
		String m = br.readLine();
		
		String[] mString = m.split(" ");
		
		int[] MNumber = new int[M];
		
		
		for(int i = 0; i < M; i++) {
			MNumber[i] = Integer.parseInt(mString[i]);
		}
		
		
		
		for(int i = 0; i < M; i++) {
			System.out.println(binarySearch(A, MNumber[i]));
		}
		
	
		
		
		
		
		
	}
	
	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		
		int high = arr.length - 1;
		
		int middle = 0;
		
		while(low <= high) {
			middle = (low+high) / 2;
			if(arr[middle] == num) return 1;
			
			else if(arr[middle] > num) {
				high = middle - 1;
			}
			else if(arr[middle] < num) {
				low = middle + 1;
			}
		}
		
		return 0;
	}
}
