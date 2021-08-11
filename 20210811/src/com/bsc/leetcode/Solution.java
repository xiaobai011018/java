package com.bsc.leetcode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s1 = new String("a")+new String("b");
        s1.intern();
        String s2 = "ab";
        System.out.println(s1==s2);
//        int[] nums = new int[]{9,1,2,5,7,4,8,6,3,5};
////        Solution.insertSort(nums);
//        shellSort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
    }
    public static void shellSort(int[] nums){
            int gap = nums.length;
            while (gap>1){
                shellSortGap(nums,gap);
                gap /= 2;
            }
            shellSortGap(nums,1);
    }
    private static void shellSortGap(int[] nums,int gap){
        for (int i = gap; i < nums.length; i++) {
            int ret = nums[i];
            int j = i-gap;
            for (; j >=0 ; j-=gap) {
                if (ret<nums[j]){
                     nums[j+gap] = nums[j];
                }else {
                    break;
                }
            }
            nums[j+gap] = ret;
        }
    }
    public static void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j >=1 ; j--) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums.toString());
    }
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        Car[] cars = new Car[position.length];
        for (int i = 0; i < N; i++) {
            double time = (target-position[i])*1.0/speed[i];
            cars[i] = new Car(position[i],time);
        }
        Arrays.sort(cars,(a,b)->a.position-b.position);
        int ans = 0;
        while (--N>0){
            if (cars[N].time>cars[N-1].time){
               ans++;
            }else {
                cars[N] = cars[N-1];
            }
        }
        return ans+(N==0?1:0);
    }
}
class Car{
    public int position;
    public double time;
    public Car(int position,double time){
        this.position = position;
        this.time = time;
    }
}