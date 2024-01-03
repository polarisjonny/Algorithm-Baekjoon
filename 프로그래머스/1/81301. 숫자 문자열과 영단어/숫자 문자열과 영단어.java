class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String temp = "";
        
        String[] digits = {"zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine"
                          };
        
        for(int i = 0; i < s.length();) {
            if(Character.isDigit(s.charAt(i))) {
                temp += s.charAt(i);
                i++;
            } else {
                for(int j = 0; j < digits.length; j++) {
                    if(s.startsWith(digits[j], i)) {
                        temp += j;
                        i += digits[j].length();
                        break;
                    }
                }
            }
        }
                       
    
        answer = Integer.parseInt(temp);
        
        return answer;
    }
}