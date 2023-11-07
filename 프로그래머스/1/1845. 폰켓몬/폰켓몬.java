import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int length = nums.length / 2;
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int x : nums) {
            hash.put(x, hash.getOrDefault(0, +1));
        }
        
        int compare = hash.size();
        
        answer = Math.min(length, compare);
        
        return answer;
    }
}