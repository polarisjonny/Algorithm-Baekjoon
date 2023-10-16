

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int start = 0;

        int end = (int)1e9;

        int result = 0;

        while(start <= end) {
            long total = 0;

            int mid = (start + end) / 2;

            for(int i = 0; i < N; i++) {
                if(array[i] > mid) total += array[i] - mid;
            }

            if(total < M) {
                end = mid - 1;
            }
            else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);

    }
}

