import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //N을 받기
        int N = scanner.nextInt();
        
        //최소 루트의 수
        int count = 1;
        
        //범위
        int range = 2;
        
        if(N == 1) {
            System.out.println(1);
        }
        else {
            while(range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}