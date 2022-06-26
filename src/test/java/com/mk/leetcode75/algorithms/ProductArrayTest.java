package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductArrayTest {

    ProductArray toTest;

    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]

    @Test
    void testProductArray() {
        toTest = new ProductArray();
        int[] response = {24,12,8,6};
        int[] input = {1,2,3,4};
        assertArrayEquals(response, toTest.calculatePArray(input));
    }

    @Test
    void testProductArrayAgain() {
        toTest = new ProductArray();

        int[] response = {0,0,9,0,0};
        int[] input = {-1,1,0,-3,3};
        assertArrayEquals(response, toTest.calculatePArray(input));
    }


    @Test
    void testProductArrayOptimized() {
        toTest = new ProductArray();
        int[] response = {24,12,8,6};
        int[] input = {1,2,3,4};
        assertArrayEquals(response, toTest.calculateProductArray(input));
    }


}
