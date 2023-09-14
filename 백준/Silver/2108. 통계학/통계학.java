

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        double sum = 0;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += (double)num;
            list.add(num);
        }

        Collections.sort(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        if(max < 0 & min < 0) {
            min = Math.abs(min);
        }

        else if(max > 0 && min > 0) {
            min = min * -1;
        }

        else {
            max = Math.abs(max);
            min = Math.abs(min);
        }

        double temp = sum / N;

        int average = (int)Math.round(temp);

        int median = list.get(N / 2);

        int mode = 0;

        int range = max + min;

        for(int num : list) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }

        int numbers = 0;

        for(int x : hashMap.values()) {
            numbers = Math.max(numbers, x);
        }

        list.clear();

        for(int key : hashMap.keySet()) {
            if(hashMap.get(key) == numbers) {
                list.add(key);
            }
        }

        Collections.sort(list);

        if(list.size() >= 2) {
            mode = list.get(1);
        } else {
            mode = list.get(0);
        }

        System.out.println(average);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);


    }
}
