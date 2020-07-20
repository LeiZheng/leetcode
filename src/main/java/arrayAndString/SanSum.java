package arrayAndString;

import java.util.*;

public class SanSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> firstCache = new HashSet<>();
        Set<Integer> cache = new HashSet<>();
        List<List<Integer>> allCombines = new ArrayList<>();

        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] <= 0 && !firstCache.contains(nums[i])) {
                cache.clear();
                Set<Integer> resultCache = new HashSet<>();
                for(int j = i + 1; j < nums.length; j ++) {
                    if(cache.contains(-nums[i] - nums[j]) && !resultCache.contains(nums[j])) {
                        allCombines.add(Arrays.asList(nums[i], 0 - nums[i] - nums[j], nums[j]));
                        resultCache.add(nums[j]);
                    }
                    cache.add(nums[j]);
                }
            }
            firstCache.add(nums[i]);
        }
        return allCombines;
    }
}
