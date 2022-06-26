package com.mk.leetcode75.algorithms;

public class MaxSubarray {
    public int getMaxSubarray(int[] nums) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = i; j < nums.length; j++) {
                max  += nums[j];
                if(max> ret) {
                    ret = max;
                }

            }

        }
        return ret;
    }

    public int getOptimunMaxSubarray(int[] nums) {
      int maxSum = nums[0];
      int curSum = 0;
        for (int n: nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum +=n;
            maxSum = Integer.max(maxSum, curSum);
        }
        return maxSum;
    }

}
