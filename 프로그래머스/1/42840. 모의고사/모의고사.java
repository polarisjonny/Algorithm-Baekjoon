import java.util.*;

class Solution {
    public List solution(int[] answers) {
        int[] oneAnswer = {1, 2, 3, 4, 5};
        int[] twoAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int one = 0;
        int two = 0;
        int three = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == oneAnswer[i % oneAnswer.length]) {
                one++;
            }
            if(answers[i] == twoAnswer[i % twoAnswer.length]) {
                two++;
            }
            if(answers[i] == threeAnswer[i % threeAnswer.length]) {
                three++;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        
        int maxCount = Math.max(Math.max(one, two), three);
        
        if(one == maxCount) answer.add(1);
        if(two == maxCount) answer.add(2);
        if(three == maxCount) answer.add(3);
        
        return answer;
    }
}