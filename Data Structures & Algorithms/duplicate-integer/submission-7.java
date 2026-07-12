class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> q = new HashSet<>();
        for (int i : nums) {
            if (!q.add(i)) return true;
        }

        return false;
    }
}