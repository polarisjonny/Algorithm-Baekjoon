import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int N = scanner.nextInt();

        int temp = 1;

        int result = 0;

        for(int i = s.length()- 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                result += (ch - 'A' + 10)*temp;
            } else {
                result += (ch - '0')* temp;
            }

            temp *= N;
        }

        System.out.println(result);
    }
}