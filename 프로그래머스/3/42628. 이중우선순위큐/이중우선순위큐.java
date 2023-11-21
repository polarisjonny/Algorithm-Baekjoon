import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String order : operations) {
            StringTokenizer st = new StringTokenizer(order, " ");
            String command = st.nextToken();
            Integer value = Integer.parseInt(st.nextToken());
            
            if(command.equals("I")) {
                minHeap.offer(value);
                maxHeap.offer(value);
            } else if(command.equals("D")) {
                if(value == -1 && !minHeap.isEmpty()) {
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                } else if(value == 1 && !maxHeap.isEmpty()) {
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }
            }
        }
        
        if(maxHeap.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
        }
        
        return answer;
    }
}