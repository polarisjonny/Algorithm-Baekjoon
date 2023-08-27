import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int minPackage = Integer.MAX_VALUE;

        int minSingle = Integer.MAX_VALUE;

        int totalPrice = 0;

        for(int i = 0; i < M; i++) {
            int packagePrice = scanner.nextInt();

            int singlePrice = scanner.nextInt();

            minPackage = Math.min(minPackage, packagePrice);

            minSingle = Math.min(minSingle, singlePrice);

        }

        minPackage = Math.min(minPackage, minSingle * 6);

        if(N % 6 == 0) {
            totalPrice = (N / 6 )*minPackage;
        }
        else {
            totalPrice = Math.min((N / 6+1)*minPackage, (N / 6)*minPackage+(N % 6)*minSingle);
        }


        System.out.println(totalPrice);


    }
}
