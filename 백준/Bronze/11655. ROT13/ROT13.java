import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] ROT13 = br.readLine().toCharArray();

        //대문자일 경우
        for(int i = 0; i < ROT13.length; i++) {
            if(ROT13[i] >= 'A' && ROT13[i] <= 'Z') {
                if(ROT13[i] >= 'N') {
                    ROT13[i] -= 13;
                } else {
                    ROT13[i] += 13;
                }
            }
            else if(ROT13[i] >= 'a' && ROT13[i] <= 'z') {
                if(ROT13[i] >= 'n') {
                    ROT13[i] -= 13;
                } else {
                    ROT13[i] += 13;
                }
            }
        }

        for(char i : ROT13) {
            sb.append(i);
        }

        System.out.println(sb);

    }
}