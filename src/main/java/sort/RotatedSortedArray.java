package sort;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int startIndex = 0;
        int endIndex = nums.length - 1;
        for(;startIndex < endIndex;) {
            int midIndex = (startIndex + endIndex) / 2;
            if(nums[midIndex] > nums[endIndex]) {// rotate sort in side.
                startIndex = midIndex + 1;
            }
            else {
                endIndex = midIndex;
            }
        }
        int rorateIndex = startIndex;
        if(target <= nums[nums.length - 1]) {
            startIndex = rorateIndex;
            endIndex = nums.length - 1;
        }
        else {
            startIndex = 0;
            endIndex = rorateIndex;
        }
        for(;startIndex <= endIndex;) {
            int midIndex = (startIndex + endIndex) / 2;
            if(nums[midIndex] == target) {// rotate sort in side.
                return midIndex;
            }
            else if(nums[midIndex] > target){
                endIndex = midIndex - 1;
            }
            else {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
