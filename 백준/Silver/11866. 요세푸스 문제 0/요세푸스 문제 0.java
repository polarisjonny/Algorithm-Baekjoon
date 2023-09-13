

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int K = scanner.nextInt();

        Queue<Integer> people = new LinkedList<>();


        for(int i = 0; i < N; i++) {
            people.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(people.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                int temp = people.poll();
                people.offer(temp);

            }

            sb.append(people.poll()).append(", ");
        }

        sb.append(people.poll()).append(">");
        System.out.println(sb);



    }
}
