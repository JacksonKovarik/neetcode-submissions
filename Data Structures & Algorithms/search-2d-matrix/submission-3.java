class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix[0].length;
        int colLen = matrix.length;
        int s=0;
        int e=rowLen*colLen - 1;

        while(s<=e){
            int m = (e+s)/2;
            if(matrix[m/rowLen][m%rowLen] < target){
                s = m+1;
            }else if(matrix[m/rowLen][m%rowLen] > target){
                e = m-1;
            }else{
                return true;
            }
        }

        return false;
    }
}
