import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
        
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        
        for(int i = 2; i <= n; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        
        System.out.println(f3);
    } 
}
