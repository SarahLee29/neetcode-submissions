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
    private List<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        preorderRecursion(root);
        return res;        
    }
    private void preorderRecursion (TreeNode root){
        if(root == null) {
            return;
        }
        res.add(root.val);
        preorderRecursion(root.left);
        preorderRecursion(root.right);
    }
}