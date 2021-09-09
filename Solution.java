package com.bsc.leetcode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {3};
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g, s));
    }
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int g_length = g.length;
        int index =  s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = g_length-1;i>=0;i--){
            if(index>=0&&s[index]>=g[i]){
                count++;
                index--;
            }
        }
        return count;
    }
}
