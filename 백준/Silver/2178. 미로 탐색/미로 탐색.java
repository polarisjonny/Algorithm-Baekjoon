

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int N;
    public static int M;
    public static int[][] maze;
    public static boolean[][] isVisited;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

       maze = new int[N][M];

       isVisited = new boolean[N][M];

       for(int i = 0; i < N; i++) {
           String input = br.readLine();

           for(int j = 0; j < M; j++) {
               maze[i][j] = input.charAt(j) - '0';
           }
       }

       bfs(0, 0);


       System.out.println(maze[N-1][M-1]);


   }

   public static void bfs(int n, int m) {
      Queue<int[]> q = new LinkedList<>();
      q.offer(new int[]{n,m});

      while(!q.isEmpty()) {
          int arr[] = q.poll();
          int x = arr[0];
          int y = arr[1];

          for(int i = 0; i < 4; i++) {
              int nextX = x + dx[i];
              int nextY = y + dy[i];

              if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;

              if(isVisited[nextX][nextY] == true || maze[nextX][nextY] == 0) continue;

              q.add(new int[] {nextX, nextY});

              maze[nextX][nextY] = maze[x][y]+1;

              isVisited[nextX][nextY] = true;
          }
      }
   }
}
