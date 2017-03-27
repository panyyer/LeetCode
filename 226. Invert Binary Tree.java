/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void covert(TreeNode node) {
        if(node==null) return;
        TreeNode t;
        t = node.left;
        node.left = node.right;
        node.right = t;
        if(node.left != null) covert(node.left);
        if(node.right != null) covert(node.right);
    } 
    public TreeNode invertTree(TreeNode root) {
        covert(root);
        return root;
    }
}