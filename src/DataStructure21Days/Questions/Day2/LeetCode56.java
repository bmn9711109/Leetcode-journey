package DataStructure21Days.Questions.Day2;

/*
以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，
并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。

示例 1：

输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
输出：[[1,6],[8,10],[15,18]]
解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例2：

输入：intervals = [[1,4],[4,5]]
输出：[[1,5]]
解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        // 排序，按第一位数字排序
        if (intervals.length == 1) {
            return intervals;
        }
        sortIntervals(intervals);
        List<int[]> result = new ArrayList<int[]>(Collections.singleton(intervals[0]));
        for (int i = 1; i < intervals.length; i ++) {
            getIntervals(result.get(result.size() - 1), intervals[i], result);
        }
        int len = result.size();
        int[][] ans = new int[len][];
        for (int i = 0; i < len; i ++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private void getIntervals(int[] left, int[] right, List<int[]> result) {
        if (left[1] < right[0]) {
            result.add(right);
        } else {
            if (left[1] < right [1]) {
                int[] tmp = new int[]{left[0], right[1]};
                result.set(result.size() - 1, tmp);
            }
        }
    }

    private void sortIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
    }
}
