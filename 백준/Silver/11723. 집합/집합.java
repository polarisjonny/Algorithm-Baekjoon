

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s = 0;
        StringBuilder sb = new StringBuilder();

        while (n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String cmd = st.nextToken();
            int a;

            switch (cmd){
                case "add" :
                    a = Integer.parseInt(st.nextToken());
                    s |= (1<<a);
                    break;
                case "remove":
                    a = Integer.parseInt(st.nextToken());
                    s &= ~(1<<a);
                    break;
                case "check":
                    a = Integer.parseInt(st.nextToken());
                    int tmp = s & (1<<a);
                    sb.append((tmp==0) ? 0 : 1).append('\n');
                    break;
                case "toggle":
                    a = Integer.parseInt(st.nextToken());
                    s ^= (1<<a);
                    break;
                case "all":
                    s = (1<<21) - 1;
                    break;
                case "empty":
                    s = 0;
                    break;
            }
        }
        System.out.println(sb);

    }
}

