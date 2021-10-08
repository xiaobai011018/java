package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static final int l = 10;
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        Map<String,Integer> cnt = new HashMap<>();
        int n = s.length();
        for(int i = 0;i<=n-l;i++){
            String sub = s.substring(i,i+l);
            cnt.put(sub,cnt.getOrDefault(sub,0)+1);
            if (cnt.get(sub)==2){
                ans.add(sub);
            }
        }
        return ans;
    }
}
