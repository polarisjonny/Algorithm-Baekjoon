

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

       for(int i = 0; i < input.length(); i++) {
          System.out.print(input.charAt(i));

          if(i % 10 == 9) {
              System.out.println();
          }
       }
    }
}
