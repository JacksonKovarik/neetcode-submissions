class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> q = new HashSet<>();
        for (int i : nums) {
            q.add(i);
        }

        return q.size() != nums.length;
    }
}