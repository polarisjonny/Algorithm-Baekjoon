

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder output = new StringBuilder();

        StringTokenizer st = new StringTokenizer(input, ".", true);

        while(st.hasMoreTokens()) {
            String token = st.nextToken();

            if(token.equals(".")) {
                output.append(".");
                continue;
            }

            int length = token.length();

            if(length %2 != 0) {
                System.out.println(-1);
                return;
            }

            while(length >= 4) {
                output.append("AAAA");
                length -= 4;
            }

            if(length == 2) {
                output.append("BB");
            }
        }

        System.out.println(output.toString());
    }
}
