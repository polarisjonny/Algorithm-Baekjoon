import java.util.*;

public class Main {
    public static int[] d;
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         d = new int[1001];
        
        int n = scanner.nextInt();
        
        System.out.println(dp(n));
    }
    
    public static int dp(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        
        if(d[n] != 0) return d[n];
        
        return d[n] = (dp(n-1) + 2 * dp(n - 2)) % 10007;
    }
}