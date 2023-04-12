

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            String[] list = br.readLine().split(" ");
            arr[i][0] = list[0];
            arr[i][1] = list[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0] == o2[0]) {
                    return 1;
                } else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }

            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " "+arr[i][1]);
        }


    }
}
