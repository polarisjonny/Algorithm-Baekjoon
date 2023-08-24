

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());

      long A = Long.parseLong(st.nextToken());

      long B = Long.parseLong(st.nextToken());


      int count = 1;

      while(B != A) {
          if (B < A) {
              System.out.println(-1);
              return;
          }

          String bStr = String.valueOf(B);

          if(B % 2 == 0) {
              B /= 2;
          } else if(bStr.charAt(bStr.length() - 1) == '1') {
              bStr = bStr.substring(0, bStr.length() - 1);
              B = Long.parseLong(bStr);
          } else {
              System.out.println(-1);
              return;
          }

        count++;
      }

      System.out.println(count);
    }
}
