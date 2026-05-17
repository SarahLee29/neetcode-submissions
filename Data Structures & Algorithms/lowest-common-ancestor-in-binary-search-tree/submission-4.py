# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        return self.traverseTree(root, p, q)

    def traverseTree(self, node, p, q):
   
        if node.val == p.val or node.val == q.val:
            return node
        if q.val < node.val < p.val or p.val < node.val < q.val:
            return node
        if q.val < node.val and p.val < node.val:
            return self.traverseTree(node.left, p, q)
        if q.val > node.val and q.val > node.val:
            return self.traverseTree(node.right, p, q)
        