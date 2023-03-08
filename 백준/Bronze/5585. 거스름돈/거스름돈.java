import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //거스름돈
        int change = 1000 - scanner.nextInt();
        
        //동전의 갯수
        int count = 0;
        
        //동전 배열
        int[] coins = {500, 100, 50, 10, 5, 1};
        
        for(int i = 0; i < coins.length; i++) {
            if(change % coins[i] >= 0) {
                count += change/coins[i];
                change = change % coins[i];
            }
        }
        System.out.println(count);
    }
}