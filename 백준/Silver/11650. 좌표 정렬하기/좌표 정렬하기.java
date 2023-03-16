import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//좌표를 x좌표가 증가하는 순으로,
		//x좌표가 같으면 y좌표가 증가하는 순서로 정렬하기 
		
		int N = scanner.nextInt();
		
		int[][] array = new int[N][2];
		
		
		
		for(int i = 0;i < N; i++) {
			array[i][0] = scanner.nextInt();
			array[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(array, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(array[i][0]+ " "+array[i][1]);
		}
	}
}