import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String[] arr = s.split("");
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
                answer[i] = -1;
            } else {
                int order = 0;
                
                for(int j = i-1; j >= 0; j--) {
                    if(arr[j].equals(arr[i])) {
                        order++;
                        break;
                    }
                    order++;
                }
                answer[i] = order;
            }
        }
        
        return answer;
    }
}