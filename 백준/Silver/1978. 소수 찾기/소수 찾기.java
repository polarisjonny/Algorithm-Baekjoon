import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		String[] sArr = s.split(" ");
		
		int[] arr = new int[N];
		
		int numbers = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
			int result = isPrime(arr[i]);
			
			if(result == 1) {
				numbers++;
			}
		}
		
		System.out.println(numbers);
	}
	
	public static int isPrime(int num) {
		if(num == 1) {
			return 0;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		
		return 1;
	}
}