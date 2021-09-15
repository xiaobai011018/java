package com.bsc.leetcode;

public class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left+right)>>1;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }
    // public int findPeakElement(int[] nums) {
    //     int index = 0;
    //     for(int i = 1;i<nums.length;i++){
    //         if(nums[i]>nums[index]){
    //             index = i;
    //         }
    //     }
    //     return index;
    // }
}
