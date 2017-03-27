/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution implements Comparator<Integer>{
    public ArrayList<Integer> list = new ArrayList<>();
    
    public int compare(Integer i, Integer j) {
        return i.compareTo(j);
    }  
    
    public void dfs(TreeNode node) {
        if(node==null) return;
        list.add(node.val);
        if(node.left!=null) dfs(node.left);
        if(node.right!=null) dfs(node.right);
    }
    
    public void dfs2(TreeNode node, int []arr) {
        if(node==null) return;
        node.val=arr[list.indexOf(node.val)];
        if(node.left!=null) dfs2(node.left,arr);
        if(node.right!=null) dfs2(node.right,arr);
    }
    
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        dfs(root);
        int []arr = new int[list.size()];
        Collections.sort(list,new Solution());
        arr[list.size()-1] = list.get(list.size()-1);
        for(int i=list.size()-2;i>-1;i--) {
            arr[i] = arr[i+1] + list.get(i);
        }
        dfs2(root,arr);
        return root;
    }
}
