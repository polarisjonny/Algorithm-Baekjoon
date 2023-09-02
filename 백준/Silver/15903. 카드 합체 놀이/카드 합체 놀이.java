

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m  = Integer.parseInt(st.nextToken());

        long[] numbers = new long[n];
        
        st = new StringTokenizer(br.readLine());
        
        
        for(int i = 0; i < n; i++) {
            numbers[i] = Long.parseLong(st.nextToken());
        }
        
        for(int i = 0; i < m; i++) {
            Arrays.sort(numbers);
            long sum = numbers[0] + numbers[1];
            numbers[0] = sum;
            numbers[1] = sum;
        }
        
        long totalSum = 0;
        
        for(int i = 0; i < n; i++) {
            totalSum += numbers[i];
        }
        
        System.out.println(totalSum);
    }
}
