

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st;

      int T = Integer.parseInt(br.readLine());

    for(int i = 0; i < T; i++) {
        int N = Integer.parseInt(br.readLine());

        int[] rank = new int[N];


        for(int k = 0; k < N; k++) {
            st = new StringTokenizer(br.readLine());

            int paperRank = Integer.parseInt(st.nextToken());

            int interviewRank = Integer.parseInt(st.nextToken());

            rank[paperRank - 1] = interviewRank;
        }

        //1위는 무조건 들어간다
        int count = 1;

        int compare = rank[0];

        for(int j = 1; j < N; j++) {
            if(compare > rank[j]) {
                count++;
                compare = rank[j];
            }
        }

        System.out.println(count);
    }




    }
}
