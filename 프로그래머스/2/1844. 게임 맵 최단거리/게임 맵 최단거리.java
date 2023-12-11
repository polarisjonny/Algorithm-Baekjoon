import java.util.*;

class Solution {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    
    public static boolean[][] isVisited;
    
    
    
    public int solution(int[][] maps) {
        isVisited = new boolean[maps.length + 1][maps[0].length + 1];
        
        bfs(0, 0, maps);
        
        if(isVisited[maps.length -1][maps[0].length -1]) {
            return maps[maps.length-1][maps[0].length-1];
        } else {
            return -1;
        }
                                             
    }
    
    public static void bfs(int x, int y, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        
        isVisited[x][y] = true;
        
        queue.offer(new int[]{x, y});
        
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            
            
            for(int i = 0; i < 4; i++) {
                int nextX = temp[0] + dx[i];
                int nextY = temp[1] + dy[i];
                
                if(nextX < 0 || nextY < 0 || nextX >= maps.length || nextY >= maps[0].length) continue;
                if(maps[nextX][nextY] == 0) continue;
                
                if(!isVisited[nextX][nextY]) {
                    isVisited[nextX][nextY] = true;
                    maps[nextX][nextY] = maps[temp[0]][temp[1]] + 1;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
    }
}