import java.util.*;

class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3);
        
        StringBuilder sb = new StringBuilder(three);
        
        String temp = sb.reverse().toString();
        
        int num = Integer.parseInt(temp, 3);
        
        return num;
    }
}