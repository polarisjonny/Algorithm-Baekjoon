

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int K = scanner.nextInt();

        int[] array = new int[N+1];

        for(int i = 2; i <= N; i++) {
            array[i] = i;
        }

        for(int i = 2; i <= N; i++) {
            if(array[i] == 0) {
                continue;
            }

            for(int j = i; j <= N; j+=i) {
                if(array[j] != 0) {
                    array[j] = 0;
                    K--;
                }

                if(K == 0) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
