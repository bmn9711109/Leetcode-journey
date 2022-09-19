package DataStructure21Days.Tests.Day1;

import DataStructure21Days.Questions.Day1.LeetCode136;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode136Test {
    public static void main(String[] args) throws Exception {
        LeetCode136 leetCode136 = new LeetCode136();
        int[] nums1 = new int[]{2, 2, 1};
        int[] nums2 = new int[]{4, 1, 2, 1, 2};
        int[] nums3 = new int[]{1};
        assert leetCode136.singleNumber(nums1) == 1;
        assert leetCode136.singleNumber(nums2) == 4;
        assert leetCode136.singleNumber(nums3) == 1;
    }
}