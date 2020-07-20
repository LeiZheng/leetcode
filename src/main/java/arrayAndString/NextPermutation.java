package arrayAndString;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int leftPos = 0;
        for(int i = nums.length - 1; i > 0; i --) {
            if(nums[i] > nums[i - 1]) {
                leftPos = i;
                break;
            }
        }
        if(leftPos == 0) {
            Arrays.sort(nums);
        }
        else {
            int minVal = nums[leftPos];
            int i = leftPos;
            for(; i < nums.length; i ++) {

                if(nums[i] <= nums[leftPos - 1]) {
                    break;
                }
                minVal = nums[i];
            }
            nums[i - 1] = nums[leftPos - 1];
            nums[leftPos - 1] = minVal;
            Arrays.sort(nums, leftPos, nums.length);
        }

    }
}

