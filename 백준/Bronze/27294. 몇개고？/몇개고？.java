import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //술하고 같이 초밥을 먹을 때
        //점심 식사가 아닐 때는
        //초밥의 밥알이 280개
        
        //점심 식사이면서
        //술하고 같이 먹지 않을 때는
        //초밥의 밥알이 320개
        
        //시간을 의미하는 정수
        int T = scanner.nextInt();
        
        //술의 유무를 의미하는 정수
        int S = scanner.nextInt();
        
        if((T >= 0 && T < 12) || (T > 16 && T <= 23) || S == 1) {
            System.out.println(280);
        }
        else {
            System.out.println(320);
        }
    }
}