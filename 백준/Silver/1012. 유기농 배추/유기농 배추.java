

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int T;
    public static int M;
    public static int N;
    public static int K;
    public static int[][] land;
    public static boolean[][] isVisited;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        StringTokenizer st;



        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());

            N = Integer.parseInt(st.nextToken());

            K = Integer.parseInt(st.nextToken());

            land = new int[M+1][N+1];

            int worm = 0;

            for(int m = 0; m < K; m++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());

                int b = Integer.parseInt(st.nextToken());

                land[a][b] = 1;
            }

            isVisited = new boolean[M+1][N+1];

            for(int a = 0; a <= M; a++) {
                for(int b = 0; b <= N; b++) {
                    if(land[a][b] == 1 && isVisited[a][b] == false) {
                        bfs(a, b);
                        worm++;
                    }
                }
            }

            System.out.println(worm);


        }
   }

   public static void bfs(int x, int y) {
       Queue<int[]> q = new LinkedList<>();

       isVisited[x][y] = true;

       q.offer(new int[]{x, y});



       while(!q.isEmpty()) {
           int[] arr = q.poll();

           int nowX = arr[0];

           int nowY = arr[1];



           for(int i = 0; i < 4; i++) {
               int nextX = nowX + dx[i];
               int nextY = nowY + dy[i];

               if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                   continue;
               }

               if(land[nextX][nextY] == 1 && isVisited[nextX][nextY] == false) {
                   isVisited[nextX][nextY] = true;
                   q.offer(new int[]{nextX, nextY});
               }
           }

       }
   }
}
