

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'c') {
                if(i < input.length() - 1 && (input.charAt(i+1) == '=' || input.charAt(i+1) == '-')) {
                    count++;
                    i++;
                } else {
                    count++;
                }


            }

            else if(input.charAt(i) == 'd') {
                if(i < input.length() - 2 && input.charAt(i+1) == 'z' && input.charAt(i+2) == '=') {
                    count++;
                    i+=2;
                } else if(i < input.length() - 1 && input.charAt(i+1) == '-') {
                    count++;
                    i++;
                } else {
                    count++;
                }
            }

            else if(input.charAt(i) == 'l' || input.charAt(i) == 'n') {
                if(i < input.length() - 1 && input.charAt(i+1) == 'j') {
                    count++;
                    i++;
                } else {
                    count++;
                }
            }

            else if(input.charAt(i) == 's' || input.charAt(i) == 'z') {
                if(i < input.length() - 1 && input.charAt(i+1) == '=') {
                    count++;
                    i++;
                } else {
                    count++;
                }
            }

            else {
                count++;
            }
        }

        System.out.println(count);
    }
}
