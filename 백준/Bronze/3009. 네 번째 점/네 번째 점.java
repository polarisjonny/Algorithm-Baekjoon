import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int lastX = 0;
		int lastY = 0;
		
		int[] firstCoordinate = {scanner.nextInt(), scanner.nextInt()};
		int[] secondCoordinate = {scanner.nextInt(), scanner.nextInt()};
		int[] thirdCoordinate = {scanner.nextInt(), scanner.nextInt()};
		
		//첫번째, 두번째 x좌표가 같을 때 3번째 좌표가 라스트 x
		if(firstCoordinate[0] == secondCoordinate[0]) {
			lastX = thirdCoordinate[0];
		}
		
		else if(firstCoordinate[0] == thirdCoordinate[0]) {
			lastX = secondCoordinate[0];
		}
		
		else {
			lastX = firstCoordinate[0];
		}
		
		//y좌표일때
		if(firstCoordinate[1] == secondCoordinate[1]) {
			lastY = thirdCoordinate[1];
		}
		else if(firstCoordinate[1] == thirdCoordinate[1]) {
			lastY = secondCoordinate[1];
		}
		else {
			lastY = firstCoordinate[1];
		}
		
		System.out.println(lastX+" "+lastY);
	}

}