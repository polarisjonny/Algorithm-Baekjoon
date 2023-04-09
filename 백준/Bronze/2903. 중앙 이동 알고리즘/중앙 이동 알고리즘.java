import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int temp = 3;

        int[] numbers = new int[16];

        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = temp * temp;
            temp = temp + (temp - 1);
        }

        System.out.println(numbers[N]);
 
    }
}