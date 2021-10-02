package com.bsc.leetcode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        Queue queue = new PriorityQueue();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num!=0){
            System.out.print(num%2);
            num /= 2;
        }
    }
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> s:paths){
            map.put(s.get(0),s.get(1));
        }
        String ans = paths.get(0).get(0);
        while(map.containsKey(ans)){
            ans = map.get(ans);
        }
        return ans;
    }
    public String toHex(int _num) {
        long v = 0;
        StringBuffer sb = new StringBuffer();
        long num = (long)_num;
        if(num==0) return "0";
        if(num<0) {
            num = (long)(Math.pow(2,32)+num);
        }
        while(num!=0){
            v = num%16;
            char c = (char)(v+'0');
            if(v>=10){
                c = (char)(v-10+'a');
            }
            sb.append(c);
            num /= 16;
        }
        return sb.reverse().toString();
    }
//    public String toHex(int num) {
//        while (num!=0){
//            System.out.print(num%2);
//            num /= 2;
//        }
//    }
}
