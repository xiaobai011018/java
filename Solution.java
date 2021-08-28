package com.bsc.leetcode;

import java.util.HashMap;

public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map_s = new HashMap<>();
        HashMap<Character,Integer> map_t = new HashMap<>();
        for(char ch : s.toCharArray()){
            map_s.put(ch,map_s.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            map_t.put(ch,map_t.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<s.length();i++){
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);
            if(map_s.get(ch_s)!=map_t.get(ch_t)){
                return ch_t;
            }
        }
        return t.charAt(t.length()-1);
    }
}
