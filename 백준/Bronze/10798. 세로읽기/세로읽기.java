import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char[][] characters =  new char[5][15];
		
		for(int i =0; i < characters.length; i++) {
			String word = br.readLine();
			
			for(int j = 0; j < word.length();j++) {
				characters[i][j] = word.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(characters[j][i]==' ' || characters[j][i] == '\0') {
					continue;
				}
				System.out.print(characters[j][i]);
			}
		}
		
		
	}
}
