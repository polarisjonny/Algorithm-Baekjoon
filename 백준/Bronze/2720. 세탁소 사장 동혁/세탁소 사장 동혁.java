import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int T = scanner.nextInt();

       int quarter = 25;

       int dime = 10;

       int nickel = 5;
        
        
       int penny = 1;

       StringBuilder sb = new StringBuilder();


       for(int i = 0; i < T; i++) {
           int money = scanner.nextInt();
            sb.append(money / quarter + " ");
            money %= quarter;

            sb.append(money / dime + " ");
            money %= dime;

            sb.append(money / nickel + " ");
            money %= nickel;

            sb.append(money / penny + "\n");
       }
       System.out.println(sb);
    }
}