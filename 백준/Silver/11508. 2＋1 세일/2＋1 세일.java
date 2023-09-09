
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Integer[] price = new Integer[N];

        for(int i = 0; i < N; i++) {
            price[i] = scanner.nextInt();
        }

        Arrays.sort(price, Comparator.reverseOrder());

        int sum = 0;

        for(int i = 0; i < N; i++) {
            if(i % 3 == 2) {
                continue;
            }
            sum += price[i];
        }

        System.out.println(sum);

    }
}
