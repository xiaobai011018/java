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
    int ans = 0;
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        slop(root);
        return ans;
    }
    int slop(TreeNode node){
        if(node==null) return 0;
        int left = slop(node.left);
        int right = slop(node.right);
        ans += Math.abs(left-right);
        return node.val+right+left;
    }
}
