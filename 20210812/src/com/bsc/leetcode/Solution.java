package com.bsc.leetcode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println("bbc".compareTo("acd"));
//        System.out.println("abcd2".compareTo("abc"));
//        int[] arr = {0,0,1,2,3,3,4,7,7,8};
//        System.out.println(Arrays.binarySearch(arr, 3));
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        System.out.println(Collections.binarySearch(list, 5));
//        findClosestElements(arr,3,5);
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<words.length;i++){
            if(!map.containsKey(words[i])){
                map.put(words[i],1);
            }else{
                int count = map.get(words[i]);
                map.put(words[i],count+1);
            }
        }
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((s1,s2)->{
            if (map.get(s1).equals(map.get(s2))){
                return s2.compareTo(s1);
            }else {
                return map.get(s1)-map.get(s2);
            }
        });
        for (String s : map.keySet()) {
            priorityQueue.offer(s);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < priorityQueue.size(); i++) {
            list.add(priorityQueue.poll());
        }
        Collections.reverse(list);
        return list;
    }
//    public static List<Integer> findClosestElements2(int[] arr, int k, int x) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        System.out.println(Collections.binarySearch(list, x));
//    }
    public static List<Integer> findClosestElements1(int[] arr, int k, int x) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k,(a,b)->b-a);
        for (int i = 0; i < arr.length; i++) {
            if (i<k){
                priorityQueue.offer(arr[i]);
            }else {
                Integer peek = priorityQueue.peek();
                int a = Math.abs(arr[i]-x);
                int b = Math.abs(peek-x);
                if (a<b){
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        int size = priorityQueue.size();
        for (int i = 0; i < size; i++) {
            list.addFirst(priorityQueue.poll());
        }
        return list;
    }
}
