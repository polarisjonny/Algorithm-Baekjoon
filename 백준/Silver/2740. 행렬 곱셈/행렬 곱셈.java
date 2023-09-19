

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        //행렬 A
        int N = Integer.parseInt(st.nextToken());

        //행렬 A
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        int bM = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        int[][] B = new int[bM][K];

        for(int i = 0; i < bM; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

       long[][] result = new long[N][K];

        for(int n = 0; n < N; n++) {
            for(int k = 0; k < K; k++) {
                for(int m = 0; m < M; m++) {
                    result[n][k] += A[n][m] * B[m][k];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < K; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());

    }
}
