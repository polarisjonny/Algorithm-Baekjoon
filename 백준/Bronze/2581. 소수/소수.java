import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();

        int N = scanner.nextInt();

        int sum = 0;

        int min = 10000;

        for(int i = M; i <= N; i++) {
            boolean check = true;

            if (i == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }
            }

            if (check) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }

        }


        if(min == 10000) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}