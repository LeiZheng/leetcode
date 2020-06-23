package graph;

import java.util.*;

public class WordLadder {
    int minStep = Integer.MAX_VALUE;
    Map<String, List<String>> pathCaches = new HashMap<>();
    Map<String, Integer> stringToIndexMap = new HashMap<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        int[] flags = new int[wordList.size()];
        int[] minFlags = new int[wordList.size()];
        Arrays.fill(flags, -1);
        Arrays.fill(minFlags, Integer.MAX_VALUE);
        for(int i = 0; i < wordList.size(); i ++) {
            stringToIndexMap.put(wordList.get(i), i);
            if(isMaxOneCharDiff(wordList.get(i), beginWord)) {
                addToPathCaches(beginWord, wordList.get(i));
            }
        }
        for(int i = 0; i < wordList.size(); i ++) {
            for(int j = i + 1; j < wordList.size(); j ++) {
                if(isMaxOneCharDiff(wordList.get(i), wordList.get(j))) {
                    addToPathCaches(wordList.get(i), wordList.get(j));
                    addToPathCaches(wordList.get(j), wordList.get(i));

                }
            }
        }
        ladderLengthRecursive(beginWord, endWord, flags, minFlags, 0, wordList);
        return minStep == Integer.MAX_VALUE ? 0 : minStep + 1;
    }

    private void addToPathCaches(String from, String to) {
        List<String> toPaths = pathCaches.get(from);
        if(toPaths == null) {
            toPaths = new ArrayList<>();
        }
        toPaths.add(to);
        pathCaches.put(from, toPaths);

    }

    private boolean ladderLengthRecursive(String beginWord, String endWord, int[] flags, int[] minFlags, int deep, List<String> wordList) {
        if(beginWord.equalsIgnoreCase(endWord)) {
            minStep  = Math.min(deep, minStep);
            return true;
        }
        if(deep >= wordList.size()) return false;
        for(String nextPaths : pathCaches.getOrDefault(beginWord, new ArrayList<>())) {
            int i = stringToIndexMap.get(nextPaths);
            if(minFlags[i] <= deep) continue;
            flags[i] = deep;
            if(ladderLengthRecursive(wordList.get(i), endWord, flags, minFlags, deep + 1, wordList)) {
                minFlags[i] = deep;
            }
            flags[i] = -1;
        }
        return false;
    }

    private boolean isMaxOneCharDiff(String src, String target) {
        int totalDiff = 0;
        for(int i = 0; i < src.length(); i ++) {
            if(src.charAt(i) != target.charAt(i)) {
                totalDiff ++;
            }
            if(totalDiff > 1) {
                return false;
            }
        }

        return totalDiff == 1;
    }
}