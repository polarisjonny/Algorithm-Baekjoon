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
        
        String K = st.nextToken();


        int count = 0;

        for(int i = 0; i <= N; i++) {

            for(int j = 0; j < 60; j++) {

                for(int k = 0; k < 60; k++) {
                    if(String.format("%02d", i).contains(K) || String.format("%02d", j).contains(K) || String.format("%02d", k).contains(K)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
