class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countA = 0;
        
        int countB = 0;
        
        if(s.charAt(0) == ')') {
            answer = false;
            return answer;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                countA++;
            } else if(s.charAt(i) == ')') {
                countB++;
            }
            
            if(countB > countA) {
                return false;
            }
        }
        
        if(countA == countB) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}