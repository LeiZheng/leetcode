package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int[] marks = new int[nums.length];
        subsetsRecur(nums, marks, 0, subsets);
        return subsets;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(Arrays.asList());
        for(int i = 0; i < nums.length; i ++) {
            int size = subsets.size();
            for(int j = 0; j < size; j ++) {
                List newList = new ArrayList(subsets.get(j));
                newList.add(nums[i]);
                subsets.add(newList);
            }
        }
        return subsets;
    }


    private void subsetsRecur(int[] nums, int[] marks, int deep, List<List<Integer>> subsets) {
        if(deep == nums.length) {
            List<Integer> foundList = IntStream.range(0, nums.length).filter(i -> marks[i] == 1).boxed().map(i -> nums[i])
                    .collect(Collectors.toList());

            subsets.add(foundList);

            return;
        }
        subsetsRecur(nums, marks, deep + 1, subsets);
        marks[deep] = 1;
        subsetsRecur(nums, marks, deep + 1, subsets);
        marks[deep] = 0;
    }
}
