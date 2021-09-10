package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        Solution solution = new Solution();
        System.out.println(solution.chalkReplacer(chalk, 22));
    }
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while(k>chalk[0]){
            for(i=0;i<chalk.length;i++){
                if(k<chalk[i]){
                    return i;
                }
                k -= chalk[i];
            }
        }
        return 0;
    }
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count += nums[i];
            if (count>result){
                result = count;
            }
            if (result<0){
                count = 0;
            }
        }
        return result;
    }
}
