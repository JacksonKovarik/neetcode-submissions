class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int e = numbers.length - 1;

        for(int i=0; i<e; i++){
            if(numbers[i]+numbers[e] > target){
                i--;
                e--;
            }else if(numbers[i]+numbers[e] == target){
                ans[0] = i+1;
                ans[1] = e+1;
                break;
            }
        }

        return ans;
    }
}
