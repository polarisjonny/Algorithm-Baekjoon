import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        
        Collections.sort(counts, Collections.reverseOrder());
        
        for(int count : counts) {
            sum += count;
            answer++;
            if(sum >= k) {
                break;
            }
        }
        return answer;
    }
}