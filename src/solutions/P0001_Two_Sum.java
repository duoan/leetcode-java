package solutions;

import java.util.HashMap;


// 两数之和（LeetCode 1）:https://leetcode-cn.com/problems/two-sum/

public class P0001_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        // 首先构建一个哈希表，用来存放数组的元素值以及索引值
        // 其中 key 是数组中的元素值
        // value 为数组中元素值的索引
        var map = new HashMap<Integer, Integer>();

        // 接下来，遍历整个数组
        for (int i = 0; i < nums.length; i++) {
            // 目标值为 target，将 target 与 nums[i] 求差
            // 获取与 nums[i] 配对的那个数 remain
            int remain = target - nums[i];

            // 判断哈希表中是否存在那个与 nums[i] 配对的数 remain
            if (remainIndexMap.containsKey(remain)) {
                // 由于哈希表中所有 key 都是来自于数组中，
                // 所以，如果发现哈希表存在那个与 nums[i] 配对的数 remain
                // 也就说明数组中存在一个数，可以和 nums[i] 相加为 target
                // 此时， remain 这个 key 对应的 value 为这个数在数组中的索引
                // 所以，返回 map.get(remain) 和 i 就是这两个值的下标
                return new int[]{remainIndexMap.get(nums[i]), i};
            } else {
                // 如果发现哈希表中目前不存在那个与 nums[i] 配对的数 anotherNum
                // 那么就把此时观察的数 nums[i] 和它的索引存放到哈希表中
                // 等待后面的数能和它配对为 target
                remainIndexMap.put(nums[i], i);
            }
            
        }
        // 如果遍历完整个数组都找不到和为 target 的两个数，返回 {-1, -1}
        return new int[]{-1, -1};
    }

}