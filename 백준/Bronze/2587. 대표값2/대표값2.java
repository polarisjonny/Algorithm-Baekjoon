import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //숫자들을 담을 배열 하나를 생성
        int[] numbers = new int[5];
        
        //숫자들의 합
        int sum = 0;
        
        //숫자들의 평균
        int average = 0;
        
        //숫자들의 중앙값
        int median = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        //평균
        average = sum / numbers.length;
        
        //배열 오름차순 정렬
        Arrays.sort(numbers);
        
        //중앙값
        median = numbers[2];
        
        //평균 출력
        System.out.println(average);
        
        //중앙값 출력
        System.out.println(median);
        
    }
}