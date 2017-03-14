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
    ArrayList<Integer> res = new ArrayList<Integer>();
    
    public void bfs(Queue<TreeNode> queue) {
        int maxm = Integer.MIN_VALUE;
        TreeNode node;
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        if(queue.isEmpty()) {
            return;
        }
        while(!queue.isEmpty()) {
            node = queue.poll();
            if(node.val > maxm) {
                maxm = node.val;
            }
            if(node.left != null) {
                queue2.offer(node.left);
            }
            if(node.right != null) {
                queue2.offer(node.right);
            }
        }
        res.add(maxm);
        bfs(queue2);
    }
    
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null) {
            queue.offer(root);
            bfs(queue);
        }
        return res;
    }
}