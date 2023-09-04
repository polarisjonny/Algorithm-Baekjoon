
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] stocks = new int[N];

            for(int k = 0; k < N; k++) {
                stocks[k] = Integer.parseInt(st.nextToken());
            }

            long profit = 0;
            
            int maxPrice = stocks[N-1];
            
            for(int j = N-2; j>= 0; j--) {
                if(stocks[j] > maxPrice) {
                    maxPrice = stocks[j];
                } else {
                    profit += (maxPrice - stocks[j]);
                }
            }
            
            System.out.println(profit);
        }
    }
}
