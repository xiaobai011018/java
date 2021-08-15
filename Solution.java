package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        isIsomorphic("badc","baba");
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
         for (int num : nums2) {
            set2.add(num);
        }
         HashSet<Integer> result = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)){
                result.add(num);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            res[index++]  = num;
        }
        return res;

    }
    public  static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> hashMap1 = new HashMap<>();
        HashMap<Character,Character> hashMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if ((hashMap1.containsKey(a)&&b!=hashMap1.get(a))||(hashMap2.containsKey(b)&&a!=hashMap2.get(b))){
                return false;
            }
            hashMap1.put(a,b);
            hashMap2.put(b,a);
        }
        return true;

    }
}
