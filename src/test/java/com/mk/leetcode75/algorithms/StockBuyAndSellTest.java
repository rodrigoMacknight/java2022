package com.mk.leetcode75.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockBuyAndSellTest {
    StockBuyAndSell toTest;
    @Test
    void testMaxProfit() {
        toTest = new StockBuyAndSell();
        Integer[] prices = {7,1,5,3,6,4};
        assertEquals(5, toTest.maxProfit(prices));
    }
}
