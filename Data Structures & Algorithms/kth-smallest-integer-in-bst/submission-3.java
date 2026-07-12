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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        find(root, ans);
        int res = ans.get(k-1);
        return res;
    }

    public void find(TreeNode root, List<Integer> l){
        if(root != null){
            find(root.left, l);
            l.add(root.val);
            find(root.right, l);
        }

    }

    
}
