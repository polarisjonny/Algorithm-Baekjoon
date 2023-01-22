import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //응시자의 수
        int N = scanner.nextInt();
        
        //상을 받는 사람의 수 : k
        int k = scanner.nextInt();
        
        //각 학생의 점수를 담는 배열
        //Integer타입으로 선언해주어야 Collections.reverseOrder() 메소드 사용이 가능하다.
        Integer[] x = new Integer[N];
        
        for(int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        
        //내림차순 정렬
        //이때, 주의할 점은  Arrays.sort의 경우 T는 Generic class로 모든 객체를 허용하지만 
        //int는 기본형 타입으로 Collections에서 사용하는 객체가 아니다. 
        Arrays.sort(x, Collections.reverseOrder());
        
        System.out.println(x[k - 1]);
    }
}