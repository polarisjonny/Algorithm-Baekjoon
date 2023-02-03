import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            int A = scanner.nextInt();
            
            int B = scanner.nextInt();
            
            if(A == 0 && B == 0) {
                break;
            }
            
            String result = A > B ? "Yes" : "No";
            
            System.out.println(result);
        }
    }
}