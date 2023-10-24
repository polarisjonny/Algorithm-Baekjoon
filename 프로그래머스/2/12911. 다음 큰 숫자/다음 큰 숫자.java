class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String temp = Integer.toBinaryString(n);
        
        int nOne = 0;
        
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '1') {
                nOne++;
            }
        }
        
        for(int i = n+1; i <= 1000000; i++) {
            String s = Integer.toBinaryString(i);
            
            int count = 0;
            
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '1') {
                    count++;
                }
            }
            
            if(nOne == count) {
                answer = i;
                break;
            }
            
        }
        
        return answer;
    }
}