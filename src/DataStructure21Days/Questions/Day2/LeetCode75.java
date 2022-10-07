package DataStructure21Days.Questions.Day2;

/*
给定一个包含红色、白色和蓝色、共n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。

必须在不使用库的sort函数的情况下解决这个问题。

示例 1：

输入：nums = [2,0,2,1,1,0]
输出：[0,0,1,1,2,2]
示例 2：

输入：nums = [2,0,1]
输出：[0,1,2]
*/

import java.util.HashMap;
import java.util.Map;

public class LeetCode75 {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int zeroCount = map.get(0) == null ? 0 : map.get(0);
        int oneCount = map.get(1) == null ? 0 : map.get(1);
        for (int i = 0; i < zeroCount; i ++) {
            nums[i] = 0;
        }
        for (int j = zeroCount; j < zeroCount + oneCount; j ++) {
            nums[j] = 1;
        }
        for (int k = zeroCount + oneCount; k < nums.length; k ++) {
            nums[k] = 2;
        }
    }
}
