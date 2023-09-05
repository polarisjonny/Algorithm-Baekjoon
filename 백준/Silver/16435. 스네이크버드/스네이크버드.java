
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //과일의 개수
        int N = Integer.parseInt(st.nextToken());

        //스네이크버드의 초기 길이
        int L = Integer.parseInt(st.nextToken());


        //과일들의 높이를 담는 배열
        int[] fruits = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fruits);

        for(int i = 0; i < N; i++) {
            if(L >= fruits[i]) {
                L++;
            }
        }

        System.out.println(L);
    }
}
