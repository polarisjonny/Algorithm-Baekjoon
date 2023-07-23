

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        //피로도
        int A = Integer.parseInt(st.nextToken());



        //일
        int B = Integer.parseInt(st.nextToken());



        //피로도 차감
        int C = Integer.parseInt(st.nextToken());



        //넘지 않게
        int M = Integer.parseInt(st.nextToken());




        //값을 담을 변수
        int time = 24;

        int work = 0;

        int fatigue = 0;

        for(int i = 0; i < time; i++) {
            //피로도가 M을 넘기기 전까지 일을 한다
            if(fatigue + A <= M) {
                work += B;
                fatigue += A;
            } else {
                fatigue -= C;
                if(fatigue < 0) {
                    fatigue = 0;
                }
            }
        }

        System.out.println(work);


    }
}
