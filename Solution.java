package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        def(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
    void def(TreeNode node,ArrayList list){
        if(node==null){
            return;
        }
        list.add(node.val);
        def(node.left,list);
        def(node.right,list);
    }
    public int findComplement(int num) {
        int s = -1;
        for (int i = 31; i >= 0; i--) {
            if (((num >> i) & 1) != 0) {
                s = i;
                break;
            }
        }
        int ans = 0;
        for (int i = 0; i < s; i++) {
            if (((num >> i) & 1) == 0) ans |= (1 << i);
        }
        return ans;
    }
}
