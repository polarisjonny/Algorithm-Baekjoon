import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int x = 0; x < commands.length; x++) {
            int i = commands[x][0] - 1;
            int j = commands[x][1] - 1;
            int k = commands[x][2] - 1;
            
            int[] temp = new int[j - i + 1];
            for(int p = 0; p < temp.length; p++) {
                temp[p] = array[i];
                i++;
            }
            
            Arrays.sort(temp);
            
            answer[x] = temp[k];
        }
        
        return answer;
    }
}