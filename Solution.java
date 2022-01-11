package leetcode;

public class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            next = Math.max(i+nums[i],next);
            if (i==cur){
                if (cur<nums.length-1){
                    ans++;
                    cur = next;
                }else break;
            }
        }
        return ans;
    }
    public boolean canJump(int[] nums) {
        if (nums.length==1) return true;
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i+nums[i],cover);
            if (cover>=nums.length-1) return true;
        }
        return false;
    }
}
