import java.util.Scanner;
import java.util.HashMap;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//문자열의 길이
		int L = scanner.nextInt();
		
		//문자열이 들어옴
		String str = scanner.next();
		
		//문자의 정보를 넣어주는 해시 함수 선언
		HashMap<Character, Integer> alphabets = new HashMap<>();
		
		alphabets.put('a', 1);
		alphabets.put('b', 2);
		alphabets.put('c', 3);
		alphabets.put('d', 4);
		alphabets.put('e', 5);
		alphabets.put('f', 6);
		alphabets.put('g', 7);
		alphabets.put('h', 8);
		alphabets.put('i', 9);
		alphabets.put('j', 10);
		alphabets.put('k', 11);
		alphabets.put('l', 12);
		alphabets.put('m', 13);
		alphabets.put('n', 14);
		alphabets.put('o', 15);
		alphabets.put('p', 16);
		alphabets.put('q', 17);
		alphabets.put('r', 18);
		alphabets.put('s', 19);
		alphabets.put('t', 20);
		alphabets.put('u', 21);
		alphabets.put('v', 22);
		alphabets.put('w', 23);
		alphabets.put('x', 24);
		alphabets.put('y', 25);
		alphabets.put('z', 26);
		
		//문자열을 char배열로 변환해준다
		char[] chArr = str.toCharArray();
		
		//값을 저장할 변수
		long result = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			int x = alphabets.get(chArr[i]);
			
			result += x * (int)(Math.pow(31, i));
		}
		
		System.out.println(result);
		
		
		
	}
}
