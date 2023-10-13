

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numbers = new int[N];

        int[] sort = new int[N];

        HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();

        for(int i = 0; i < N; i++) {
            sort[i] = numbers[i] = scanner.nextInt();
        }

        Arrays.sort(sort);

        int rank = 0;

        for(int x : sort) {
            if(!answer.containsKey(x)) {
                answer.put(x, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int num : numbers) {
            int score = answer.get(num);

            sb.append(score).append(' ');
        }
        
        System.out.println(sb.toString());




   }
}
