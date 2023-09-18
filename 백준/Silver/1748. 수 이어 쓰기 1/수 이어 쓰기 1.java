

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);

       int N = scanner.nextInt();

       int answer = 0;

       int num = 1;

       int standard = 10;

       for(int i = 1; i <= N; i++) {
           if(i % standard == 0) {
               num += 1;
               standard *= 10;
           }
           answer += num;
       }
       
       System.out.println(answer);
    }
}
