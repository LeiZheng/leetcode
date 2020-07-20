package dynamicprom;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        List<Integer> allNumbers = new ArrayList<>();
        allNumbers.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for(;allNumbers.size() <= n;) {
            int n2 = allNumbers.get(i2) * 2;
            int n3 = allNumbers.get(i3) * 3;
            int n5 = allNumbers.get(i5) * 5;
            int minNum = Math.min(n2, Math.min(n3, n5));
            allNumbers.add(minNum);
            if(n2 == minNum) i2 ++;
            if(n3 == minNum) i3 ++;
            if(n5 == minNum) i5 ++;
        }
        return allNumbers.get(n - 1);
    }
}