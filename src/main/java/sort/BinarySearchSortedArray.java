package sort;

public class BinarySearchSortedArray {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        for(;startIndex <= endIndex;) {
            int midIndex = (startIndex + endIndex) / 2;
            if(target == nums[midIndex]) {
                return midIndex;
            }
            else if(target > nums[midIndex]){
                startIndex = midIndex + 1;
            }
            else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
