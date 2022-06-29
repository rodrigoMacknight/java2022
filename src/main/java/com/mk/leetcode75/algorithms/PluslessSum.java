package com.mk.leetcode75.algorithms;

public class PluslessSum {
    public int add(int a, int b) {
        while (b!=0) {
            int aux = (a & b) << 1;
            a = a ^ b;
            b = aux;
        }
        return a;
    }
}
