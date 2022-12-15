package solutions;

import java.util.HashMap;

public class P0001_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        var remainIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (remainIndexMap.containsKey(nums[i])) {
                return new int[]{remainIndexMap.get(nums[i]), i};
            } 
            remainIndexMap.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }

}