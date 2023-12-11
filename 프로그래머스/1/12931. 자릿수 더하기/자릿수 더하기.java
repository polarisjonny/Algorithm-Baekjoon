import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = Integer.toString(n);
        

        
        for(int i = 0; i < temp.length(); i++) { 
            answer += temp.charAt(i) - '0';
        }

        return answer;
    }
}