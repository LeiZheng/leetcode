package arrayAndString;

import java.util.Collections;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charA = new StringBuilder(a).reverse().toString().toCharArray();
        char[] charB = new StringBuilder(b).reverse().toString().toCharArray();
        char[] charSum = new char[Math.max(a.length(), b.length())];
        int i;
        int carryOver = 0;
        for( i = 0; i < charA.length && i < charB.length; i ++ ) {
            int sum = charA[i] - '0' + charB[i] - '0' + carryOver;
            carryOver = sum / 2;
            charSum[i] = (char)(sum % 2 + '0');
        }
        for(; i < charA.length; i ++) {
            int sum = charA[i] - '0' + carryOver;
            carryOver = sum / 2;
            charSum[i] = (char)(sum % 2 + '0');
        }
        for(; i < charB.length; i ++) {
            int sum = charB[i] - '0' + carryOver;
            carryOver = sum / 2;
            charSum[i] = (char)(sum % 2 + '0');
        }
        StringBuilder result = new StringBuilder();
        result.append(charSum);
        if(carryOver == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
