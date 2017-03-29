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
    public HashMap<Integer,Integer> hash = new HashMap<>();
    public int maxm = 1;
    public ArrayList<Integer> list = new ArrayList<>(); 
    public void dfs(TreeNode node) {
        if(node==null) return;
        if(node.left!=null) {
            dfs(node.left);
            node.val+=node.left.val;
        }
        if(node.right!=null) {
            dfs(node.right);
            node.val+=node.right.val;
        }
        if(hash.containsKey(node.val)) {
            int val = hash.get(node.val)+1;
            hash.put(node.val,val);
            if(val > maxm) {
                maxm = val;
            }
        } else {
            hash.put(node.val,1);
        }
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        int num=0;
        for(Map.Entry<Integer,Integer> e : hash.entrySet()) {
            if(e.getValue()==maxm) {
                list.add(e.getKey());
            }
        }
        int []res = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}