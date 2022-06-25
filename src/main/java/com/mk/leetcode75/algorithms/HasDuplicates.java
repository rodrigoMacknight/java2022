package com.mk.leetcode75.algorithms;


/*Given an integer array nums, return true if any
value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false */


import java.util.HashMap;
import java.util.Map;

public class HasDuplicates {

    public boolean containsDuplicates(int[] nuns) {
        Map<Integer, Integer> occ = new HashMap<>();
        for (int n: nuns) {
            if (occ.containsKey(n)) {
                occ.put(n, occ.get(n) + 1);
                return true;
            } else {
                occ.put(n, 1);
            }
        }
        return false;
    }
}
