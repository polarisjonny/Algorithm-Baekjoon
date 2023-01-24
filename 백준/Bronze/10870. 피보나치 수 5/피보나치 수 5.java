import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int answer = fibonacci(n);
        
        System.out.println(answer);
    }
    
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}