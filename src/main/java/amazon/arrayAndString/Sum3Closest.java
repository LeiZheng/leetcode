package amazon.arrayAndString;

import java.util.Arrays;

public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closedVal  = nums[0] + nums[1] + nums[2];
        boolean isFound = false;
        for(int firstIndex = 0; firstIndex < nums.length && !isFound; ) {
            int firstVal = nums[firstIndex];
            int secIndex = firstIndex +1;
            int thirdIndex = nums.length -1;
            while (secIndex < thirdIndex) {
                int secVal = nums[secIndex];
                int thirdVal = nums[thirdIndex];
                int sumOfAll = firstVal + nums[secIndex] + nums[thirdIndex];
                int gap = sumOfAll - target;
                if(gap == 0) {
                    isFound = true;
                    closedVal = target;
                    break;
                }
                else if(gap > 0){
                    closedVal = (Math.abs(closedVal - target) - Math.abs(gap) > 0)
                            ? sumOfAll : closedVal;
                    while(--thirdIndex >= 0 && nums[thirdIndex] == thirdVal);
                }
                else if(gap < 0){
                    closedVal = (Math.abs(closedVal - target) - Math.abs(gap) > 0)
                            ? sumOfAll : closedVal;
                    while(++ secIndex < nums.length && nums[secIndex] == secVal);
                }
            }
            while(++ firstIndex < nums.length && nums[firstIndex] == firstVal);
        }
        return closedVal;
    }
}
