

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] weight = new int[N];

        int[] height = new int[N];

        int[] rank = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            weight[i] = Integer.parseInt(st.nextToken());

            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int tempWeight = weight[i];
            int tempHeight = height[i];

            int count = 0;

            for(int j = 0; j < N; j++) {
                if(weight[j] > tempWeight && height[j] > tempHeight) {
                    count++;
                }
            }

            rank[i] = count;
        }

        for(int i = 0; i < N; i++) {
            System.out.print(rank[i]+1+" ");
        }
    }
}
