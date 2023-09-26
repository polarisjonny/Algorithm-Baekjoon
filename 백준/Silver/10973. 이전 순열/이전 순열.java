

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        if(prevPermutation(array)) {
            for(int i = 0; i < N; i++) {
                System.out.print(array[i]+" ");
            }
        } else {
            System.out.println(-1);
        }




    }

    public static boolean prevPermutation(int[] array) {
        int i = array.length - 1;

        while( i > 0 && array[i-1] <= array[i]) {
            --i;
        }

        if(i <= 0) {
            return false;
        }

        int j = array.length - 1;
        while(array[j] >= array[i-1]) {
            --j;
        }

        int temp = array[i-1];
        array[i-1]= array[j];
        array[j] = temp;


        j = array.length - 1;

        while(i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            ++i;
            --j;
        }

        return true;
    }
}
