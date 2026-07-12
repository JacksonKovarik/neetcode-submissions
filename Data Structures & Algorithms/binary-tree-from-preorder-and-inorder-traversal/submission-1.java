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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        
        TreeNode root = new TreeNode(preorder[0]);

        int partitionPoint = 0;
        for (int i=0; i<inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                partitionPoint = i;
            }
        }

        int[] preLeft = new int[partitionPoint+1];
        for (int i=1; i<partitionPoint+1; i++) {
            preLeft[i-1] = preorder[i];
        }

        int[] preRight = new int[preorder.length-(partitionPoint+1)];
        for (int i=partitionPoint+1; i<preorder.length; i++) {
            preRight[i-(partitionPoint+1)] = preorder[i];
        }

        int[] inLeft = new int[partitionPoint];
        for (int i=0; i<partitionPoint; i++) {
            inLeft[i] = inorder[i];
        }

        System.out.println(inorder.length - (inLeft.length+1));
        int[] inRight = new int[inorder.length - (inLeft.length+1)];
        for (int i=partitionPoint+1; i<inorder.length; i++) {
            inRight[i-(partitionPoint+1)] = inorder[i];
        }

        root.left = this.buildTree(preLeft, inLeft);
        root.right = this.buildTree(preRight, inRight);

        return root;
    }
}
