package 数据结构实验2;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int[] nums = {2,4,5,7,1,6,12,32,51,22};
        binaryTree.create(nums);
//        binaryTree.preorder(binaryTree.root);
//        binaryTree.inorder(binaryTree.root);
        binaryTree.afterOrder(binaryTree.root);
    }
}
