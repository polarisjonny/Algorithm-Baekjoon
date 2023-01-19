import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int result = divide(N);
        
        System.out.println(result);
    }
    
    public static int divide(int number) {
        int result = 0;
        
        for(int i = 0; i < number; i++) {
            int num = i;
            int sum = 0;
            
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            
            if(sum + i == number) {
                result = i;
                break;
            }
        }
        return result;
    }
}