import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int total_weight = 0;
        int time = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int truck_weight : truck_weights) {
            while(true) {
                if(bridge.isEmpty()) {
                bridge.offer(truck_weight);             
                total_weight += truck_weight;
                time++;
                break;
            } else if(bridge.size() == bridge_length) {
                total_weight -= bridge.poll();     
            } else {
                if(total_weight + truck_weight > weight) {
                    bridge.offer(0);
                    time++;
                }
                else {
                    bridge.offer(truck_weight);
                    total_weight += truck_weight;
                    time++;
                    break;
                }
            }
        }
        }  
        return time + bridge_length;
    }
}