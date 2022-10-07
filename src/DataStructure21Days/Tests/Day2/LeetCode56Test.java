package DataStructure21Days.Tests.Day2;

import DataStructure21Days.Questions.Day2.LeetCode56;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode56Test {

    @Test
    void merge() {
        LeetCode56 leetCode56 = new LeetCode56();
        int[][] intervals = new int[][]{{1,3},{2,6},{15,18},{8,10},{8,9}};
        int[][] intervals2 = new int[][]{{3,5},{0,0},{4,4},{0,2},{5,6},{4,5},{3,5},{1,3},{4,6},{4,6},{3,4}};
        int[][] intervals3 = new int[][]{{1,4},{2,3}};
        leetCode56.merge(intervals3);
    }
}