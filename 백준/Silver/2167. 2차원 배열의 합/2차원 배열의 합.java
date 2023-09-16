

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int[][] array = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int K = scanner.nextInt();

        for(int i = 0; i < K; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            int d = scanner.nextInt() - 1;

            int sum = 0;

            for(int x = a; x <= c; x++) {
                for(int k = b; k <= d; k++) {
                    sum += array[x][k];
                }
            }


            System.out.println(sum);
        }



    }
}
