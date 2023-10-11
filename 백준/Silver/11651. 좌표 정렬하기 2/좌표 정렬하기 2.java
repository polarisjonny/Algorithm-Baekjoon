

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int N = scanner.nextInt();

      List<int[]> list = new ArrayList<>();

      for(int i = 0; i < N; i++) {
         int a = scanner.nextInt();
         int b = scanner.nextInt();

         int[] numbers = {a, b};

         list.add(numbers);
      }

     Collections.sort(list, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
           if(o1[1] == o2[1]) {
              return Integer.compare(o1[0], o2[0]);
           }
           return Integer.compare(o1[1], o2[1]);
        }
     });


      for(int[] array : list) {
         System.out.println(array[0]+" "+array[1]);
      }
   }


}
