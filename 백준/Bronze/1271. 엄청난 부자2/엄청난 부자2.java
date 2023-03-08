import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //최백준 조교가 가진 돈
        BigInteger n = scanner.nextBigInteger();
        
        //돈을 받으러 온 생명체의 수
        BigInteger m = scanner.nextBigInteger();
        
       System.out.println(n.divide(m));
        
       System.out.println(n.remainder(m));
    }
}