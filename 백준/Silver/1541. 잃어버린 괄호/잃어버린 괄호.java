
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args)  throws IOException {
       //패턴이 있는데 +한 것들 중 가장 큰 값 근처에다 괄호를 치면 된다.
       //그런데 그 +값을 추출해오는 법은?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

       //빼기를 기준으로 분리하여 앞뒤로 더한다
        String[] numbers = expression.split("-");

//        for(String x : numbers) {
//            System.out.print(x+", ");
//        }

        //초기상태 여부를 확인
        int sum = Integer.MAX_VALUE;

        int result = 0;

        for(int i = 0; i < numbers.length; i++) {
            int temp = 0;

            String[] numbersSum = numbers[i].split("\\+");

//            for(String a : numbersSum) {
//                System.out.print(a+", ");
//            }

            for(int j = 0; j < numbersSum.length; j++) {
                temp += Integer.parseInt(numbersSum[j]);
            }

            //첫번째 값은 음수여선 안됨
            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            }
            else {
                sum -= temp;
            }
        }

        System.out.println(sum);








    }
}
