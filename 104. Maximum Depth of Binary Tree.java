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
    int maxm = 0;
    public void dfs(TreeNode node, int depth) {
        if(depth > maxm) {
            maxm = depth;
        }
        if(node.left!=null) {
            dfs(node.left,depth+1);
        }
        if(node.right!=null) {
            dfs(node.right,depth+1);
        }
        return;
    }
    
    public int maxDepth(TreeNode root) {
        if(root!=null) {
            dfs(root,1);
        }
        return maxm;
    }
}