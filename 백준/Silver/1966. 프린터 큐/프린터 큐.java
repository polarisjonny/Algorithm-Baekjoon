

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

class Document {
    int index;
    int importance;

    public Document(int index, int importance) {
        this.index = index;
        this.importance = importance;
    }
}


public class Main {


    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);

       int T = scanner.nextInt();


       for(int i = 0; i < T; i++) {
           int N = scanner.nextInt();

           int M = scanner.nextInt();

           int count = 0;

           LinkedList<Document> que = new LinkedList<>();

           for(int j = 0; j < N; j++) {
               que.offer(new Document(j, scanner.nextInt()));
           }


           while(!que.isEmpty()) {
               Document d = que.poll();

               boolean isMax = true;

               for(Document doc : que) {
                   if(doc.importance > d.importance) {
                       isMax = false;
                       break;
                   }
               }

               if(isMax) {
                   count++;
                   if(d.index == M) {
                       System.out.println(count);
                       break;
                   }
               } else {
                   que.offer(d);
               }
           }





       }


    }
}
