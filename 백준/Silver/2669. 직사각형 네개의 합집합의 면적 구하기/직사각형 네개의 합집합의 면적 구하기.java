

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[][] square = new int[101][101];

        for(int i = 0; i < 4; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for(int y = y1; y < y2; y++) {
                for(int x = x1; x < x2; x++) {
                    square[y][x] = 1;
                }
            }
        }

        int answer = 0;

        for(int i = 0; i < 101; i++) {
            for(int j = 0; j < 101; j++) {
                if(square[i][j] == 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
