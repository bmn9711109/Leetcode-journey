package DataStructure21Days.Questions.Day1;

import java.util.HashMap;
import java.util.Map;

/*
给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

示例1：

输入：nums = [3,2,3]
输出：3
示例2：

输入：nums = [2,2,1,1,1,2,2]
输出：2
 */
public class LeetCode169 {
    public int majorityElement(int[] nums) throws Exception {
        int total = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > total/2) {
                return key;
            }
        }
        throw new Exception("input is illegal.");
    }
}
