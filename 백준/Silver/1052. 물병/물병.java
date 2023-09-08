

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



        int plus = 0;

        while(true ) {
            int temp = N + plus;

            int count = 0;

            while(temp > 0) {
                if(temp % 2 != 0) {
                    count++;
                }

                temp /= 2;
            }

            if(count <= K) {
                break;
            }

            plus++;

        }

        System.out.println(plus);
    }
}
