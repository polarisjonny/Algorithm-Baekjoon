

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[][] time = new int[N][2];
        
        for(int i = 0; i < N; i++) {
            //시작 시간
            time[i][0] = scanner.nextInt();
            
            //종료 시간
            time[i][1] = scanner.nextInt();
        }
        
        //오름차순으로 종료 시간이 짧은 순으로 정렬
        Arrays.sort(time, (a, b) -> {
            
            //종료시간이 같으면 시작 시간이 더 빠른 걸로
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            
            return a[1] - b[1];
        });
        
        int count = 0;
        
        int endTime = 0;
        
        for(int i = 0; i < N; i++) {
            //다음회의시작시간과 이전회의 종료시간을 비교
            if(time[i][0] >= endTime) {
                endTime = time[i][1];
                count++;
            }
        }
        
        System.out.println(count);
    
    
    }
}

