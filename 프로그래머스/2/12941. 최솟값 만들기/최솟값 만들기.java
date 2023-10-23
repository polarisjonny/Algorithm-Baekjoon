import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        //오름차순
        Arrays.sort(A);

        
        Integer[] deArray = new Integer[B.length];
        
        for(int i = 0; i < B.length; i++) {
            deArray[i] = B[i];
        }
        
        Arrays.sort(deArray, Comparator.reverseOrder());
        
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * deArray[i];
        }
        
        return answer;
    }
}