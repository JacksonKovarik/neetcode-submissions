class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum = 0;
        int l=0, r=0;
        int count = 0;
        while (r < nums.length) {
            sum += nums[r];
            r++;
            if (r-l + 1 > k) {
                if ((sum/k) >= threshold) {
                    count++;
                }
                sum -= nums[l];
                l++;
            }
        }

        return count;
    }
}