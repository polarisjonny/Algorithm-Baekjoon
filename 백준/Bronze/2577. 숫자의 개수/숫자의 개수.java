import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //A의 값을 받는다
        int A = scanner.nextInt();
        
        //B의 값을 받는다
        int B = scanner.nextInt();
        
        //C의 값을 받는다
        int C = scanner.nextInt();
        
        //결과값
        int result = A * B * C;
        
        //그 값을 각 자리수를 나누어서 받는다
        int[] numbers = Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).toArray();
        
        //각 자릿수의 결과를 저장하는 배열
        int[] digits = new int[10];
        
        for(int i = 0; i < numbers.length; i++) {
            digits[numbers[i]]++;
        }
        
        //출력하기
        for(int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
}