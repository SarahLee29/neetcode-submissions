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
    public int res;
    public HashSet<Integer> s;
    public int maxDepth(TreeNode root) {
        s = new HashSet<>();
        res = 0;
        bstHelper(res,root);
        try{
            return Collections.max(s);
        } catch (NoSuchElementException e){
            return 0;
        }   
    }
    private void bstHelper(int res, TreeNode node){
        res++;
        if (node == null){
            res--;
            return;
        }
        bstHelper(res,node.left);

        bstHelper(res,node.right);

        s.add(res);
    }
}
