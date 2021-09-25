package com.bsc.leetcode;

public class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1;i<=n;i++){
            char c1 = word1.charAt(i-1);
            for(int j = 0;j<=m;j++){
                char c2 = word2.charAt(j-1);
                if(c1==c2){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int maxLength = dp[n][m];
        return n-maxLength+m-maxLength;
    }
}
