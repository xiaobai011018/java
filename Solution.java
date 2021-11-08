package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String getHint(String secret, String guess) {
        int bullNum = 0;
        int cowNum = 0;
        ArrayList<Character> list = new ArrayList<>();
        String str1 = "";
        String str2 = "";
        for(int i = 0;i<secret.length();i++){
            if (secret.charAt(i)==guess.charAt(i)){
                bullNum++;
            }else {
                str1 += secret.charAt(i);
                str2 += guess.charAt(i);
            }
        }
        for (char ch:str1.toCharArray()){
            list.add(ch);
        }
        for(char ch : str2.toCharArray()){
            if (list.contains(ch)){
                cowNum++;
                list.remove((Character) ch);
            }
        }
        String ans = bullNum+"A"+cowNum+"B";
        return ans;
    }
}
