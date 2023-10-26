import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> wordList = new ArrayList<>();
        
        
        
        wordList.add(words[0]);
        
        boolean isFail = false;
        
        for(int i = 1; i < words.length; i++) {
            int number = (i % n) + 1;
            int turn = (i / n) + 1;
            
            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0) || wordList.contains(words[i])) {
                
                isFail = true;
                answer[0] = number;
                answer[1] = turn;
                break;
            }
            
            wordList.add(words[i]);
        }
        
        if(!isFail) {
            answer[0] = 0;
            answer[1] = 0;
        }
        
        return answer;
    }
}