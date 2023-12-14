class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long charge = 0;
        
        for(int i = 1; i <= count; i++) {
            long temp = price * i;
            charge += temp;
        }
        
       answer = charge - money;
        
        if(answer < 0) {
            return 0;
        }
        
        return answer;
    }
}