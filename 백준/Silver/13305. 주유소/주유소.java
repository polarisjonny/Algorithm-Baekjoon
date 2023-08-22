

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());

      String[] length = br.readLine().split(" ");

      int[] lengthNum = new int[length.length];

      for(int i = 0; i < lengthNum.length; i++) {
          lengthNum[i] = Integer.parseInt(length[i]);
      }

      String[] oil = br.readLine().split(" ");

      int[] oilNum = new int[oil.length];

      int price = 0;

      for(int i = 0; i < oilNum.length; i++) {
          oilNum[i] = Integer.parseInt(oil[i]);
      }

      for(int i = 0; i < oilNum.length - 1; i++) {
          //처음 리터가 비쌀 경우
          if(oilNum[i] > oilNum[i+1]) {
              price += oilNum[i] * lengthNum[i];
          //처음 리터가 더 쌀 경우
          } else if(oilNum[i] < oilNum[i+1]) {
              price += oilNum[i]*lengthNum[i] + oilNum[i]*lengthNum[i+1];
              i++;
          } else {
              price += oilNum[i] * lengthNum[i];
          }
      }

      System.out.println(price);
    }
}
