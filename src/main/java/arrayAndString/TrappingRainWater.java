package arrayAndString;

public class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;
        int leftHeight = 0;
        int rightHeight = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            if(height[i] < height[j]) {
                leftHeight = Math.max(leftHeight, height[i]);
                sum += leftHeight - height[i];
                i ++;
            }
            else {
                rightHeight = Math.max(rightHeight, height[j]);
                sum += rightHeight - height[j];
                j --;
            }
        }
        return sum;
    }


}
