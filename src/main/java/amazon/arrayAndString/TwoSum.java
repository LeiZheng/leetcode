package amazon.arrayAndString;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

    public int[] Solution1(int[] nums, int target) {
        assert nums.length >= 2;
        int[] retIndex = null;
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i; j < nums.length; j ++) {
                if(nums[i] + nums[j] == target) {
                    retIndex = new int[] {i, j};
                    return retIndex;
                }
            }
        }
        return retIndex;
    }

    public int[] Solution2(int[] nums, int target) {
        // TODO: use array instead of MAP to improve the memory usage.
        Map<Integer, Integer> valeToIndexMap = new HashMap<>();
        int[] retIndex = null;
        for(int index = 0; index < nums.length; index ++) {
            int secNumber = nums[index];
            int firstNumber = target - secNumber;
            Integer firstIndex = valeToIndexMap.get(firstNumber);
            if(firstIndex != null) {
                retIndex = new int[] {firstIndex, index };
                break;
            }
            valeToIndexMap.put(secNumber, index);
        }
        return retIndex;
    }
}
