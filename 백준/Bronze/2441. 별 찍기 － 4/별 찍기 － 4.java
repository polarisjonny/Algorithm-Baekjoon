import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for(int i = 0; i < N; i++) {
            for(int j = N - i; j < N; j++) {
                System.out.print(" ");
            }
            for(int k = i; k < N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}