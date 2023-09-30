

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int num;
    public static int relation;
    public static int[][] computer;
    public static boolean[] visited;


   public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        relation = scanner.nextInt();

        computer = new int[num+1][num+1];



        for(int i = 1; i <= relation; i++) {
            int a = scanner.nextInt();

            int b = scanner.nextInt();

            computer[a][b] = 1;
            computer[b][a] = 1;
        }



        visited = new boolean[num+1];


        int result = bfs(1);

        System.out.println(result);
   }

   public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;

        q.offer(start);

        int result = 0;

        while(!q.isEmpty()) {
            int n = q.poll();

            for(int i = 1; i <= num; i++) {
                if(computer[n][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    result++;
                    q.offer(i);
                }
            }
        }

        return result;
   }
}
