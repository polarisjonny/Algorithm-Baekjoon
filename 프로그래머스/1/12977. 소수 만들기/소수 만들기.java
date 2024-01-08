class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(isPrime(nums[i], nums[k], nums[j])) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public static boolean isPrime(int i, int k, int j) {
        int num = i + k + j;
        
        if(num == 0 || num == 1) return false;
        
        for(int x = 2; x < num; x++) {
            if(num % x == 0) {
                return false;
            }
        }
        
        return true;
    }
}