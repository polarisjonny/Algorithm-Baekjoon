import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }
        
        while(heap.peek() < K && heap.size() > 1) {
            int min1 = heap.poll();
            
            int min2 = heap.poll();
            
            int mix = min1 + (min2 * 2);
            heap.add(mix);
            
            count++;
        }
        
        if(heap.peek() < K) {
            return -1;
        }
        
        return count;
    }
}