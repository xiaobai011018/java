package com.bsc.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] banned = {"hit"};
        solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",banned);
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (String str : banned){
            bannedSet.add(str);
        }
        String ans = "";
        int maxLength = 0;
        StringBuilder sb  = new StringBuilder();
        for (char c:paragraph.toCharArray()){
            if (Character.isLetter(c)){
                sb.append(Character.toLowerCase(c));
            }else if (sb.length()>0){
                String finalWord = sb.toString();
                if (!bannedSet.contains(finalWord)){
                    map.put(finalWord,map.getOrDefault(finalWord,0)+1);
                    if (map.get(finalWord)>maxLength){
                        ans = finalWord;
                        maxLength = map.get(finalWord);
                    }
                }
                sb = new StringBuilder();
            }
        }
        return ans;
    }
}
