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
        List<Integer> tree = new ArrayList<>();
        tree = inorder(root, tree);
        return tree.get(k-1);
    }

    public List<Integer> inorder(TreeNode root, List<Integer> tree){
        if(root != null){
            inorder(root.left, tree);
            tree.add(root.val);
            inorder(root.right, tree);
        }
        return tree;
    }
}
