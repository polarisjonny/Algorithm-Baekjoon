import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        
        if(n1 > n2) {
            System.out.println(n1 - n2 - 1);
            for(long i = n2+1; i < n1; i++) {
                System.out.print(i+" ");
            }
        }
        
        if(n2 > n1) {
            System.out.println(n2 - n1 - 1);
            for(long i = n1 + 1; i < n2; i++) {
                System.out.print(i+" ");
            }
        }
        
        if(n1 == n2) {
            System.out.println(0);
        }
        
    }
}