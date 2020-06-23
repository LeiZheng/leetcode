package arrayAndString;

public class StringtoInteger {
    public int solution1(String str) {
        int result = 0;
        char[] charArray = str.toCharArray();
        boolean isFirstParsed = false;
        boolean isNeg = false;
        for(int i = 0; i < charArray.length; i ++) {
            if(isFirstParsed) {
                if (charArray[i] == ' ' || charArray[i] == '-'|| charArray[i] == '+') {
                    break;
                }
                else if (charArray[i] <= '9' && charArray[i] >= '0') {
                    int singleValue = charArray[i] - '0';
                    if(isNeg) {
                        int checkVal1 = Integer.MIN_VALUE / 10;
                        int checkVal2 = Integer.MIN_VALUE % 10;
                        if(-result<checkVal1 || (-result == checkVal1 && -singleValue <= checkVal2)) {
                            return Integer.MIN_VALUE;
                        }
                    }
                    else {
                        int checkVal1 = Integer.MAX_VALUE / 10;
                        int checkVal2 = Integer.MAX_VALUE % 10;
                        if(result > checkVal1 || result == checkVal1 && singleValue > checkVal2) {
                            return Integer.MAX_VALUE;
                        }
                    }

                    result = result * 10 + singleValue;
                }
                else if(charArray[i] == '.') {
                    break;
                }
                else if(charArray[i] == '-'|| charArray[i] == '+') {
                    result = 0;
                    break;
                }
                else{
                    break;
                }
            }
            else {

                if (charArray[i] == ' ') {
                    continue;
                } else if (charArray[i] == '-') {
                    isFirstParsed = true;
                    isNeg = true;
                } else if (charArray[i] <= '9' && charArray[i] >= '0') {
                    isFirstParsed = true;
                    result = result * 10 + charArray[i] - '0';
                }
                else if(charArray[i] == '+') {
                    isFirstParsed = true;
                    continue;
                }
                else {
                    isFirstParsed = true;
                    break;
                }
            }
        }
        return isNeg ? (-1) * result : result;
    }
}
