import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String N = scanner.nextLine();
            
            if(N.equals("0")) {
                break;
            } else {
                int count = 0;
                
                for(int i = 0; i < N.length()/2; i++) {
                    if(N.charAt(i) == N.charAt(N.length() - 1 - i)) {
                        count++;
                    }
                }
                
                if(count == N.length() / 2) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
                
        }     
    }
}