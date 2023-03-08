import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int K = scanner.nextInt();
        
        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
    }
    
    public static int factorial(int N) {
        int i = 1;
        for(int j = 1; j <= N; j++) {
            i *= j;
        }
        return i;
    }
}