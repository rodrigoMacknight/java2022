package com.mk.leetcode75.algorithms;

public class MaxProductSubarray {
    public int getMaxSubarrayProduct(int[] nums) {
        int max = 0;
        int curr;
        boolean zero = false;
        for (int i = 0; i < nums.length; i++) {
            curr = 1;
            for (int j = i; j < nums.length; j++) {
             if (nums[j]==0) {
                 break;
             }
             curr = curr * nums[j];
             max = Integer.max(curr, max);
            }
        }
        return max;
    }
}
