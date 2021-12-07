package 数据结构实验1;

public class LinkedList {
    private Node head;
    private int size;
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public void addHead(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }
    public void addTail(int data){
        Node node = new Node(data);
        if (head==null){
            head = node;
            size++;
            return;
        }
        Node cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next  = node;
        size++;
    }
    public boolean deleteNode(int data){
        if (head==null){
            return false;
        }
        if (head.data==data){
            head = head.next;
            return true;
        }
        Node cur = head;
        while (cur.next!=null&&cur.next.data!=data){
            cur = cur.next;
        }
        if (cur.next==null){
            return false;
        }
        cur.next = cur.next.next;
        size--;
        return true;
    }
    public boolean updateNode(int data){
        if (head==null){
            return false;
        }
        Node cur = head;
        while (cur!=null||cur.data!=data){
            cur = cur.next;
        }
        if (cur==null){
            return false;
        }
        cur.data = data;
        return true;
    }
    public boolean searchNode(int data){
        Node cur = head;
        if (cur!=null&&cur.data!=data){
            cur = cur.next;
        }
        if (cur==null){
            return false;
        }
        if (cur.data==data){
            return true;
        }
        return false;
    }
    public void display(){
        Node cur = head;
        while (cur!=null){
            if (cur.next!=null){
                System.out.print(cur.data+"->");
            }else {
                System.out.print(cur.data);
            }
            cur = cur.next;
        }
        System.out.println();
    }
}
