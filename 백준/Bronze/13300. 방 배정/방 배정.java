import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//수학여행에 참가하는 총 학생수
		int N = scanner.nextInt();
		
		//한반에 배정될 수 있는 학생수
		int K = scanner.nextInt();
		
		int[][] students = new int[7][2];
		
		for(int i = 0; i < N; i++) {
			int gender = scanner.nextInt();
			
			//여학생인 경우
			if(gender == 0) students[scanner.nextInt()][0]++;
			
			
			//남학생인 경우
			else if(gender == 1) students[scanner.nextInt()][1]++;
		}
		
		int room = 0;
		
		//여학생 분리
		for(int i = 1; i < 7; i++) {
			if(students[i][0] == 0) continue;
			
			else if(students[i][0] <= K) room++;
			
			else if(students[i][0] % K == 0) room += students[i][0] / K;
			
			else if(students[i][0] % K != 0) {
				room += students[i][0] / K;
				room++;
			}
			
		}
		
		//남학생 분리
		for(int i = 1; i < 7; i++) {
			if(students[i][1] == 0) continue;
			
			else if(students[i][1] <= K) room++;
			
			else if(students[i][1] % K == 0) room += students[i][1] / K;
			
			else if(students[i][1] % K != 0) {
				room += students[i][1] / K;
				room++;
			}
		}
		
		System.out.println(room);
	}
}