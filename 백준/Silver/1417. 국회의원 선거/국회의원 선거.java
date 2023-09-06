

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        if(N == 1) {
            System.out.println(0);
            return;
        }
        
        int dasom = Integer.parseInt(br.readLine());
        
        int[] people = new int[N-1];
        
        for(int i = 0; i < N-1; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        
        while(true) {
            Arrays.sort(people);
            if(people[N-2] < dasom) break;
            count++;
            people[N-2]--;
            dasom++;
        }
        
        System.out.println(count);
    }
}
