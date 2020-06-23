package recursion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordSearchTwo {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> foundList = new TreeSet<>();
        Stack<Character> path = new Stack<>();

        for(var word : words) {
            boolean isFound = false;
            path.clear();
            int[][] marks = new int[board.length][board[0].length];
            for (int i = 0; i < board.length && !isFound; i++) {
                for (int j = 0; j < board[0].length && !isFound; j++) {
                    if(checkForOneDirection(board, word, marks, i, j, path)){
                        isFound = true;
                    }
                }
            }
            if(isFound) {
                foundList.add(word);
            }
        }

        return foundList.stream().collect(Collectors.toList());
    }

    private boolean existRecursive(char[][] board, String word, int[][] marks, int i, int j, Stack<Character> path) {
        if(path.size() == word.length()) {
            return true;
        }
        else {
            //check i + 1,j
            if(checkForOneDirection(board, word, marks, i + 1, j, path)){
                return true;
            };
            //check i - 1,j
            if(checkForOneDirection(board, word, marks, i - 1, j, path)){
                return true;
            };
            //check i, j + 1,
            if(checkForOneDirection(board, word, marks, i, j + 1, path)){
                return true;
            };
            //check i, j - 1,
            if(checkForOneDirection(board, word, marks, i, j - 1, path)){
                return true;
            };
        }
        return false;
    }

    private boolean checkForOneDirection(char[][] board, String word, int[][] marks, int i, int j, Stack<Character> path) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if(marks[i][j] == 0) {
            int pathLength = path.size();
            if(board[i][j] == word.charAt(pathLength)) {
                marks[i][j] = 1;
                path.add(board[i][j]);
                if(existRecursive(board, word, marks, i, j, path)) {
                    return true;
                }
                path.pop();
                marks[i][j] = 0;
            }
        }
        return false;
    }

    public List<String> findWordsWithOptimize(char[][] board, String[] words) {
        Set<String> foundList = new TreeSet<>();
        Stack<Character> path = new Stack<>();
        int[][] marks = new int[board.length][board[0].length];
        path.clear();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                checkForOneDirectionForWords(board, words, marks, i, j, path, foundList);
            }
        }
        return foundList.stream().collect(Collectors.toList());
    }

    private void existRecursiveForWords(char[][] board, String[] words, int[][] marks, int i, int j, Stack<Character> path, Set<String> foundList) {
        if(path.size() > Stream.of(words).mapToInt(s -> s.length()).max().getAsInt()) {
            return;
        }
        else {
            //check i + 1,j
            checkForOneDirectionForWords(board, words, marks, i + 1, j, path,foundList);
            //check i - 1,j
            checkForOneDirectionForWords(board, words, marks, i - 1, j, path, foundList);
            //check i, j + 1,
            checkForOneDirectionForWords(board, words, marks, i, j + 1, path, foundList);
            //check i, j - 1,
            checkForOneDirectionForWords(board, words, marks, i, j - 1, path, foundList);
        }
    }

    private void checkForOneDirectionForWords(char[][] board, String[] words, int[][] marks, int i, int j, Stack<Character> path, Set<String> foundList) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return;
        }
        if(marks[i][j] == 0) {
            int pathLength = path.size();
            for(var word: words) {
                if(board[i][j] == word.charAt(pathLength)) {
                    marks[i][j] = 1;
                    path.add(board[i][j]);
                    existRecursiveForWords(board, words, marks, i, j, path, foundList);
                    path.pop();
                    marks[i][j] = 0;
                }
            }
        }
    }
}
