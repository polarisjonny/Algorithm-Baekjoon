

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] positions = new int[N];

        int count = 0;

        for(int i = 0; i < N; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(positions);

        double previousPosition = positions[0] - 0.5;

        count = 1;

        for(int i = 0; i < N; i++) {
            if(previousPosition+L < positions[i]) {
                count++;
                previousPosition = positions[i] - 0.5;
            }
        }

        System.out.println(count);


    }
}
