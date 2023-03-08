import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        int A = 0;
        
        int B = 0;
        
        int C = 0;
        
        if(T % 10 != 0) {
            System.out.println(-1);
        }
        else {
            A = T / 300;
            T = T % 300;
            
            B = T / 60;
            T = T % 60;
            
            C = T / 10;
            
            System.out.println(A+" "+B+" "+C);
        }
    }
}