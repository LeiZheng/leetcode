package amazon.arrayAndString;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int totalNumsSum = IntStream.of(nums).sum();
        int expectedSum = (0 + nums.length ) * (nums.length + 1) / 2;
        return expectedSum - totalNumsSum;
    }
}
