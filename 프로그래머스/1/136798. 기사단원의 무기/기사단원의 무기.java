class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] score = new int[number];
        
        int count = 0;
        
        for(int i = 1; i <= number; i++) {
            score[count++] = countNumber(i);
        }
        
        for(int i = 0; i < score.length; i++) {
            if(score[i] > limit) {
                score[i] = power;
            }
            
        }
        
        for(int num : score) {
            answer += num;
        }
        
        return answer;
    }
    
    
    public static int countNumber(int num) {
        int count = 0;
        
        for(int i = 1; i * i <= num; i++) {
            if(i * i == num) count++;
            else if(num % i == 0) count += 2;
        }
        
        return count;
    }
}