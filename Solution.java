package com.bsc.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}
