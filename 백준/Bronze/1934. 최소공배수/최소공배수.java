import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //T : 테스트케이스 갯수 받기
        int T = scanner.nextInt();
        
        //테스트케이스 갯수만큼 실행
        for(int i = 0; i < T; i++) {
            //A값 받기
            int A = scanner.nextInt();
            
            //B값 받기
            int B = scanner.nextInt();
            
            //최대공약수 먼저 구하기
            int max = 0;
            
            for(int j = 1; j <= A && j <= B; j++) {
                if(A % j == 0 && B % j == 0) {
                    max = j;
                }
            }
            
            //최소공배수 구하기
            int min = (A*B)/max;
            
            System.out.println(min);
        }
    }
}