package dynamicprom;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int accuNum = 0;
        for(int i = 0; i < nums.length; i ++) {
            accuNum = Math.max(nums[i], accuNum + nums[i]);
            maxNum = Math.max(maxNum, accuNum);
        }
        return maxNum;
    }
}
