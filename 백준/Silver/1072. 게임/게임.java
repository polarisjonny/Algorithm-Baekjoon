
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       long X = scanner.nextLong();

       long Y = scanner.nextLong();

       long Z = (Y * 100) / X;

       if(Z >= 99) {
           System.out.println(-1);
           return;
       }


       long start = 0;
       long end = X;


       while(start <= end) {
           long mid = (start + end) / 2;

            if(((Y + mid) * 100 / (X + mid)) > Z) {
                end = mid - 1;
            }  else {
                start = mid + 1;
            }
       }

       if(((Y + start) * 100) / (X + start) > Z) {
           System.out.println(start);
       }  else {
           System.out.println(-1);
       }
    }
}

