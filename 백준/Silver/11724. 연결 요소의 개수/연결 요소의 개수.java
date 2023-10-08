

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   public static int N;
   public static int M;
   public static int[][] graph;
   public static boolean[] isVisited;


   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      N = scanner.nextInt();
      
      M = scanner.nextInt();

      graph = new int[N+1][N+1];

      for(int i = 0; i < M; i++) {
         int a = scanner.nextInt();

         int b = scanner.nextInt();

         graph[a][b] = 1;
         graph[b][a] = 1;
      }

      isVisited = new boolean[N+1];

      int count = 0;

      for(int i = 1; i < N+1; i++) {
         if(!isVisited[i]) {
            dfs(i);
            count++;
         }
      }

      System.out.println(count);
   }

   public static void dfs(int index) {
      isVisited[index] = true;

      for(int i = 1; i <= N; i++) {
         if(graph[index][i] == 1 && !isVisited[i]) {
            dfs(i);
         }
      }
   }
}

