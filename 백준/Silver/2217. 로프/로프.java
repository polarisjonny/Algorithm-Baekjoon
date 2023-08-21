
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int N = scanner.nextInt();

      int[] ropes =  new int[N];



      for(int i = 0; i < ropes.length; i++) {
          ropes[i] = scanner.nextInt();
      }

      Arrays.sort(ropes);

      int maxNum = Integer.MIN_VALUE;

      for(int i = 0; i < N; i++) {
          maxNum = Math.max(maxNum, ropes[i] * (N - i));
      }

        System.out.println(maxNum);
    }
}
