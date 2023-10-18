

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int N = scanner.nextInt();

       int[] arr = new int[N];



       long sum = 0;

       for(int i = 0; i < N; i++) {
           arr[i] = scanner.nextInt();

           sum += arr[i];
       }

       Arrays.sort(arr);

        int M = scanner.nextInt();

       if(M >= sum) {
           System.out.println(arr[N-1]);
           return;
       }

       long start = 0;
       long end = arr[N-1];
       long mid = 0;



       while(start <= end) {
           long total = 0;

           mid = (start + end) / 2;




           for(int i = 0; i < N; i++) {
               if(arr[i] > mid) {
                   total += mid;
               } else {
                   total += arr[i];
               }
           }

           if(total > M) {
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }

       System.out.println(end);

    }
}

