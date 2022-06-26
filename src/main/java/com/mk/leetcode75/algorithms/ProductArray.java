package com.mk.leetcode75.algorithms;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product
of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0] */

import java.util.Arrays;

public class ProductArray {

    public int[] calculatePArray(int[] nuns) {
        int[] ret = Arrays.copyOf(nuns, nuns.length);
        Arrays.fill(ret, 1);
        for (int i = 0; i < nuns.length; i++) {
            for (int j = 0; j < nuns.length; j++) {
                if (i != j) {
                    ret[i] = ret[i] * nuns[j];
                }
            }
        }
        return ret;
    }
    public int[] calculateProductArray(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ret[i] = 1 * nums[i];
            } else {
                ret[i] = ret[i - 1] * nums[i];
            }
        }
        int aux = 1;
        for (int i = nums.length - 1; i > -1; i--) {
            if (i == 0) {
                ret[i] = 1 * aux;
            } else {
                ret[i] = ret[i - 1] * aux;
                aux = aux * nums[i];
            }
        }
        return ret;
    }
}
