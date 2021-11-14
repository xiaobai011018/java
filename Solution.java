package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        new Solution().detectCapitalUse("Leetcode");
    }
    public boolean detectCapitalUse(String word) {
        int minCount = 0;
        int maxCount = 0;
        char[] chars = word.toCharArray();
        for (char ch:chars){
            if (ch-97>=0){
                minCount++;
            }else {
                maxCount++;
            }
        }
        if (maxCount==word.length()){
            return true;
        }
        if (minCount==word.length()){
            return true;
        }
        if (minCount==word.length()-1&&word.charAt(0)-97<0){
            return true;
        }
        return false;
    }
}
