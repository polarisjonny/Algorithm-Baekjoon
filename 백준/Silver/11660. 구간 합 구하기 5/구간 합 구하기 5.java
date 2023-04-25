import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N+11][N+1];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] sum = new int[N+1][N+1];
        
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                //구간 합 구하기
                sum[i][j] = sum[i][j-1]+sum[i-1][j] - sum[i-1][j-1]+array[i][j];
            }
        }
        
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            int result = sum[c][d] - sum[a - 1][d] - sum[c][b - 1] + sum[a - 1][b - 1];
            
            System.out.println(result);
        }




    }





}
