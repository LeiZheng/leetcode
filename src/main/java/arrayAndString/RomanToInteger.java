package arrayAndString;

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class RomanToInteger {
    public int intToRoman(String roman) {
        int num = 0;
        for(int i = 0; i < roman.length(); i ++) {
            char c = roman.charAt(i);
            switch (c) {
                case 'I':
                    if(i < roman.length() - 1) {
                        char nextC = roman.charAt(i + 1);
                        if(nextC == 'V') {
                            num +=4;
                            i ++;
                        }
                        else if(nextC == 'X') {
                            num +=9;
                            i ++;
                        }
                        else{
                            num += 1;
                        }
                    }
                    else {
                        num += 1;
                    }

                    break;
                case 'V':
                   num += 5;
                    break;
                case 'X':
                    if(i < roman.length() - 1) {
                        char nextC = roman.charAt(i + 1);
                        if(nextC == 'L') {
                            num +=40;
                            i ++;
                        }
                        else if(nextC == 'C') {
                            num += 90;
                            i ++;
                        }
                        else{
                            num += 10;
                        }
                    }
                    else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i < roman.length() - 1) {
                        char nextC = roman.charAt(i + 1);
                        if(nextC == 'D') {
                            num +=400;
                            i ++;
                        }
                        else if(nextC == 'M') {
                            num += 900;
                            i ++;
                        }
                        else{
                            num += 100;
                        }
                    }
                    else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}
