package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        int[] marks = new int[n * 2];
        generateParenthesisRescursive(marks, 0, parenthesis);
        return parenthesis;
    }

    private void generateParenthesisRescursive(int[] marks, int deep, List<String> parenthesis) {
        if(deep == marks.length) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < marks.length; i ++) {
                sb.append(marks[i] == -1 ? '(' : ')');
            }
            parenthesis.add(sb.toString());
        }
        else {
            int leftCount = (int)IntStream.of(marks).filter(x -> x == -1).count();
            int rightCount = (int)IntStream.of(marks).filter(x -> x == 1).count();
            if(leftCount < marks.length / 2) {
                marks[deep] = -1;
                generateParenthesisRescursive(marks, deep + 1, parenthesis);
            }

            if(rightCount < leftCount) {
                marks[deep] = 1;
                generateParenthesisRescursive(marks, deep + 1, parenthesis);
            }
            marks[deep] = 0;
        }
    }

    public List<String> generateParenthesisWihtOptimize(int n) {
        List<String> parenthesis = new ArrayList<>();
        int[] marks = new int[n * 2];
        generateParenthesisRescursiveOptimizate(marks, 0, parenthesis, 0, 0);
        return parenthesis;
    }
    private void generateParenthesisRescursiveOptimizate(int[] marks, int deep, List<String> parenthesis, int leftCount, int rightCount) {
        if(deep == marks.length) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < marks.length; i ++) {
                sb.append(marks[i] == -1 ? '(' : ')');
            }
            parenthesis.add(sb.toString());
        }
        else {
            if(leftCount < marks.length / 2) {
                marks[deep] = -1;
                generateParenthesisRescursiveOptimizate(marks, deep + 1, parenthesis, leftCount + 1, rightCount);
            }

            if(rightCount < leftCount) {
                marks[deep] = 1;
                generateParenthesisRescursiveOptimizate(marks, deep + 1, parenthesis, leftCount, rightCount + 1);
            }
        }
    }
}
