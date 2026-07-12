class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int l = 0;
        int r = 0;

        while (r < k) {
            if (window.contains(nums[r])) {
                return true;
            }
            window.add(nums[r]);
            r++;
        }
        while (r < nums.length) {
            if (window.contains(nums[r])) {
                return true;
            }
            window.remove(nums[l]);
            l++;
            window.add(nums[r]);
            r++;
        }

        return false;
    }
}