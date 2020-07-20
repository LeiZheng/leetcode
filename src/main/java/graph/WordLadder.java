package graph;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int endIndex = wordList.indexOf(endWord);
        if(endIndex < 0) return 0;
        List<String> allWords = new ArrayList<>(wordList);
        allWords.add(0, beginWord);
        int[][] edges = initEdges(allWords);
        int curr = 0;
        int[] marks = new int[edges.length];
        for(int i = 0; i < edges.length; i ++) {
            if(curr == -1) {
                break;
            }
            for(int j = 1; j < edges.length; j ++) {
                if(edges[0][curr] != Integer.MAX_VALUE && edges[curr][j] != Integer.MAX_VALUE) {
                    edges[0][j] = Math.min(edges[0][curr] + edges[curr][j], edges[0][j]);
                }
            }
            marks[curr] = 1;
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = 0; j < edges.length; j ++) {
                if(marks[j] < 1 && edges[0][j] < minValue) {
                    minValue = edges[0][j];
                    minIndex = j;
                }
            }
            curr = minIndex;
        }
        int step = edges[0][wordList.indexOf(endWord) + 1];
        return  step == Integer.MAX_VALUE ? 0 : step + 1;
    }

    private int[][] initEdges(List<String> allWords) {
        int edges[][] = new int[allWords.size()][allWords.size()];
        for(int i = 0; i < allWords. size(); i ++) {
            for(int j = i + 1; j < allWords.size(); j ++) {
                edges[i][j] = canGo(allWords.get(i), allWords.get(j));
                edges[j][i] = edges[i][j];
            }
        }
        return edges;
    }

    private int canGo(String s, String t) {
        int diff = 0;
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) != t.charAt(i)) {
                diff ++;
            }
            if(diff == 2) {
                return Integer.MAX_VALUE;
            }
        }
        return diff == 1 ? diff : Integer.MAX_VALUE;
    }
}