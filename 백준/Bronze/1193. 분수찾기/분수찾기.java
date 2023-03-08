import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //받을 X 값
        int X = scanner.nextInt();
        
        //해당 범위의 대각선 칸 갯수
        int count = 1;
        
        //해당 대각선 직전 대각선 까지의 칸의 누적합
        int sum = 0;
        
        while(true) {
            //일단, 어떤 범위에 있는지를 판별
            if(X <= sum + count) {
                //대각선의 갯수가 홀수라면
                if(count % 2 == 1) {
                    //분자가 큰값부터
                    //분자는 대각선상의 블럭 갯수 - (X번째 - 직전 대각선까지의 블럭 갯수 - 1)
                    //분모는 X번째 - 직전 대각선까지의 블럭 갯수
                    System.out.print((count) - (X - sum - 1) + "/"+(X - sum));
                    break;
                }
                else {
                    //대각선의 갯수가 짝수라면
                    System.out.print((X - sum)+"/"+(count - (X - sum - 1)));
                    break;
                }
            } else {
                sum += count;
                count++;
            }
        }
    }
}