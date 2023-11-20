import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
       int average = 0;
        
        Arrays.sort(jobs, (a, b) -> (a[0] - b[0]));
        
        PriorityQueue<int[] > pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
       int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        
        while(count < jobs.length) {
            while(index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            
            if(pq.isEmpty()) {
                end = jobs[index][0];            } else {
                int[] arr = pq.poll();
                total += arr[1] + end - arr[0];
                end += arr[1];
                count++;
            }
        }
        
        
        average = total / jobs.length;
    
        return average;
    }
}