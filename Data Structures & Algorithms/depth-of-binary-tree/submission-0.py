# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        return self.mxDepth(root, 0)
        
    def mxDepth(self, root, currDepth):
        maxDepth = 0
        if not root:
            return currDepth
        maxDepth = max(maxDepth, self.mxDepth(root.left, currDepth+1))
        maxDepth = max(maxDepth, self.mxDepth(root.right, currDepth+1))

        return maxDepth


        

