package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
    public int firstUniqChar(String s) {
        for(int i = 0;i < s.length();i++){
            int right = s.length()-1;
            while(i<right){
                if(s.charAt(i)==s.charAt(right)){
                    break;
                }
                right--;
            }
            if(i==right){
                return i;
            }
        }
        return -1;
    }
}
