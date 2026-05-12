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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        bstHelper(res,root);
        return res;        
    }
    private void bstHelper(List<Integer> res, TreeNode node) {
        if (node == null) {
            return;
        } 
        bstHelper(res,node.left);
        res.add(node.val);
        bstHelper(res,node.right);      
        
    }
}