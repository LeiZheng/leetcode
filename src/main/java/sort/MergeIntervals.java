package sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeIntervals {
    //assumed the value is sorted already.
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        List<int[]> result = new ArrayList<>();
        int[] prev = new int[2];
        prev[1] = Integer.MIN_VALUE;
        int[] curr = null;
        for(int i = 0; i < intervals.length; i ++) {
            curr = intervals[i];
            if(curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            }
            else {
                result.add(curr);
                prev = curr;
            }
        }
        return result.toArray(new int[0][0]);
    }
}
