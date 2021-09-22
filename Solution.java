package com.bsc.leetcode;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode cur = head;
        while(cur!=null){
            n++;
            cur = cur.next;
        }
        ListNode[] parts = new ListNode[k];
        cur = head;
        int quo = n/k;
        int red = n%k;
        for(int i = 0;i<k&&cur!=null;i++){
            parts[i] = cur;
            int foot = quo + (i<red?1:0);
            for(int j = 1;i<foot;j++){
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return parts;
    }
}
