
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = 0;
		String sentence = "";
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sentence = br.readLine();
			String[] words = sentence.split(" ");
			StringBuilder sb = new StringBuilder();
			
			for(String s : words) {
				StringBuilder reverse = new StringBuilder(s);
				sb.append(reverse.reverse());
				sb.append(' ');
			}
			
			System.out.println(sb);
		}
		
		br.close();
	}
}
