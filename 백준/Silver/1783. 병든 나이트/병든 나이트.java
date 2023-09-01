
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //세로 길이
        long N = scanner.nextInt();

        //가로 길이
        long M = scanner.nextInt();

        if(N == 1) {
            System.out.println(1);
        } else if(N == 2) {
            System.out.println(Math.min(4, (M+1)/2));
        } else if(M < 7) {
            System.out.println(Math.min(4, M));
        } else {
            System.out.println(M - 2);
        }
    }
}
