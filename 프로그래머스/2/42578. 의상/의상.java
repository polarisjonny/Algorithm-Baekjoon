import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(String[] cloth : clothes) {
            if(hash.containsKey(cloth[1])) {
                int num = hash.get(cloth[1]);
                
                hash.put(cloth[1], num + 1);
            } else {
                hash.put(cloth[1], 2);
            }
        }
        
        for(String str : hash.keySet()) {
            answer *= hash.get(str);
        }
        
        answer--;
        
        return answer;
    }
}