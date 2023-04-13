import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
     public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       StringBuilder sb = new StringBuilder();

       Long N = Long.parseLong(br.readLine());

       sb.append(N*N*N).append("\n");

       sb.append(3).append("\n");

       System.out.println(sb);

       br.close();

    }
}