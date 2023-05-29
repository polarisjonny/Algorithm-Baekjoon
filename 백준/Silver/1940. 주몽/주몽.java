import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //재료의 갯수
        int N = Integer.parseInt(bf.readLine());


        //갑옷이 완성되는 번호의 합
        int M = Integer.parseInt(bf.readLine());

        //배열 생성
        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        //배열을 오름차순 정렬하기
        Arrays.sort(array);

        //갯수
        int count = 0;

        //시작 인덱스
        int i = 0;

        //끝 인덱스
        int j = N - 1;

        while(i < j) {
            if(array[i] + array[j] < M) {
                i++;
            }
            else if(array[i] + array[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        
        System.out.println(count);
        
        bf.close();




    }





}
