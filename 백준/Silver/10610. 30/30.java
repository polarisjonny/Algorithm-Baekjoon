import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        int sum = 0;
        for (char c : arr) {
            sum += c - '0';
        }

        if (arr[0] == '0' && sum % 3 == 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}