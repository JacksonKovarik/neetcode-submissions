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
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode result = this.inorder(root, k);
        return result != null ? result.val : 0;
    }

    public TreeNode inorder(TreeNode root, int k){
        if(root == null){
            return null;
        }

        TreeNode left = this.inorder(root.left, k);
        if(left != null){
            return left;
        }
        this.count++;
        if(this.count == k) return root;

        return this.inorder(root.right, k);

    }
}
