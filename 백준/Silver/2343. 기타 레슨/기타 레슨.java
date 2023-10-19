

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int[] lecture = new int[N];

        int max = 0;

        long total = 0;

        for(int i = 0; i < N; i++) {
            lecture[i] = scanner.nextInt();
            total += lecture[i];
            max = Math.max(max, lecture[i]);
        }

        long start = max;
        long end = total;

        while(start <= end) {
            long mid = (start + end) / 2;

            long sum = 0;

            int count = 1;

            for(int x : lecture) {
                if(sum + x > mid) {
                    sum = x;
                    count++;
                } else {
                    sum += x;
                }

            }

            if(count <= M) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println(start);

    }
}

