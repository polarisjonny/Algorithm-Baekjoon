import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String A = "000000";
    public static final String B = "001111";
    public static final String C = "010011";
    public static final String D = "011100";
    public static final String E = "100110";
    public static final String F = "101001";
    public static final String G = "110101";
    public static final String H = "111010";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        String message = br.readLine();
        
        decodeMessage(message, T);
    }
    
    public static void decodeMessage(String message, int T) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < message.length(); i+=6) {
            String temp = message.substring(i, i+6);
            if(temp.equals(A) || checkMessage(temp, A)) {
                sb.append("A");
            }
            else if(temp.equals(B) || checkMessage(temp, B)) {
                sb.append("B");
            }
            else if(temp.equals(C) || checkMessage(temp, C)) {
                sb.append("C");
            }
            else if(temp.equals(D) || checkMessage(temp, D)) {
                sb.append("D");
            }
            else if(temp.equals(E) || checkMessage(temp, E)) {
                sb.append("E");
            }
            else if(temp.equals(F) || checkMessage(temp, F)) {
                sb.append("F");
            }
            else if(temp.equals(G) || checkMessage(temp, G)) {
                sb.append("G");
            }
            else if(temp.equals(H) || checkMessage(temp, H)) {
                sb.append("H");
            }
            else {
                sb = new StringBuffer();
                sb.append((i/6) + 1);
                break;
            }
        }
        System.out.println(sb.toString());
    }
    
    public static boolean checkMessage(String temp, String alphabet) {
        int count = 0;
        
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) != alphabet.charAt(i)) {
                count++;
            }
        }
        if(count == 1) {
            return true;
        }
        return false;
    }
}