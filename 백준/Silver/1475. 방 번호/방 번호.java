

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int[] counts = new int[10];

        for(int i = 0; i < input.length(); i++) {
            counts[input.charAt(i) - '0']++;
        }

        int x = (counts[6] + counts[9]);

        if(x % 2 == 0) {
            counts[6] = x / 2;
            counts[9] = x / 2;
        }
        else {
            counts[6] = x / 2 + 1;
            counts[9] = x / 2 + 1;
        }

        int max = 0;

        for(int i : counts) {
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
