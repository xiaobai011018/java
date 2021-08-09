package com.bsc.leetcode;

import java.util.*;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2)->o2-o1);
        for (int stone:stones){
            priorityQueue.offer(stone);
        }
        while (priorityQueue.size()>1){
            Integer a = priorityQueue.poll();
            Integer b = priorityQueue.poll();
            priorityQueue.offer(a-b);
        }
        return priorityQueue.isEmpty()?0:priorityQueue.poll();
    }
    class Node {
        public int i;
        public int j;

        public Node(int a, int b) {
            i = a;
            j = b;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] A, int[] B, int k) {
        if (A == null || B == null || A.length == 0 || B.length == 0 || k <= 0) {
            return new ArrayList<>();
        }
        final int N = A.length;
        final int M = B.length;

        // 小根堆
        Queue<Node> Q = new PriorityQueue<>((v1, v2) -> A[v1.i] + B[v1.j] - A[v2.i] - B[v2.j]);

        for (int i = 0; i < N; i++) {
            Q.add(new Node(i, 0));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < k && !Q.isEmpty(); i++) {
            Node p = Q.poll();
            ans.add(Arrays.asList(A[p.i], B[p.j]));
            if (p.j + 1 < M) {
                Q.add(new Node(p.i, p.j + 1));
            }
        }

        return ans;
    }


    public List<List<Integer>> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(k,new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0)+o2.get(1))-(o1.get(0)+o1.get(1));
            }
        });
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> list = new ArrayList<>();
                if (priorityQueue.size()<k){
                    list.add(nums1[i]);
                    list.add(nums2[j]);
                    priorityQueue.offer(list);
                }else {
                    List<Integer> peek = priorityQueue.peek();
                    if ((nums1[i]+nums2[j])<(peek.get(0)+peek.get(1))){
                        priorityQueue.poll();
                        list.add(nums1[i]);
                        list.add(nums2[j]);
                        priorityQueue.offer(list);
                    }
                }
            }
        }
        List<List<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < k&&!priorityQueue.isEmpty(); i++) {
            arrayList.add(priorityQueue.poll());
        }
        return arrayList;
    }
//    public TreeNode recoverFromPreorder(String traversal) {
//        Stack<TreeNode> stack = new Stack<>();
//        int i = 0;
//        while(i<traversal.length()){
//            int level = 0;
//            while(traversal.charAt(i)=='-'){
//                level++;
//                i++;
//            }
//            int val = 0;
//            while(traversal.charAt(i)!='-'){
//                val = val*10+(traversal.charAt(i)-'0');
//                i++;
//            }
//            while(stack.size()>level){
//                stack.pop();
//            }
//            TreeNode node = new TreeNode();
//            if(!stack.isEmpty()){
//                if(stack.peek().left==null){
//                    stack.peek().left = node;
//                }else{
//                    stack.peek().right = node;
//                }
//            }
//            stack.push(node);
//        }
//        while(stack.size()!=1){
//            stack.pop();
//        }
//        return stack.pop();
//    }
}
