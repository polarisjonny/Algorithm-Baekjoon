

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Integer[] trees = new Integer[N];

        for(int i = 0; i < N; i++) {
            trees[i] = scanner.nextInt();
        }

        Arrays.sort(trees, Collections.reverseOrder());

        int count = 1;

        int answer = 0;

        for(int i = 0; i < N; i++) {
            answer = Math.max(answer, trees[i]+count);

            count++;
        }

        System.out.println(answer+1);
    }
}
