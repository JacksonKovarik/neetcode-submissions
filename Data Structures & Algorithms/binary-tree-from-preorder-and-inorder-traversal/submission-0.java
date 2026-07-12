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
    private int preIdx = 0; // Preorder index
    private int inIdx = 0;  // Inorder index
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        // Identify the # of nodes in the left subtree
        int leftLen = 0;
        for(int i=0; i<inorder.length; i++){
            if(inorder[i] == root.val){
                leftLen = i;
                break;
            }
        }

        // Array for the values in the left subtree but in preorder
        int[] leftPre = new int[leftLen];

        // Array for the values in the left subtree but inorder
        int[] leftIn = new int[leftLen];

        int j = 0;
        for(int i=1; i<=leftLen; i++){
            leftPre[j] = preorder[i];
            j++;
        }
        j=0;
        for(int i=0; i<leftLen; i++){
            leftIn[j] = inorder[i];
            j++;
        }

        // build the left subtree
        root.left = buildTree(leftPre, leftIn);

        int[] rightPre = new int[preorder.length-(leftLen+1)];
        int[] rightIn = new int[inorder.length-(leftLen+1)];


        j = 0;
        for(int i=leftLen+1; i<preorder.length; i++){
            rightPre[j] = preorder[i];
            j++;
        }
        j = 0;
        for(int i=leftLen+1; i<inorder.length; i++){
            rightIn[j] = inorder[i];
            j++;
        }

        root.right = buildTree(rightPre, rightIn);

        return root;
    }


}
