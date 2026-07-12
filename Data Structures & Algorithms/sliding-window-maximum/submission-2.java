class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums.length <= 1) {
            return nums;
        }
        int L=0, R=1;
        int max = nums[0];

        while(R < k) {
            max = Math.max(max, nums[R]);
            R++;
        }
        
        while (R < nums.length) {
            result.add(max);

            if (nums[R] < max && nums[L] == max) {
                max = nums[L+1];
                for (int i=L+1; i<R; i++) {
                    max = Math.max(max, nums[i]);
                }
            }
            max = Math.max(max, nums[R]);
            R++;
            L++;
        }
        result.add(max);
        int[] ans = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
