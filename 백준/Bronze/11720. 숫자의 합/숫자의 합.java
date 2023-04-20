import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String s = scanner.next();

        char[] chArr = s.toCharArray();

        long sum = 0;

        for(int i  = 0; i < chArr.length; i++) {
            sum += chArr[i] - '0';
        }

        System.out.print(sum);
    }
}