import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int train = 4; 
        int remainingCustomer = 0;
        int max = 0;
        
        for(int i = 0; i < train; i++) {
            //내리는 사람 수
            int getOff = scanner.nextInt();
            
            //타는 사람 수
            int getOn = scanner.nextInt();
            
            //역에 있는 총 인원 수
            remainingCustomer -= getOff;
            remainingCustomer += getOn;
            
            max = Math.max(max, remainingCustomer);
        }
        System.out.println(max);
    }
}