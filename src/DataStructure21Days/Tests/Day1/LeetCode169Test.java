package DataStructure21Days.Tests.Day1;

import DataStructure21Days.Questions.Day1.LeetCode169;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode169Test {

    @Test
    void majorityElement() throws Exception {
        LeetCode169 leetCode169 = new LeetCode169();
        int[] nums1 = new int[]{3, 2, 3};
        int[] nums2 = new int[]{2,2,1,1,1,2,2};
        int[] nums3 = new int[]{1, 2};
        assert leetCode169.majorityElement(nums1) == 3;
        assert leetCode169.majorityElement(nums2) == 2;
        try {
            assert leetCode169.majorityElement(nums3) == 1;
        } catch (Exception e) {
            e.equals("input is illegal.");
        }
    }
}