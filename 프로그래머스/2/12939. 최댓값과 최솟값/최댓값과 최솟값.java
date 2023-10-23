import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer st = new StringTokenizer(s);
        
        List<Integer> list = new ArrayList<>();
        
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        int min = Integer.MAX_VALUE;
        
        int max = Integer.MIN_VALUE;
        
        for(int x : list) {
            if(x <= min) {
                min = x;
            }
            
            if(x >= max) {
                max = x;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(min+" ");
        sb.append(max);
        
        
        answer = sb.toString();
        
        
        return answer;
    }
}