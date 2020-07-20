package arrayAndString;

public class kSimilarity {
    public int kSimilarity(String A, String B) {
        int k = 0;
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        for(int i = 0; i < charA.length; i ++) {
            if(charA[i] == charB[i]) {
                continue;
            }
            else {

                int foundIndex = -1;
                for(int j = i + 1; j < charA.length; j ++) {
                    if(charB[i] == charA[j] && charB[j] == charA[i]) {
                        foundIndex = j;
                        break;
                    }
                    else  if(charB[i] == charA[j] && charB[j] != charA[j] && foundIndex < 0){
                        foundIndex = j;
                    }
                }

                if(foundIndex >= 0) {
                    k ++;
                    char temp = charA[i];
                    charA[i] = charA[foundIndex];
                    charA[foundIndex] = temp;
                }

            }
        }
        return k;
    }
}
