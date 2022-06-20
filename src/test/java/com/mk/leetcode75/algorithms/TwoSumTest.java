package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    TwoSum toTest;

    @Test
    void isTwoSumCorrect() {
        toTest = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] ret = {0,1};
        assertArrayEquals(toTest.twoSum(nums, 9), ret);
    }
}
