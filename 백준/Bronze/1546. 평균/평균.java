import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] grades = new int[N];

        long max = 0;

        for(int i = 0; i < N; i++) {
            grades[i] = scanner.nextInt();
        }

        long sum = 0;

        for(int i = 0; i < N; i++) {
           if(grades[i] > max) {
               max = grades[i];
           }
           sum += grades[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }





}
