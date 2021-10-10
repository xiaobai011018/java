package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int i = 0;
        while (n>=0){
            i++;
            n -= i;
        }
        if (n<0){
            return i--;
        }
        return i;
    }
}
