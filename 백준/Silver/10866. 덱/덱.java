
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());

       Deque<Integer> deque = new ArrayDeque<>();



       for(int i = 0; i < N; i++) {
           String input = br.readLine();

            int number = 0;

            if(input.contains("push_front")) {
                String[] splitInput = input.split(" ");
                number = Integer.parseInt(splitInput[1]);
                deque.addFirst(number);
            }
            else if(input.contains("push_back")) {
                String[] splitInput = input.split(" ");
                number = Integer.parseInt(splitInput[1]);
                deque.addLast(number);
            }
            else if(input.equals("front")) {


                if(!deque.isEmpty()) {
                    number = deque.getFirst();
                    System.out.println(number);
                } else {
                    System.out.println(-1);
                }


            }
            else if(input.equals("back")) {

                if(!deque.isEmpty()) {
                    number = deque.getLast();
                    System.out.println(number);
                } else {
                    System.out.println(-1);
                }
            }

            else if(input.equals("size")) {
                int size = deque.size();
                System.out.println(size);
            }

            else if(input.equals("empty")) {
                if(deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            else if(input.equals("pop_front")) {
                if(!deque.isEmpty()) {
                    number = deque.removeFirst();
                    System.out.println(number);

                } else {
                    System.out.println(-1);
                }
            }

            else if(input.equals("pop_back")) {
                if(!deque.isEmpty()) {
                    number = deque.removeLast();
                    System.out.println(number);

                } else {
                    System.out.println(-1);
                }
            }
       }
    }
}
