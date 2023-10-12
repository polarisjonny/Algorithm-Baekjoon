

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());

      int M = Integer.parseInt(st.nextToken());

     HashSet<String> set = new HashSet<>();

     for(int i = 0; i < N; i++) {
        set.add(br.readLine());
     }

     List<String> answer = new ArrayList<>();

     for(int i = 0; i < M; i++) {
        String temp = br.readLine();

        if(set.contains(temp)) {
           answer.add(temp);
        }
     }

     Collections.sort(answer);

     System.out.println(answer.size());

     for(String name : answer) {
        System.out.println(name);
     }


   }
}

