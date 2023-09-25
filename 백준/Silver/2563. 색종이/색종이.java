

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());

       StringTokenizer st;

       int[][] paper = new int[101][101];

       for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());

           int left = Integer.parseInt(st.nextToken());

           int down = Integer.parseInt(st.nextToken());

           for(int k = down; k < down+10; k++) {
               for(int m = left; m < left+10; m++) {
                   paper[k][m] = 1;
               }
           }
       }

        int count = 0;

       for(int i = 0; i < 101; i++) {
           for(int k = 0; k < 101; k++) {
               if(paper[i][k] == 1) {
                   count++;
               }
           }
       }

       System.out.println(count);




    }
}
