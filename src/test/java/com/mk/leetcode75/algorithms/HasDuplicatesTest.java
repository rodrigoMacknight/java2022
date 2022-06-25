package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HasDuplicatesTest {

    HasDuplicates toTest;

    @Test
    void checkHasDuplicatesWorks() {
        toTest = new HasDuplicates();
        int[] firstArray = {1,2,3,1};
        assertEquals(true, toTest.containsDuplicates(firstArray));
    }

    @Test
    void checkHasDuplicatesWorksAgain() {
        toTest = new HasDuplicates();
        int[] firstArray = {1,2,3,4};
        assertEquals(false, toTest.containsDuplicates(firstArray));
    }
}
