
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

       

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];



        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }

        }



        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        int count = compareTwo(A, B);

        System.out.println(count);

    }

    public static int compareTwo(int[][] A, int[][] B) {
        int count = 0;

        for(int i = 0; i <= A.length - 3; i++) {
            for(int j = 0; j <= A[0].length -3; j++) {
                if(A[i][j] != B[i][j]) {
                    flip(A, i, j);
                    count++;
                }
            }
        }
        
        //쭉 돌아보면서 같지 않은 답이 있으면 -1 리턴
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                if(A[i][j] != B[i][j]) {
                    return -1;
                }
            }
        }

        return count;
    }

    public static void flip(int[][] temp, int x, int y) {
        for(int i = x; i<x+3; i++) {
            for(int j = y; j < y+3; j++) {
                temp[i][j] = 1 - temp[i][j];
            }
        }
    }


}
