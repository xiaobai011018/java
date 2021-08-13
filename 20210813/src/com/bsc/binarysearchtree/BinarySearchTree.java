package com.bsc.binarysearchtree;

public class BinarySearchTree {
    private class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
        }
    }
    Node root;
    public void insert(int key){
        if (root==null){
            root =  new Node(key);
        }else {
            Node cur = root;
            Node parent;
            while (true){
                parent = cur;
                if (cur.val>key){
                    cur = cur.left;
                    if (cur == null){
                        parent.left = new Node(key);
                        return;
                    }
                }else {
                    cur = cur.right;
                    if (cur == null){
                        parent.right = new Node(key);
                        return;
                    }
                }
            }
        }
    }
    public void preOrder(){
        inPreOrder(root);
    }
    private void inPreOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.val+" ");
        inPreOrder(node.left);
        inPreOrder(node.right);
    }
    public void inOrder(){
        inInOrder(root);
    }
    private void inInOrder(Node node){
        if (node==null){
            return;
        }
        inInOrder(node.left);
        System.out.println(node.val+" ");
        inInOrder(node.right);
    }
    public void postOrder(){
        inPostOrder(root);
    }
    private void inPostOrder(Node node){
        if (node==null){
            return;
        }
        inPostOrder(node.left);
        inPostOrder(node.right);
        System.out.println(node.val+" ");
    }
    public Node search(int key){
        Node cur = root;
        while (true){
            if (cur ==null){
                return null;
            }
            if (cur.val>key){
                cur = cur.left;
            }else if (cur.val<key){
                cur = cur.right;
            }else {
                return cur;
            }
        }
    }
    private void inDelete(Node cur,Node parent){
        Node preNode = cur;
        Node curNode = cur;
        while (cur!=null){
            preNode = curNode;
            curNode = curNode.left;
        }
        cur.val = preNode.val;

    }
    public void delete(int key){
        if (root==null){
            return;
        }
        Node cur = root;
        Node parent;
        while (cur!=null){
            parent = cur;
            if (cur.val<key){
                cur = cur.right;
                if (cur.val==key){
                    if (cur.left==null&&cur.right==null){
                        parent.right=null;
                        return;
                    }
                }
            }else if (cur.val>key){
                cur = cur.left;
                if (cur.val==key){
                    if (cur.left==null&&cur.right==null){
                        parent.left=null;
                        return;
                    }else if (cur.left!=null&&cur.right==null){
                        parent.left = cur.left;
                        return;
                    }else if (cur.right!=null&&cur.left==null){
                        parent.left = cur.right;
                        return;
                    }else if (cur.left!=null&&cur.right!=null){
                        inDelete(cur,parent);
                        return;
                    }
                }
            }
        }
    }

}
