import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int d = scanner.nextInt();

        int e = scanner.nextInt();

        int f = scanner.nextInt();

        int X = 0;

        int Y = 0;

        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                if((a*i+b*j==c) && (d*i+e*j==f)) {
                    X = i;
                    Y = j;
                    break;
                }
            }
        }

        System.out.println(X+" "+Y);
    }
}
