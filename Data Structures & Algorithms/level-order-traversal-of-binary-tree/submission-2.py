# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        ans = []


        q = deque()
        # For every node at the front, append their children (if present) to the queue
        # Then pop
        q.append(root)

        while q:
            le = len(q)
            level = []
            for i in range(0,le):
                node = q.popleft()
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
                level.append(node.val)
            ans.append(level)

        return ans
            
