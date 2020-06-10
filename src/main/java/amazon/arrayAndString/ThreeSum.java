package amazon.arrayAndString;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSumWithSort(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int firstIndex = 0; firstIndex < nums.length; ) {
            int firstVal = nums[firstIndex];
            int secIndex = firstIndex +1;
            int thirdIndex = nums.length -1;
            if(firstVal > 0) {
                break;
            }
            while (secIndex < thirdIndex) {
                int secVal = nums[secIndex];
                int thirdVal = nums[thirdIndex];
                if(firstVal + nums[secIndex] + nums[thirdIndex] == 0) {
                    result.add(Arrays.asList(firstVal, nums[secIndex], nums[thirdIndex]));
                    while(--thirdIndex >= 0 && nums[thirdIndex] == thirdVal);
                    while(++ secIndex < nums.length && nums[secIndex] == secVal);
                }
                else if(firstVal + nums[secIndex] + nums[thirdIndex] > 0){
                    while(--thirdIndex >= 0 && nums[thirdIndex] == thirdVal);
                }
                else if(firstVal + nums[secIndex] + nums[thirdIndex] < 0){
                    while(++ secIndex < nums.length && nums[secIndex] == secVal);
                }
            }
            while(++ firstIndex < nums.length && nums[firstIndex] == firstVal);
        }
        return result;
    }
    public List<List<Integer>> threeSumWithoutSort(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        Set<TwoNumber> existingPair = new HashSet<>();
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j ++) {
                int thirdNum = - nums[i] - nums[j];
                if(thirdNum > 0) {
                    continue;
                }
                if(valueToIndexMap.get(thirdNum) != null && valueToIndexMap.get(thirdNum) != j){
                    int maxValue = Math.max(thirdNum, Math.max(nums[i], nums[j]));
                    int minValue = Math.min(thirdNum, Math.min(nums[i], nums[j]));
                    if(!existingPair.contains(new TwoNumber(maxValue, minValue))) {
                        existingPair.add(new TwoNumber(maxValue, minValue));
                        result.add(Arrays.asList(minValue, 0 - minValue - maxValue, maxValue));
                        break;
                    }
                }
            }
            valueToIndexMap.put(nums[i], i);
        }
        return result;
    }



    private class TwoNumber {
        private final int maxValue;
        private final int minValue;

        public TwoNumber(int maxValue, int minValue) {

            this.maxValue = maxValue;
            this.minValue = minValue;
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(maxValue).hashCode() * 17 + Integer.valueOf(minValue).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            TwoNumber twoNumber = (TwoNumber) obj;
            return this.maxValue == twoNumber.maxValue
                    && this.minValue == twoNumber.minValue;
        }
    }
}
