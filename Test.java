package 数据结构实验1;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addTail(3);
        linkedList.addTail(4);
        linkedList.addTail(5);
        linkedList.addTail(6);
        linkedList.addTail(7);
//        linkedList.addHead(3);
//        linkedList.addTail(4);
//        linkedList.addHead(1);
//        linkedList.addTail(6);
        linkedList.display();
//        System.out.println(linkedList.deleteNode(2));
//        System.out.println(linkedList.deleteNode(6));
//        linkedList.display();
        System.out.println(linkedList.searchNode(7));
//        System.out.println(linkedList.searchNode());
    }
}
