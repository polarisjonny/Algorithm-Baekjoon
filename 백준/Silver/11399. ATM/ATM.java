import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] people = new int[N];



        for(int i = 0; i < N; i++) {
            people[i] = scanner.nextInt();
        }

        Arrays.sort(people);

        int sum = 0;

        int num = 0;

        for(int i = 0; i  < N; i++) {
            num += people[i];
            sum += num;
        }

        System.out.println(sum);



    }
}