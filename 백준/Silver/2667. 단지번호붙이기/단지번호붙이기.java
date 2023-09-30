

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int N;
    public static int graph[][];

    public static List<Integer> result;



    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static boolean[][] visited;

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        graph = new int[N][N];


        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < N; j++) {
                graph[i][j] = input.charAt(j) - '0';
            }
        }

        visited = new boolean[N][N];

       result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(graph[i][j] == 1 && !visited[i][j]) {
                    result.add(bfs(i, j));
                }
            }
        }

        Collections.sort(result);

        System.out.println(result.size());

        for(Integer x : result) {
            System.out.println(x);
        }
   }

   public static int bfs(int x, int y) {
       Queue<int[]> q = new LinkedList<>();

       q.add(new int[]{x, y});

       visited[x][y] = true;

        int sum = 1;

        while(!q.isEmpty()) {
            int[] array = q.poll();

            int nowX = array[0];
            int nowY = array[1];

            for(int j = 0; j < 4; j++) {
                int nextX = nowX+dx[j];
                int nextY = nowY+dy[j];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }

                if(graph[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    q.offer(new int[]{nextX, nextY});
                    sum++;
                }

            }

        }

        return sum;
   }
}
