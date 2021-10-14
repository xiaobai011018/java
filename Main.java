package com.bsc.test;

import java.util.Scanner;



/**
 * 5
 * 1 -2 3 1 5
 * 10
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arr1 = str.split(" ");
        int length = arr1.length;
        int[] arr2 = new int[n];
        for(int i = 0;i<length;i++){
            arr2[i] = Integer.valueOf(arr1[i]);
        }
        int ans = -100000;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr2[i]<=0){
                ans = Math.max(ans,count);
                count = 0;
                continue;
            }
            count += arr2[i];
        }
        ans = Math.max(ans,count);
        System.out.println(ans);
    }
    public static void main2(String[] args) {
        String str = "aba";
        System.out.println(str.substring(0,0));

    }
    public static void main1(String[] args){
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int length = str1.length();
        String ant = "";
        for(int i = 0;i<length;i++){
            ant = str1.substring(0,i)+str2+str1.substring(i,length);
            if(check(ant)){
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
