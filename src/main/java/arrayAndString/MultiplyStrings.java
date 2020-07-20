package arrayAndString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        List<Character> result = new ArrayList<>();
        result.add('0');
        for(int i = num1.length() - 1; i >= 0; i -- ) {
            for(int j = num2.length() - 1; j >= 0; j --) {
                int v1 = num1.charAt(i) - '0';
                int v2 = num2.charAt(j) - '0';
                int mul = v1 * v2;
                int tenTh = mul / 10;
                int dig = mul % 10;
                int tenIndex = num1.length() - i + num2.length() - j - 1;
                int digIndex = tenIndex - 1;
                boolean isOverflow = false;
                if(result.size() <= digIndex) {
                    result.add('0');
                }

                int sum = result.get(digIndex) - '0' + dig;
                if(sum >= 10) {
                    isOverflow = true;
                    result.set(digIndex, (char)(sum - 10 + '0'));
                }
                else {
                    isOverflow = false;
                    result.set(digIndex, (char)(sum + '0'));
                }

                if(tenTh > 0) {
                    digIndex ++;
                    if(result.size() <= digIndex) {
                        result.add('0');
                    }
                    sum = result.get(digIndex) - '0' + tenTh + (isOverflow ? 1 : 0);
                    if(sum >= 10) {
                        isOverflow = true;
                        result.set(digIndex, (char)(sum - 10 + '0'));
                    }
                    else {
                        result.set(digIndex, (char)(sum + '0'));
                        isOverflow = false;
                    }
                }

                while(isOverflow) {
                    digIndex ++;
                    if(result.size() <= digIndex) {
                        result.add('0');
                    }
                    sum = result.get(digIndex) - '0' + 1;
                    if(sum >= 10) {
                        isOverflow = true;
                        result.set(digIndex, '0');
                    }
                    else {
                        result.set(digIndex, (char)(sum + '0'));
                        isOverflow = false;
                    }
                }

            }
        }
        if(result.stream().allMatch(c -> c == '0')) {
            result.clear();
            result.add('0');
        }
        else {
            Collections.reverse(result);
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
