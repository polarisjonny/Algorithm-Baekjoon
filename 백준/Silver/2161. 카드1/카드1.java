

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            que.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while(que.size() > 1) {
           sb.append(que.poll()+" ");


            que.offer(que.poll());

        }

        sb.append(que.poll());

        System.out.println(sb.toString());
    }
}
