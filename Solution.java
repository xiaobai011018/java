package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        Solution solution = new Solution();
        solution.binaryToDecimal(3);
        String s = "123";
//        solution.maxProfit(prices);
    }
    public int findIntegers(int n) {
        int result = 0;
        for(int i = 0;i<=n;i++){
            char[] ch = Integer.toBinaryString(i).toCharArray();
            int j = 0;
            for(;j<ch.length-1;j++){
                if(ch[j]=='1'&&ch[j+1]=='1'){
                    break;
                }
            }
            if(j==ch.length-1){
                result++;
            }
        }
        return result;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int count = 0;
        int buy = 0;
        int sell = 0;
        boolean buy_flg = false;
        boolean sell_flg = false;
        for(int i = 0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                if(buy==0){
                    buy = prices[i];
                    buy_flg = true;
                }
            }else{
                if(buy!=0){
                    sell = prices[i];
                    count += sell-buy;
                    buy = 0;
                    sell_flg = true;
                }
            }
        }
        if(buy_flg&&!sell_flg){
            count = prices[n-1] - prices[0];
        }
        return count;
    }
    public void binaryToDecimal(int n){
        for(int i = 31;i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }
}
