

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int J = Integer.parseInt(br.readLine());

        int[] position = new int[J];

        for(int i = 0; i < J; i++) {
            position[i] = Integer.parseInt(br.readLine());
        }

        int start = 1;

        int end = M;

        int count = 0;

        for(int i = 0; i < J; i++) {
            //사과 위치가 바구니 시작점보다 왼쪽에 있는 경우
            if(position[i] < start) {
                count += (start - position[i]);
                end -= (start - position[i]);
                start = position[i];
            }
            //사과 위치가 바구니보다 오른쪽에 있는 경우
            else if(position[i] > end){
                 count += (position[i]-end);
                 start += (position[i]-end);
                 end = position[i];
            }


        }

        System.out.println(count);
    }
}
