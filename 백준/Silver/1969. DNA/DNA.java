

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //DNA의 수
        int N = Integer.parseInt(st.nextToken());

        //문자열의 길이
        int M = Integer.parseInt(st.nextToken());

        String[] DNAs = new String[N];

        for(int i = 0; i < N; i++) {
            DNAs[i] = br.readLine();
        }

        StringBuilder answerDNA = new StringBuilder();

        int totalHammingDistance = 0;

        for(int i = 0; i < M; i++) {
            int[] dnaNum = new int[4];

            for(int j = 0; j < N; j++) {
                switch(DNAs[j].charAt(i)) {
                    case 'A' :
                        dnaNum[0]++;
                        break;
                    case 'C' :
                        dnaNum[1]++;
                        break;
                    case 'G' :
                        dnaNum[2]++;
                        break;
                    case 'T' :
                        dnaNum[3]++;
                        break;
                }
            }

            int maxIndex = 0;

            for(int k = 1 ; k < 4; k++) {
                if(dnaNum[k] > dnaNum[maxIndex]) {
                    maxIndex = k;
                }
            }

            switch(maxIndex) {
                case 0 :
                    answerDNA.append('A');
                    totalHammingDistance += N - dnaNum[0];
                    break;
                case 1 :
                    answerDNA.append('C');
                    totalHammingDistance += N - dnaNum[1];
                    break;
                case 2 :
                    answerDNA.append('G');
                    totalHammingDistance += N - dnaNum[2];
                    break;
                case 3 :
                    answerDNA.append('T');
                    totalHammingDistance += N - dnaNum[3];
            }
        }


        System.out.println(answerDNA);
        System.out.println(totalHammingDistance);
    }
}
