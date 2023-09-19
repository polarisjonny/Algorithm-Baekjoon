
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static char[][] bomboni;
    public static int N;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        bomboni = new char[N][N];

        String input = "";

        for(int i = 0; i < N; i++) {
            input = br.readLine();
            bomboni[i] = input.toCharArray();
        }

        //행부터 탐색해서 가장 큰 값을 찾기
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                //일단 행을 하나씩 바꿔봄.
                char change = bomboni[i][j];
                bomboni[i][j] = bomboni[i][j+1];
                bomboni[i][j+1] = change;

                //max값 찾기
                search();

                //원래대로 돌려놓기
                change = bomboni[i][j];
                bomboni[i][j] = bomboni[i][j+1];
                bomboni[i][j+1] = change;
            }
        }

        //열 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                char change = bomboni[j][i];
                bomboni[j][i] = bomboni[j+1][i];
                bomboni[j+1][i] = change;

                max = Math.max(search(), max);

                change = bomboni[j][i];
                bomboni[j][i] = bomboni[j+1][i];
                bomboni[j+1][i] = change;
            }
        }

        System.out.println(max);


    }

    public static int search() {
        //가로
        for(int i = 0; i < N; i++) {
            int count = 1;
            for(int j = 0; j < N - 1; j++) {
                if(bomboni[i][j] == bomboni[i][j+1]) {
                    count++;

                } else {
                    count = 1;
                }

                max = Math.max(max, count);
            }
        }

        //세로로 찾기
        for(int i = 0; i < N; i++) {
            int count = 1;
            for(int j = 0; j < N-1; j++) {
                if(bomboni[j][i] == bomboni[j+1][i]) {
                    count++;
                } else {
                    count = 1;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
