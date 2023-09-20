import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] status = new int[num];

        for(int i = 0; i < num; i++) {
            status[i] = scanner.nextInt();
         }

        int studentNum = scanner.nextInt();



        for(int i = 0; i < studentNum; i++) {
            int gender = scanner.nextInt();

            int switchNum = scanner.nextInt();

            if(gender == 1) {
                for(int k = 0; k < num; k++) {
                    if((k+1) % switchNum == 0) {
                        status[k] ^= 1;
                    }
                }
            }
            else if(gender == 2) {
                int start = switchNum - 2;
                int end = switchNum;

                while(start >= 0 && end < num && status[start] == status[end]) {
                    start--;
                    end++;
                }

                start++;
                end--;

                for(int x = start; x<= end; x++) {
                    status[x] ^= 1;
                }





            }




        }



        for(int i = 0; i < status.length; i++) {
                
            System.out.print(status[i]+" ");
            
            if((i+1) % 20 == 0) { // 매 20개마다 줄바꿈
                System.out.println();
            }
        }



    }
}
