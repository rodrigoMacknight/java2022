package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubarrayTest {

    MaxSubarray toTest;

    /*
    Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    Example 2:

    Input: nums = [1]
    Output: 1
    Example 3:

    Input: nums = [5,4,-1,7,8]
    Output: 23
     */

    @Test
    void checkMaxSubarray() {
        toTest = new MaxSubarray();
        int[] nums = {5,4,-1,7,8};
        int response = 23;
        assertEquals(response, toTest.getMaxSubarray(nums));
    }

    @Test
    void checkMaxSubarrayYetAgain() {
        toTest = new MaxSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int response = 6;
        assertEquals(response, toTest.getMaxSubarray(nums));
    }
    @Test
    void checkMaxSubarrayOptimized() {
        toTest = new MaxSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int response = 6;
        assertEquals(response, toTest.getOptimunMaxSubarray(nums));
    }

    @Test
    void checkMaxSubarrayOptimizedNegatives() {
        toTest = new MaxSubarray();
        int[] nums = {-2,-3, -5};
        int response = -2;
        assertEquals(response, toTest.getOptimunMaxSubarray(nums));
    }


}
