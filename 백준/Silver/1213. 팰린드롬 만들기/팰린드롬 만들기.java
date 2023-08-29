

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int[] numbers = new int[26];

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            numbers[ch - 'A']++;
        }

        int checkOdd = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                checkOdd++;
            }
        }

        if(checkOdd > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }


        String result = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i]/2; j++) {
                sb.append((char)(i+65));
            }
        }

        result += sb.toString();

        String end = sb.reverse().toString();

        //중간
        sb = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            //홀수 개를 가지는 문자를 하나씩 담기
            if(numbers[i] % 2 == 1) {
                sb.append((char)(i+65));
            }
        }

        result += sb.toString() + end;


        System.out.println(result);










    }


}
