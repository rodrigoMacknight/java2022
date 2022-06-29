package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Given an integer array nums, find a contiguous non-empty
 subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

 */
public class MaxProductSubarrayTest {
    MaxProductSubarray toTest;

    @Test
    void testMaxProductSubarray(){
        toTest = new MaxProductSubarray();
        int[] nums = {2,3,-2,4};

       int expectedResponse = 6;
       assertEquals(expectedResponse, toTest.getMaxSubarrayProduct(nums));

    }

    @Test
    void testMaxProductSubarrayAgain(){
        toTest = new MaxProductSubarray();
        int[] nums = {-2,0,-1};

        int expectedResponse = 0;
        assertEquals(expectedResponse, toTest.getMaxSubarrayProduct(nums));

    }

    @Test
    void testMPSwithOneElement(){
        toTest = new MaxProductSubarray();
        int[] nums = {-2};

        int expectedResponse = -2;
        assertEquals(expectedResponse, toTest.getMaxSubarrayProduct(nums));

    }

}
