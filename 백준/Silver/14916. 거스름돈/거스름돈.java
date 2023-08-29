

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;

        while(true) {
            if(n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                break;
            } else {
                n -= 2;
                count++;
            }

            if(n < 0) {
                System.out.println(-1);
                break;
            }
        }


    }


}
