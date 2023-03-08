import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //N의 약수의 갯수
        int num = scanner.nextInt();
        
        //진짜 약수들
        long[] numbers = new long[num];
        
        for(int i = 0; i < num; i++) {
            numbers[i] = scanner.nextLong();
        }
        
        Arrays.sort(numbers);
        
        //최대값 구하기
        long max = numbers[num - 1];
        
        //최소값 구하기
        long min = numbers[0];
        
        System.out.println(max * min);
    }
}