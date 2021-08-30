package com.bsc.leetcode;

import java.util.Arrays;

public class Solution {
    int[] pre;
    public Solution(int[] w) {
        pre = new int[w.length];
        pre[0] = w[0];
        for(int i = 1;i<w.length;i++){
            pre[i] = pre[i-1] + w[i];
        }
        pickIndex();
    }
    public int pickIndex() {
        int x = (int)(Math.random()*pre[pre.length-1] + 1);
        return binarySearch(x);
    }
    public int binarySearch(int x){
        int low = 0;
        int higth = pre.length-1;
        while(low<higth){
            int mid = (low+higth)/2;
            if(pre[mid]<x){
                low = mid+1;
            }else{
                higth = mid-1;
            }
        }
        return low;
    }
}
