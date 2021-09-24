package com.bsc.leetcode;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node(Integer val){
        this.val = val;
    }
};
public class Solution {
    public Node flatten(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        while(head!=null){
            if(head.child==null){
                head = head.next;
            }else{
                Node tmp = head.next;
                Node chead = flatten(head.child);
                head.next = chead;
                chead.prev = head;
                head.child = null;
                while(head.next!=null) head = head.next;
                head.next = tmp;
                if(tmp != null) tmp.prev = head;
                head = tmp;
            }
        }
        return dummy.next;
    }
    public Node flatten1(Node head) {
        Node newHead = head;
        Node newCur = newHead;
        Node cur = head;
        if(cur.child!=null){
            newCur.next = cur;
            newCur.prev = cur.prev;
            flatten(cur.child);
        }
        if(cur.next!=null){
            newCur.next = cur;
            newCur.prev = cur.prev;
            flatten(cur.next);
        }
        return newHead;
    }
}
