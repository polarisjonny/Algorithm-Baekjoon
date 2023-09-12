
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

       List<Integer> people = new ArrayList<>();



       for(int i = 1; i <= N; i++) {
           people.add(i);
       }

       StringBuilder sb = new StringBuilder();

       sb.append("<");


       int pointer = 0;

       int i = 0;

       while(!people.isEmpty()) {
           pointer += (K - 1);

           if(pointer >= people.size()) {
               pointer %= people.size();
           }

           sb.append(people.remove(pointer)).append(", ");
       }

       sb.setLength(sb.length() - 2);
       sb.append(">");

       System.out.println(sb.toString());
    }
}
