

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   

   public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] height =  new int[N+1];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= N; i++) {
            height[i] = scanner.nextInt();
        }
        
        for(int i = N; i>= 1; i--) {
            list.add(height[i], i);
        }
        
        for(int x : list) {
            System.out.print(x+" ");
        }
   }
}
