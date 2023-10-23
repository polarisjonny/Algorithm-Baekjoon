import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        StringTokenizer st = new StringTokenizer(s, " ", true);
        
        StringBuilder sb = new StringBuilder();
        
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            
            if(temp.equals(" ")) {
                sb.append(temp);       
            } else {
                sb.append(temp.substring(0, 1).toUpperCase() + temp.substring(1));
            }
        }
        
        return sb.toString();
    }
}