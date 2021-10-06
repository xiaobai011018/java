package com.bsc.leetcode;

import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) set.add(num);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size()>=3?list.get(list.size()-3):list.get(list.size()-1);
    }
}
