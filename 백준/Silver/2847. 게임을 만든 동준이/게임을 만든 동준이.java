

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] scores = new int[N];

        int count = 0;

        for(int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        for(int i = N-1; i >= 1; i--) {

            if(scores[i-1] >= scores[i]) {
                while(true) {
                    if(scores[i-1] < scores[i]) {
                        break;
                    }

                    scores[i-1]--;
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
