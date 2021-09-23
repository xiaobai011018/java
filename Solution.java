package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(2147483647));
    }
    public boolean isPowerOfThree(int n) {
        long num = 1;
        while(num<=n){
            if(n==num){
                return true;
            }
            num *= 3;

        }
        return false;
    }
}
