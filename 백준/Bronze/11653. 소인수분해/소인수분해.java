import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for(int i = 2; i <= N; i++) {
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
    }
}