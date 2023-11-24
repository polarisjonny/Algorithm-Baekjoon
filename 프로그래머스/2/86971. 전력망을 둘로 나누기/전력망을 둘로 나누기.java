import java.util.*;

class Solution {
    public int[][] node;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        node = new int[n+1][n+1];
        
        for(int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            
            node[a][b] = node[b][a] = 1;
        }
        
        int a, b;
        
        for(int i = 0; i < wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];
            
            node[a][b] = 0;
            node[b][a] = 0;
            
            int temp = bfs(n, a);
            
            answer = Math.min(answer, temp);
            
            node[a][b] = 1;
            node[b][a] = 1;
        }
        
        return answer;
    }
    
    public int bfs(int n, int start) {
        int[] visited = new int[n+1];
        
        Queue<Integer> queue = new LinkedList<>();
        
        visited[start] = 1;
        
        queue.offer(start);
        
        int count = 1;
        
        while(!queue.isEmpty()) {
            int num = queue.poll();
            
            for(int i = 1; i <= n; i++) {
                if(visited[i] == 1) continue;
                
                if(node[num][i] == 1) {
                    visited[i] = 1;
                    count++;
                    queue.offer(i);
                }
            }
        }
        
        return (int)Math.abs(count - (n - count));
    }
}