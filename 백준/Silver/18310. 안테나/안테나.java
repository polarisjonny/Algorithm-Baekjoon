

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] positions = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());



        int position = 0;

        for(int i = 0; i < N; i++) {
            positions[i] = Long.parseLong(st.nextToken());


        }

       Arrays.sort(positions);

        if(N % 2 == 0) {
            position = (int)(long)positions[N / 2 -1];
        } else {
            position = (int)(long)positions[ N / 2];
        }



        System.out.println(position);



    }
}
