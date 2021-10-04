package com.bsc.leetcode;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int cnt = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!='-'){
                cnt++;
                sb.append(Character.toUpperCase(s.charAt(i)));
                if(cnt%k==0){
                    sb.append("-");
                }
            }
        }
        if(sb.length()>0&&sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.reverse().toString();
    }
}
