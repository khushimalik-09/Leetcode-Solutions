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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> st = new Stack<>();
        int diameter =0;
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode node = st.peek();
            if(node.left!=null && !map.containsKey(node.left)){
                st.push(node.left);
            }
            else if(node.right!=null && !map.containsKey(node.right)){
                st.push(node.right);
            }
            else{
                st.pop();
                int leftDepth = map.getOrDefault(node.left,0);
                int rightDepth = map.getOrDefault(node.right,0);
                
                map.put(node,1+Math.max(leftDepth,rightDepth));
                diameter = Math.max(diameter, leftDepth+rightDepth);
            }
        }
        return diameter;
    }
}