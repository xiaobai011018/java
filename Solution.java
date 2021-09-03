package com.bsc.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        Solution solution = new Solution();
        solution.smallestK(arr,4);
//        solution.shellSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k,(o1, o2) -> o2-o1);
        for (int i = 0; i < arr.length; i++) {
            if (priorityQueue.size()<k){
                priorityQueue.offer(arr[i]);
            }else {
                if (priorityQueue.peek()>arr[i]){
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }
    public void shellSort(int[] arr){
        int gap = arr.length;
        while (gap>1){
            gap /= 2;
            shell(arr,gap);
        }
        shell(arr,1);
    }
    public void shell(int[] arr,int gap){
        for (int i = gap; i < arr.length; i++) {
            int j = i-gap;
            int tmp = arr[i];
            for ( ; j >= 0 ; j -= gap) {
                if (arr[j+gap]<arr[j]){
                    arr[j+gap] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }
    }
    public void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
               if (arr[i]<arr[j]){
                   int tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
                   i = j;
               }else {
                   break;
               }
            }
        }
    }
}
