

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //T개의 테스트 케이스
        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++) {
            //통나무의 갯수
            int N = Integer.parseInt(br.readLine());

            int[] logLength = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int k = 0; k < N; k++) {
                logLength[k] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(logLength);

            int result = 0;

            for(int k = 2; k < N; k++) {
                result = Math.max(result, Math.abs(logLength[k] - logLength[k-2]));
            }

            System.out.println(result);

        }





    }
}
