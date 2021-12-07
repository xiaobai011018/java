package 数据结构实验2;



import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private BinaryTree left;
    private BinaryTree right;
    public BinaryTree root;
    private int data;
    private List<BinaryTree> datas;
    public BinaryTree(int data){
        this.data = data;
    }
    public BinaryTree(){}
    public void create(int[] nums){
        datas = new ArrayList<>();
        for (int num:nums){
            datas.add(new BinaryTree(num));
        }
        root = datas.get(0);
        for (int i = 0;i<nums.length/2;i++){
            datas.get(i).left = datas.get(i*2+1);
            if (i*2+2<datas.size()){
                datas.get(i).right = datas.get(i*2+2);
            }
        }
    }
    public void preorder(BinaryTree root){
        if (root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

    }
    public void inorder(BinaryTree root){
        if (root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

    }
    public void afterOrder(BinaryTree root){
        if (root!=null){
            afterOrder(root.left);
            afterOrder(root.right);
            System.out.print(root.data+" ");
        }

    }



}
