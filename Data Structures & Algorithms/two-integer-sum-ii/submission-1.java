class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length - 1;

        while(p1<p2) {
            if(nums[p2] + nums[p1] > target) {
                p2--;
            } else if (nums[p2] + nums[p1] < target) {
                p1++;
            } else {
                break;
            }
        }
        int[] res = {p1+1, p2+1};
        return res;
    }
}
