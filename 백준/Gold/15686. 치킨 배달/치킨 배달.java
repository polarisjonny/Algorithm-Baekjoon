

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    static int N, M;
    static int[][] map;
    static List<int[]> house = new ArrayList<>();
    static List<int[]> chicken = new ArrayList<>();
    static boolean[] visit;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st;

       st = new StringTokenizer(br.readLine());

       N = Integer.parseInt(st.nextToken());

       M = Integer.parseInt(st.nextToken());

       map = new int[N][N];

       for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());

           for(int j = 0; j < N; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());


               if(map[i][j] == 1) {
                   house.add(new int[]{i, j});
               }

               else if(map[i][j] == 2) {
                   chicken.add(new int[]{i, j});
               }
           }


       }

        visit = new boolean[chicken.size()];

        combine(0, 0);

        System.out.println(answer);

    }

    public static void combine(int start, int depth) {
        if(depth == M) {
            calculate();
            return;
        }

        for(int i = start; i < chicken.size(); i++) {
            if(!visit[i]) {
                visit[i] = true;
                combine(i+1, depth+1);
                visit[i] = false;
            }
        }
    }

    public static void calculate() {
        int sum = 0;

        for(int i = 0; i < house.size(); i++) {
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < chicken.size(); j++) {
                if(visit[j]) {
                    int distance = Math.abs(house.get(i)[0] - chicken.get(j)[0]) + Math.abs(house.get(i)[1] - chicken.get(j)[1]);

                    min = Math.min(min, distance);
                }
            }

            sum += min;
        }

        answer = Math.min(answer, sum);
    }


}
