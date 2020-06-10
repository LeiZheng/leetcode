package amazon.arrayAndString;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        for(int i = 0; i < results.length; i ++) {
            results[i] = 1;
        }
        // calc the left part.
        int mult = 1;
        for(int i = 0; i < nums.length - 1; i ++) {
            mult = mult * nums[i];
            results[i + 1] *= mult;
        }
        mult = 1;
        for(int i = nums.length - 1; i >= 1; i --) {
            mult = mult * nums[i];
            results[i - 1] *= mult;
        }
        return results;
    }
}
