

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

      int N = scanner.nextInt();

      for(int i = 0; i < N; i++) {
         int num = scanner.nextInt();

         map.put(num, map.getOrDefault(num, 0)+1);
      }

      int M = scanner.nextInt();

      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < M; i++) {
         int num = scanner.nextInt();

         sb.append(map.getOrDefault(num, 0)).append(' ');
      }

      System.out.println(sb);
   }
}
