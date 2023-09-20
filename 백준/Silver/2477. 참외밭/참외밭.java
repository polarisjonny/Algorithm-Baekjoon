

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();


        int maxHeight = 0;
        int maxWidth = 0;
        int maxWidthIndex = -1;
        int maxHeightIndex = -1;

        int[] direction = new int[6];
        int[] length = new int[6];

        for(int i = 0; i < 6; i++) {
            direction[i] = scanner.nextInt();
            length[i] = scanner.nextInt();

            if(direction[i] == 1 || direction[i] == 2) {
                if(length[i] > maxHeight) {
                    maxHeight = length[i];
                    maxHeightIndex = i;
                }
            }
            else {
                if(length[i] > maxWidth) {
                    maxWidth = length[i];
                    maxWidthIndex = i;
                }
            }
        }

        int maxSquare = maxWidth * maxHeight;
        int minSquare = length[(maxWidthIndex +3) % 6] * length[(maxHeightIndex+3)%6];


        System.out.println((maxSquare - minSquare) * K);


    }
}
