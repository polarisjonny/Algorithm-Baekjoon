import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int[] numbers = {A, B, C};
        
        Arrays.sort(numbers);
        
        System.out.println(numbers[1]);
    }
    
}