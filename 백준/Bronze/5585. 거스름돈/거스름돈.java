import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] coins = {500, 100, 50, 10, 5, 1};

        int bill = 1000;

        int payMoney = scanner.nextInt();

        int change = bill - payMoney;

        int count = 0;

        for(int i = 0; i < coins.length; i++) {

                count += change / coins[i];

                change = change % coins[i];
        }
        System.out.println(count);
    }
}