package com.bsc.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int[][] arr = new int[m][n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] num:ops){
            for(int i = 0;i<num[0];i++){
                for(int j = 0;j<num[1];j++){
                    arr[i][j] = arr[i][j]+1;
                }
            }
        }
        int ans = -99999;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
                ans = Math.max(arr[i][j],ans);
            }
        }
        return map.get(ans);
    }
}
