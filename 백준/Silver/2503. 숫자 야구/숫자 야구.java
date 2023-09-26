

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        int[] strike = new int[N];
        int[] ball = new int[N];

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            numbers[i] =  Integer.parseInt(st.nextToken());
            strike[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
        }

        int ballCount = 0;
        int strikeCount = 0;

        int answer = 0;

        for(int num = 123; num <= 987; num++) {
            if(isValid(num)) {
                boolean flag = true;
                for(int i = 0; i < N && flag; i++) {
                    String s1 = Integer.toString(num);
                    String s2 = Integer.toString(numbers[i]);

                    if(getStrike(s1, s2)!=strike[i] || getBall(s1, s2) != ball[i]) {
                        flag = false;
                    }
                }

                if(flag) answer++;
            }
        }

        System.out.println(answer);

    }

    public static boolean isValid(int num) {
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        if(hundreds == tens || hundreds == ones || tens == ones || hundreds == 0 || tens == 0 || ones == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int getStrike(String s1, String s2) {
        int count = 0;

        for(int i = 0; i < 3; i++) {
            if(s1.charAt(i) == s2.charAt(i)) count++;
        }

        return count;
    }

    public static int getBall(String s1, String s2) {
        return (int)s1.chars().filter(ch -> s2.indexOf(ch) != -1).count() - getStrike(s1, s2);
    }
}
