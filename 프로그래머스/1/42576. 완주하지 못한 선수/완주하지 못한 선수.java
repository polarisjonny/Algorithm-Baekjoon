import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hash = new HashMap<>();

        for(String name : participant) {
            hash.put(name, hash.getOrDefault(name, 0)+1);
        }

        for(String name : completion) {
            hash.put(name, hash.get(name) - 1);
        }

        for(String name : hash.keySet()) {
            if(hash.get(name) != 0) {
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}