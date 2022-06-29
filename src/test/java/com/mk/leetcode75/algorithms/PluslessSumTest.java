package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PluslessSumTest {


    PluslessSum toTest;
    @Test
    void testPlusLessSum() {
        toTest = new PluslessSum();


        //9
        // 11
        // 1001
        // 1011

        assertEquals(11, toTest.add(9,11));
    }
}
