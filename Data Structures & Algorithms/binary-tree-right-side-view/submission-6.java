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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> que = new ArrayDeque<TreeNode>();
        List<Integer> res = new ArrayList<>();

        if(root != null){
            que.add(root);
        }
        
        while(!que.isEmpty()){
            int levelLen = que.size();
            for(int i=0; i<levelLen; i++){
                TreeNode curr = que.removeFirst();
                if(i == levelLen-1) res.add(curr.val);

                if(curr.left != null){
                    que.add(curr.left);
                }
                if(curr.right != null){
                    que.add(curr.right);
                }
                
            }
        }

        return res;
    }
}
