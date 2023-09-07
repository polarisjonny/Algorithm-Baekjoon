
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] rank = new int[N];

        for(int i = 0; i < N; i++) {
            rank[i] = scanner.nextInt();
        }

        Arrays.sort(rank);

        int[] realRank = new int[N];

        int temp = 1;

        for(int i = 0; i < N; i++) {
            realRank[i] = temp;
            temp++;
        }

        long count = 0;

        for(int i = 0; i < N; i++) {
            count += Math.abs(realRank[i] - rank[i]);
        }

        System.out.println(count);
    }
}
