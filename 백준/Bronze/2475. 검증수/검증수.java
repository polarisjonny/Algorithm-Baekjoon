import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]*numbers[i];
        }
        
        int result = sum % 10;
        
        System.out.println(result);
    }
}