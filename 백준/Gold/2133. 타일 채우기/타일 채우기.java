import java.util.*;

public class Main {
    public static int[] d;
    
    public static void main(String[] args) {
        d = new int[1001];
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(dp(n));
    }
    
    public static int dp(int x) {
        if(x == 0) return 1;
        if(x == 1) return 0;
        if(x == 2) return 3;
        
        if(d[x] != 0) return d[x];
        
        int result = 3 * dp(x - 2);
        
        for(int i = 3; i <= x; i++) {
            if(i % 2 == 0) {
                result += 2 * dp(x-i);
            }
        }
        
        return d[x] = result;
    }
}