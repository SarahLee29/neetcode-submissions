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
    public int diameterOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        calMax(res,root);
        return Collections.max(res);     
    }
    private int calMax (List<Integer> res, TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = calMax(res,node.left);
        int right = calMax(res,node.right);
        res.add (left+right);
        return 1+Math.max(left,right);
    }
   
}
