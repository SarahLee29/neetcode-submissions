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
        recursionTraversal(root, res);
        return res;  
    }

    private List<Integer> recursionTraversal (TreeNode root, List<Integer> res) {
        if (root == null){     
            return res;    
        } 
       
        recursionTraversal(root.left,res);
        res.add(root.val);
        recursionTraversal(root.right,res);
        return res;
        
    }
}