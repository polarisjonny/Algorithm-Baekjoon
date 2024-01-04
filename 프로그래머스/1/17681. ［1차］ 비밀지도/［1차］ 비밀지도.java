import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String num = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            
            num = num.substring(num.length() - n);
            num = num.replaceAll("1", "#");
            num = num.replaceAll("0", " ");
            
            answer[i] = num;
        }
        
        return answer;
    }
}