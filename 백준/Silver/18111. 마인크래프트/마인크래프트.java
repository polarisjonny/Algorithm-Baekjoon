
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

       //세로 N
       int N = Integer.parseInt(st.nextToken());

       //가로 M
       int M = Integer.parseInt(st.nextToken());

       //인벤토리
       int B = Integer.parseInt(st.nextToken());

       int[][] land = new int[N][M];

       int minNum = 1000;

       int maxNum = 0;

       for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());

           for(int j = 0; j < M; j++) {
               land[i][j] = Integer.parseInt(st.nextToken());

               if(minNum > land[i][j]) {
                   minNum = land[i][j];
               }

               if(maxNum < land[i][j]) {
                   maxNum = land[i][j];
               }
           }
       }

       int time = 99999999;
       int height = 0;

       for(int i = minNum; i <= maxNum; i++) {
           int count = 0;
           int inventory = B;

           for(int j = 0; j < N; j++) {
               for(int k = 0; k < M; k++) {
                   if(i < land[j][k]) {
                       count += ((land[j][k] - i) * 2);
                       inventory += (land[j][k] - i);
                   }
                   else {
                       count += (i - land[j][k]);
                       inventory -= (i - land[j][k]);
                   }
               }
           }

           if(inventory < 0) break;

           if(time >= count) {
               time = count;
               height = i;
           }
       }

        System.out.println(time+" "+height);
    }
}
