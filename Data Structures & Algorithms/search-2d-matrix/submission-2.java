class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Pick the middle value of ALL arrays and run binary search
            // Left pointer at idx 0 and Right pointer at idx last
            // Mid pointer at middle
        
        int rowLen = matrix[0].length;
        int numOfRows = matrix.length;

        int L = 0; // First element pointer
        int R = rowLen*numOfRows-1; // Last element pointer

        while(L <= R){
            int mid = (R+L)/2; // Middle
            
            if(matrix[mid / rowLen][mid%rowLen]<target){
                L = mid+1;
            } else if(matrix[mid/rowLen][mid%rowLen]>target){
                R = mid-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
