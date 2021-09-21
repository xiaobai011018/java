package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLastWord("   fly me   to   the moon  ");
    }
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int i = s.length()-1;
        while(i>=0&&s.charAt(i)==' ') {
            i--;
        }
        int j = i;
        while(j>=0&&s.charAt(j)!=' ') {
            j--;
            ans++;
        }
        return ans;
    }
}
