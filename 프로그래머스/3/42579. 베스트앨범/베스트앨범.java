import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;


class Song implements Comparable<Song> {
    int played;
    int id;
    String genre;

    public Song(int played, int id, String genre) {
        this.played = played;
        this.id = id;
        this.genre = genre;
    }

    public int compareTo(Song other) {
        if(this.played == other.played) return this.id - other.id;
        return other.played - this.played;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
      

        Map<String, Integer> genreSum = new HashMap<>();
        Map<String, List<Song>> songMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];

            int play = plays[i];

            genreSum.put(genre, genreSum.getOrDefault(genre, 0) +play);

            if(!songMap.containsKey(genre)) {
                songMap.put(genre, new ArrayList<>());
            }

            songMap.get(genre).add(new Song(play, i, genre));
        }

        List<String> genreRank = new ArrayList<>(genreSum.keySet());
        Collections.sort(genreRank, (x, y) -> genreSum.get(y) - genreSum.get(x));


        List<Integer> answerList = new ArrayList<>();

        for(String genre : genreRank) {
            Collections.sort(songMap.get(genre));
            answerList.add(songMap.get(genre).get(0).id);
            if(songMap.get(genre).size() > 1) {
                answerList.add(songMap.get(genre).get(1).id);
            }
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}