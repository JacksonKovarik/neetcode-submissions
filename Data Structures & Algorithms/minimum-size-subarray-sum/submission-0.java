class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0;
        int min=0, currSum = 0;
        while (r < nums.length) {
            currSum += nums[r];
            r++;
            while (currSum >= target && l < r) {
                min = min==0 ? r-l : Math.min(min, r-l);
                currSum -= nums[l]; 
                l++;
            }
            // r++;
        }

        return min;
    }
}