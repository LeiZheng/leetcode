package dynamicprom;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0) return true;
        for(String letter : wordDict) {
           if(s.contains(letter)) {
               String[] splitedStrings = s.split(letter);
               boolean isBreak = true;
               for(var newS : splitedStrings) {
                   if(newS.length() > 0 && !wordBreak(newS, wordDict)) {
                       isBreak = false;
                       break;
                   }
               }
               if(isBreak) {
                   return true;
               }
           }
        }
        return false;
    }

    public boolean wordBreakDynamic(String s, List<String> wordDict) {
        if(s.length() == 0) return true;
        int[][] mark = new int[s.length()][s.length()];
        wordBreakDynamicRecur(s, wordDict, mark, 0, s.length() - 1);
        return mark[0][s.length() - 1] == 1;
    }

    private void wordBreakDynamicRecur(String s, List<String> wordDict, int[][] mark, int start, int end) {
        if(start > end) return;
        if(mark[start][end] != 0) return;
        if(wordDict.contains(s.substring(start, end + 1))) {
            mark[start][end] = 1;
        }
        else {
            for(int i = start; i < end; i ++) {
                wordBreakDynamicRecur(s, wordDict, mark, start, i);
                wordBreakDynamicRecur(s, wordDict, mark, i + 1, end);
                if(mark[start][i] == 1 && mark[i + 1][end] == 1) {
                    mark[start][end] = 1;
                    break;
                }
                else {
                    mark[start][end] = -1;
                }
            }
        }
    }


    public boolean wordBreakDynamic2(String s, List<String> wordDict) {
        if(s.length() == 0) return true;
        int[] mark = new int[s.length() + 1];
        mark[0] = 1;
        for(int i = 1; i <= s.length(); i ++) {
            for(int j = 0; j < i; j ++) {
               if(mark[j] == 1 && wordDict.contains(s.substring(j, i))){
                   mark[i] = 1;
                   break;
               }
            }
        }
        return mark[s.length()] == 1;
    }
}
