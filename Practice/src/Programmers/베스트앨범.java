package Programmers;

import java.util.*;

class 베스트앨범 {
    static class Song{
        int idx, play;

        public Song(int idx, int play){
            this.idx = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genreMap = new HashMap<>();
        HashMap<String, List<Song>> songMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0) + plays[i]);
            songMap.putIfAbsent(genres[i], new ArrayList<>());
            songMap.get(genres[i]).add(new Song(i, plays[i]));
        }

        List<String> genreList = new ArrayList<>(genreMap.keySet());
        genreList.sort((a, b) -> genreMap.get(b) - genreMap.get(a));

        List<Integer> answer = new ArrayList<>();

        for(String g : genreList){
            List<Song> temp = songMap.get(g);
            temp.sort((a, b) -> {
                if(a.idx == b.idx){
                    return a.idx - b.idx;
                }else{
                    return b.play - a.play;
                }
            });
            for(int i = 0; i < Math.min(2, temp.size()); i++){
                answer.add(temp.get(i).idx);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
