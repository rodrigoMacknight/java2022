package com.mk.leetcode75.algorithms;

public class MaxProductSubarray {
    public int getMaxSubarrayProduct(int[] nums) {
        int max = nums[0];
        int curr;
        for (int i = 0; i < nums.length; i++) {
            curr = 1;
            for (int j = i; j < nums.length; j++) {

             curr = curr * nums[j];
             max = Integer.max(curr, max);
            }
        }
        return max;
    }
}
