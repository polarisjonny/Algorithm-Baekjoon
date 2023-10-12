

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int N, M;

    public static int[] cards;

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      N = Integer.parseInt(br.readLine());

      cards = new int[N];

      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int i = 0; i < N; i++) {
          cards[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(cards);

      M = Integer.parseInt(br.readLine());

      st = new StringTokenizer(br.readLine());

      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < M; i++) {
          int num = Integer.parseInt(st.nextToken());

          if(binarySearch(num)) {
              sb.append("1 ");
          } else {
              sb.append("0 ");
          }
      }
      
      System.out.println(sb.toString());
   }

   public static boolean binarySearch(int num) {
       int leftIndex = 0;
       int rightIndex = N - 1;

       while(leftIndex <= rightIndex) {
           int midIndex = (leftIndex + rightIndex) / 2;
           int mid = cards[midIndex];

           if(num < mid) rightIndex = midIndex - 1;
           else if(num > mid) leftIndex = midIndex + 1;
           else return true;
       }

       return false;
   }
}
