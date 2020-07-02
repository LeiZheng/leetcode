package sort;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < numbers.length; i ++) {
            int another = target - numbers[i];
            if(numToIndex.containsKey(another)) {
                return new int[]{numToIndex.get(another) + 1, i + 1};
            }
            else{
                numToIndex.put(numbers[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
