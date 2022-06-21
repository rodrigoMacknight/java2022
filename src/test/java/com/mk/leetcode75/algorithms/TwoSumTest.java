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
        assertArrayEquals(ret, toTest.twoSum(nums, 9));
    }

    @Test
    void anotherArrayTest() {
        toTest = new TwoSum();
        int[] nums = {3,3};
        int[] ret = {0,1};
        assertArrayEquals(ret, toTest.twoSum(nums, 6));
    }
    @Test
    void yetAnotherArrayTest() {
        toTest = new TwoSum();

        int[] nums = {-1,-2,-3,-4,-5};
        int[] ret = {2,4};
        assertArrayEquals(ret, toTest.twoSum(nums,   -8));
    }



}
