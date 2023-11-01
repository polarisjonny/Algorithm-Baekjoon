import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        int num = 0;
        
        while(num + 10 <= discount.length) {
            Map<String, Integer> temp = new HashMap<>();
            
            for(int i = num; i < num+10; i++) {
                temp.put(discount[i], temp.getOrDefault(discount[i], 0)+1);
            }
            
            boolean isMatch = true;
            
            for(String key : map.keySet()) {
                if(map.get(key) != temp.getOrDefault(key, 0)) {
                    isMatch = false;
                    break;
                }
            }
            
            if(isMatch) {
                answer++;
            }
            
            num++;
        }
        
        return answer;
    }
}