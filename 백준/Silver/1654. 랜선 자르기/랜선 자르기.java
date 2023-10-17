


import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int K = scanner.nextInt();

       int N = scanner.nextInt();

       int[] arr = new int[K];

       long max = 0;

       for(int i = 0; i < K; i++) {
           arr[i] = scanner.nextInt();
           if(max < arr[i]) {
               max = arr[i];
           }
       }

       max += 1;

       long min = 0;
       long mid = 0;

       while(min < max) {
           mid = (min + max) / 2;

           long count = 0;

           for(int i = 0; i < arr.length; i++) {
               count += (arr[i] / mid);
           }

           if(count < N) {
               max = mid;
           } else {
               min = mid + 1;
           }
       }

       System.out.println(min - 1);
    }
}



