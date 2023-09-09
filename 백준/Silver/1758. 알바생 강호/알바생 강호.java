import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Integer[] people = new Integer[N];

        for(int i = 0; i < N; i++) {
            people[i] = scanner.nextInt();
        }

        Arrays.sort(people, Collections.reverseOrder());

        long answer = 0;

        for(int i = 0; i < N; i++) {
            int temp = people[i] - ((i+1) - 1);

            if(temp <= 0) {
                continue;
            }

            answer += temp;
        }

        System.out.println(answer);
    }
}
