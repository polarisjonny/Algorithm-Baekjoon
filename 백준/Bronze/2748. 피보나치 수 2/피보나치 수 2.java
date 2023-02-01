import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        long[] fibonacci = new long[91];
        
        fibonacci[0] = 0;
        
        fibonacci[1] = 1;
        
        for(int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(fibonacci[N]);
    }
}