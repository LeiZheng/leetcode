package amazon.arrayAndString;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        // why the algrothem works?
        // for each step, the max area is max value of shorter line could be exclude the check ones.
        for(int i = 0, j = height.length - 1; i < j ;) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));

            if(height[i] < height[j]) {
                i ++;
            }
            else {
                j --;
            }
        }
        return maxArea;
    }
}
