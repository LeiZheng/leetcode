package amazon.arrayAndString;

import java.util.*;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> numToRoman = new HashMap();
        numToRoman.put(1, "I");
        numToRoman.put(2, "II");
        numToRoman.put(3, "III");
        numToRoman.put(4, "IV");
        numToRoman.put(5, "V");
        numToRoman.put(6, "VI");
        numToRoman.put(7, "VII");
        numToRoman.put(8, "VIII");
        numToRoman.put(9, "IX");
        numToRoman.put(10, "X");
        numToRoman.put(20, "XX");
        numToRoman.put(30, "XXX");
        numToRoman.put(40, "XL");
        numToRoman.put(50, "L");
        numToRoman.put(60, "LX");
        numToRoman.put(70, "LXX");
        numToRoman.put(80, "LXXX");
        numToRoman.put(90, "XC");
        numToRoman.put(100, "C");
        numToRoman.put(200, "CC");
        numToRoman.put(300, "CCC");
        numToRoman.put(400, "CD");
        numToRoman.put(500, "D");
        numToRoman.put(600, "DC");
        numToRoman.put(700, "DCC");
        numToRoman.put(800, "DCCC");
        numToRoman.put(900, "CM");
        numToRoman.put(1000, "M");
        numToRoman.put(2000, "MM");
        numToRoman.put(3000, "MMM");
        int newVal = num;
        List<String> romanStr = new LinkedList<>();
        int multiper = 1;
        for(int i = 0; i < 4 && newVal > 0; i ++) {
            int residual = newVal % 10;
            if(residual != 0) {
                romanStr.add(0, numToRoman.get(residual * multiper));
            }
            newVal = newVal / 10;
            multiper = multiper * 10;
        }
        return String.join("", romanStr);
    }
}
