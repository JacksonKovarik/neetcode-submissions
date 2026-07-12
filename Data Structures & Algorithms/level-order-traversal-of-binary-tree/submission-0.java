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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> que = new ArrayDeque<TreeNode>();
        List<List<Integer>> res = new ArrayList<>();

        if(root != null){
            que.add(root);
        }

        while(!que.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int levelLen = que.size();
            for(int i=0; i<levelLen; i++){
                TreeNode curr = que.removeFirst();
                level.add(curr.val);

                // If a left tree and/or right tree exists, add them to the que for the next level
                if(curr.left != null){
                    que.add(curr.left);
                }
                if(curr.right != null){
                    que.add(curr.right);
                }
            }
            res.add(level);
        }
        
        
        return res;
    }
}
