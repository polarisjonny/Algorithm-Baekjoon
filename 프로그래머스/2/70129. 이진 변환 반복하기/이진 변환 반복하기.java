class Solution {
    public int[] solution(String s) {
        
        //이진변환 횟수
        int count = 0;
        
        //0제거 횟수
        int zeroCount = 0;
        
        
        
       
        
        while(!s.equals("1")) {
            String tempStr = "";
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '1') { 
                    tempStr += "1";
                } else { 
                    zeroCount++;
                }
            }
            
            
            
            s = Integer.toBinaryString(tempStr.length());
            
            count++;
        }
        
        int answer[] = new int[2];
        
        answer[0] = count;
        answer[1] = zeroCount;
        
        return answer;
    }
}