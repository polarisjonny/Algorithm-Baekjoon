

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

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[][] square = new int[N][M];

        int answer = 1;

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < M; j++) {
                square[i][j] = input.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                for(int k = 1; i+k < N && j + k < M; k++) {
                    if(square[i][j] == square[i+k][j] && square[i][j] == square[i][j+k] && square[i][j] == square[i+k][j+k]) {
                        answer = Math.max(answer, (k+1) * (k+1));
                    }
                }

            }
        }

        System.out.println(answer);
    }
}
