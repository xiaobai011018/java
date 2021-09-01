package com.bsc.leetcode;

public class Solution {

    public static int compareVersion(String version1, String version2) {
        String[] vs1 = version1.split("\\.");
        String[] vs2 = version2.split("\\.");
        int length1 = vs1.length;
        int length2 = vs2.length;
        if(length1!=length2){
            if(length1<length2){
                for(int i = 0;i<length1;i++){
                    if(comPare(vs1[i],vs2[i])!=0){
                        return comPare(vs1[i],vs2[i]);
                    }
                }
                for(int i = length1;i<length2;i++){
                    if(Integer.parseInt(vs2[i])!=0){
                        return -Integer.parseInt(vs2[i]);
                    }
                }
                return 0;
            }
            if(length1>length2){
                for(int i = 0;i<length2;i++){
                    if(comPare(vs1[i],vs2[i])!=0){
                        return comPare(vs1[i],vs2[i]);
                    }
                }
                for(int i = length2;i<length1;i++){
                    if(Integer.parseInt(vs1[i])!=0){
                        return Integer.parseInt(vs1[i]);
                    }
                }
                return 0;
            }
        }
        for(int i = 0;i<length1;i++){
            if(comPare(vs1[i],vs2[i])!=0){
                return comPare(vs1[i],vs2[i]);
            }
        }
        return 0;
    }
    public static int comPare(String s1,String s2){
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        return num1-num2;
    }
}
