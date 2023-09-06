

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char[] inputs = input.toCharArray();

        String result = "";

        for(int i = 0; i < inputs.length; i++) {
            if(result.length() == 0 && inputs[i] == 'U') {
                result += "U";
            } else if(result.length() == 1 && inputs[i] == 'C') {
                result += "C";
            } else if(result.length() == 2 && inputs[i] == 'P') {
                result += "P";
            } else if(result.length() == 3 && inputs[i] == 'C') {
                result += "C";
            }
        }

        if(result.equals("UCPC")) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
