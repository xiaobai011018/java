package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}
