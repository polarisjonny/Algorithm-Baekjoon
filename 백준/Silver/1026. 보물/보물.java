

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int S = scanner.nextInt();

      int[] A = new int[S];

      int[] B = new int[S];

      //A는 오름차순
      for(int i = 0; i < A.length; i++) {
          A[i] = scanner.nextInt();
      }


      //B는 내림차순으로
      for(int i = 0; i < B.length; i++) {
          B[i] = scanner.nextInt();
      }

      Arrays.sort(A);

        Integer[] tmp = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순


        Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순

        int sum = 0;

        for(int i = 0; i < S; i++) {
           

            sum += A[i] * tmp[i];


        }

        System.out.println(sum);

    }
}
