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
    static int minm;
    
    public void dfs(TreeNode node) {
        if(node.left!=null) {
            TreeNode small = node.left;
            while(small.right!=null) {
                small = small.right;
            }
            if(minm > (node.val - small.val)) {
                minm = node.val - small.val;
            }
            dfs(node.left);
        }
        if(node.right!=null) {
            TreeNode big = node.right;
            while(big.left!=null) {
                big = big.left;
            }
            if(minm > (big.val - node.val)) {
                minm = big.val - node.val;
            }
            dfs(node.right);
        } 
    }
    
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        minm = Integer.MAX_VALUE;
        dfs(root);
        return minm;
    }
}