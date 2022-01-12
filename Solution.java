package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum<0){
                start = i+1;
                curSum = 0;
            }
        }
        if (totalSum<0) return -1;
        return start;
    }
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int ret = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < gas.length; i++) {
            if (gas[i]>cost[i]){
                map.put(i,gas[i]);
            }
        }
        if (map.size()==0) return -1;
        int ans = 0;
        int k = gas.length;
        for (Integer index : map.keySet()) {
            while (k!=0){
                ans += gas[index]-cost[index]+gas[index+1];
                index++;
                index %= gas.length;
                k--;
            }
            if (ans>=0){
                ret = index;
            }
        }
        return ret;
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k!=0&&nums[i]<0){
                nums[i] = -nums[i];
                k--;

            }
        }
        Arrays.sort(nums);
        if (k%2==1){
            nums[0] = -nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }
        return ans;
    }
}
