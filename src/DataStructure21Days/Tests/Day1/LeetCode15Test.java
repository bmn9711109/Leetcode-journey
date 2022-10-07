package DataStructure21Days.Tests.Day1;

import DataStructure21Days.Questions.Day1.LeetCode15;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode15Test {

    @Test
    void threeSum() {
        LeetCode15 leetCode15 = new LeetCode15();
        int[] nums1 = new int[]{-1, 1, 0};
        int[] nums2 = new int[]{0, 0, 0, 0};
        int[] nums3 = new int[]{-1,0,1,2,-1,-4};
        System.out.println(leetCode15.threeSum(nums3));
    }
}