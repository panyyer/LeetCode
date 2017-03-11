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
    public int res = -1, maxDept = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 1);
        return res;
    }
    
    public void dfs(TreeNode root, int dept) {
        if(root.left != null) {
            dfs(root.left,dept+1);
        } 
        if(root.right != null) {
            dfs(root.right,dept+1);
        }
        if(dept > maxDept) {
            maxDept = dept;
            res = root.val;
        }
    }
}
