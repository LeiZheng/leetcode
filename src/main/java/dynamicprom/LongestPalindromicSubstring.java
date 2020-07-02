package dynamicprom;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int[][] matrix = new int[s.length()][s.length()];
        String ret = "";
        int maxLenght = 0;
        for(int k = 0; k < s.length(); k ++) {
            for(int i = 0; i + k < s.length() ; i ++) {
               if(k == 0) {
                   matrix[i][i + k] = 1;
               }
               else if(k == 1) {
                   matrix[i][i + k] = s.charAt(i) == s.charAt(i +k ) ? 1 : 0;
               }
               else {
                   if(s.charAt(i) == s.charAt(i +k )){
                       matrix[i][i + k] = matrix[i + 1][i + k - 1];
                   }
                   else {
                       matrix[i][i + k] = 0;
                   }
               }
               if(matrix[i][i + k] == 1 && maxLenght < k) {
                   ret = s.substring(i, i + k + 1);
                   maxLenght = k;
               }
            }
        }
        return  ret;
    }

}
