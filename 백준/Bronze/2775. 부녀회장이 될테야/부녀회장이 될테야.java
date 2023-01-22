import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //일단, 몇층 몇호에 따른 사람 수를 나타내는 배열 하나 생성
         int[][] apartment = new int[15][15];
        
        //0층은 1, 2, 3, 4, 5로 초기화하고
        //i층의 1호는 모두 1로 초기화
        for(int i = 0; i < 15; i++) {
            apartment[0][i] = i;
            apartment[i][1] = 1;
        }
        
        //남은 층과 호수들은
        //i층의 직전 호와 j호의 아래층의 합으로 채운다.
        //1층부터 14층까지
        for(int i = 1; i < 15; i++) {
            //2호부터 14호까지
            for(int j = 2; j < 15; j++) {
                apartment[i][j] = apartment[i][j - 1] + apartment[i-1][j];
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        
        //테스트 케이스의 갯수 -> T
        int T = scanner.nextInt();
        
        for(int i = 0; i < T; i++) {
            //k층
            int k = scanner.nextInt();
            //n호
            int n = scanner.nextInt();
            System.out.println(apartment[k][n]);
        }
    }
}