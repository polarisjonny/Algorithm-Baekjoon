import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            int a = scanner.nextInt();
            
            int b = scanner.nextInt();
            
            int c = scanner.nextInt();
            
            //0 0 0을 입력받으면 종료
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            
            if((a*a +b*b) == c*c) {
                System.out.println("right");
            }
            else if(a*a==(b*b + c*c)) {
                System.out.println("right");
            }
            else if(b*b == (a*a + c*c)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}