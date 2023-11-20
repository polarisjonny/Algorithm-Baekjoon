import java.util.*;

class Solution {
    public List solution(int[] prices) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < prices.length; i++) {
            queue.add(prices[i]);
        }
        
        while(!queue.isEmpty()) {
            int num = queue.poll();
            int count = 0;
            
            for(int x : queue) {
                if(x < num) {
                    count++;
                    break;
                } else {
                    count++;
                }
            }
            
            answer.add(count);
        }
        
        return answer;
    }
}