import java.util.*;

class Main {
    public static int[] d;
    
    public static void main(String[] args) {
        d = new int[1001];
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(dp(n));
    }
    
    public static int dp(int x) {
        if(x == 1) return 1;
        if(x == 2) return 2;
        
        if(d[x] != 0) return d[x];
        
        return d[x] = (dp(x - 1) + dp(x - 2)) % 10007;
    }
}