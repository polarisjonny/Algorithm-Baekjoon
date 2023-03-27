import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());


        int count = 0;


        for(int i = 0; i < N; i++) {
            String s = br.readLine();

            if(checker(s) == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean checker(String str) {
        boolean[] check = new boolean[26];

        int preNum = 0;

        for (int i = 0; i < str.length(); i++) {
            int currentNum = str.charAt(i);

            if (preNum != currentNum) {
                if (!check[currentNum - 'a']) {
                    check[currentNum - 'a'] = true;
                    preNum = currentNum;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}