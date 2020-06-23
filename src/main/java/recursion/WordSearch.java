package recursion;

import java.util.Stack;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        Stack<Character> path = new Stack<>();
        int[][] marks = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(checkForOneDirection(board, word, marks, i, j, path)){
                    return true;
                }
            }
        }
        return false;
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
}
