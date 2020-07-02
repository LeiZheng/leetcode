package sort;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1 = 0;
        int right1 = nums1.length - 1;
        int left2 = 0;
        int right2 = nums2.length - 1;
        int checkLeftNumber = Integer.MIN_VALUE;
        int checkRightNumber = Integer.MAX_VALUE;
        for(; checkLeftNumber < checkRightNumber; ) {
            if(left2 < nums2.length && left1 < nums1.length) {
                if(nums1[left1] <= nums2[left2]) {
                    checkLeftNumber = nums1[left1++];
                }
                else {
                    checkLeftNumber = nums2[left2++];
                }
            }
            else if(left1 < nums1.length){
                checkLeftNumber = nums1[left1 ++];
            }
            else if(left2 < nums2.length){
                checkLeftNumber = nums2[left2 ++];
            }


            if(right1 >=0 && right2 >=0) {
                if(nums1[right1] <= nums2[right2]) {
                    checkRightNumber = nums2[right2 --];
                }
                else {
                    checkRightNumber = nums1[right1 --];
                }
            }
            else if(right1 >= 0){
                checkRightNumber = nums1[right1 --];
            }
            else if(right2 >= 0){
                checkRightNumber = nums2[right2 --];
            }
        }
        return (checkLeftNumber + checkRightNumber ) / 2.0;
    }
}
