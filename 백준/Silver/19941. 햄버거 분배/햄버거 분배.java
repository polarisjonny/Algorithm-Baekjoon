

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        char[] input = br.readLine().toCharArray();

        int count = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] == 'P') {
                int start = i - K;
                int end = i + K;
                if(start <= 0) {
                    start = 0;
                }
                if(end >= N) {
                    end = N -1;
                }

                for(int j = start; j <= end; j++) {
                    if(input[j] == 'H') {
                      count++;
                      input[j] = 'X';
                      break;
                    }
                }
            }
        }

        System.out.println(count);


    }
}
