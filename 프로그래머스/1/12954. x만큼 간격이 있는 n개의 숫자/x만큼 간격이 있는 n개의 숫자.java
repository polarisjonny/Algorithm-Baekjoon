class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int count = 0;
        
        long temp = x;
        
        while(count < n) {
           
            answer[count] = temp; 
            temp = temp +x;
            count++;
        }
        
        return answer;
    }
}