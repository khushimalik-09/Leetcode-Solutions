/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        computediameter(root);
        return max;
    }
    private int computediameter(TreeNode node){
        if(node==null)return 0;
        
        int left = computediameter(node.left);
        int right = computediameter(node.right);
        max = Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
}